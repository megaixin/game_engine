import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
	@Override
	public void paint(Graphics g){
		super.paint(g);    
		drawFullMap(g);
	} 
  
	//������ � ����������� ������
	public void drawCellDecart(Graphics g, int inX, int inY){//������ �������
      
		//������� �������
		g.setColor(Color.black);
		g.drawRect(inX, inY, 30, 30);
     
		//��������
		g.drawLine(inX+2, inY+2, inX+7, inY+2);//����� �������, �� ������� ����� ������ ������
		g.drawLine(inX+2, inY+2, inX+2, inY+7);//����� �������, �� ������� ����� ������ ����
	  
		g.drawLine(inX+2, inY+23, inX+2, inY+28);//����� ������� ��������, ����� ������ ����
		g.drawLine(inX+2, inY+28, inX+7, inY+28);//����� ������� ��������, ����� ����� �������
	   
		g.drawLine(inX+23, inY+2, inX+28, inY+2);//������ ������� ������� ������� ��������, ������� ����� ����� ������� 
		g.drawLine(inX+28, inY+2, inX+28, inY+7);//������ ������� ������� ��������, ������ ����� ������ ������
	   
		g.drawLine(inX+28, inY+23, inX+28, inY+28);//������ ������ �������, ����� ������ ���� 
		g.drawLine(inX+28, inY+28, inX+23, inY+28);//������ ������ �������, ����� ������ ������ 
	}
	public void drawStarDecart(Graphics g, int inX, int inY){//������ ����� ���������, �������� 
		int[] myXArr = {inX-2+6,   inX+20+6,   inX+2+7,    inX+9+6,  inX+16+6};  
		int[] myYArr = {inY+2+10,  inY+2+10,   inY+15+10,  inY-7+10, inY+15+10};
		g.setColor(Color.blue);
		g.fillPolygon(myXArr, myYArr, myXArr.length);	  
	} 
	public void drawCreatureDecart(Graphics g, int inX, int inY){ //������ ����� �������� �� �����, ������� �������
		g.setColor(Color.ORANGE);
		g.fillRect(inX+8, inY+8, 15, 15);
	}
   
	//������ � ����� �����������
	public void drawCell(Graphics g, int x, int y){//������ ������ � �������� �����
		drawCellDecart(g, 15+30*x, 15+30*y); 
	}	
	public void drawStar(Graphics g, int x, int y){//������ ������ ����� � �������� �����
		drawStarDecart(g, 15+30*x, 15+30*y);
	}
	public void drawCreature(Graphics g, int x, int y){//������ ����� � �������� �����
		drawCreatureDecart(g, 15+30*x, 15+30*y);
	}

	public void drawFullMap (Graphics g){//���� ����� ������ �������� ��� ����� ��������� ���� ������	
		
		//SqlExecutor.showResult(myRes);
		
		//������ ��������� ��������
		Point nowPoint = new Point (8,0); //������� ������� ����� �����  �� ����� 4,7.����� ������ ������ � ����� �������.
		Point nowDiff = new Point (-1, 0); //�������� ����� ���� �����, �� ���� x+0, �-1 
		
		ArrayList<ArrayList<ArrayList<String>>> myRes = 
				SqlExecutor.executeQuery(
						"SELECT * FROM Magnus.dbo.Creature_Map WHERE change_type = '�����������' ORDER BY point ASC");						 
				SqlExecutor.executeQuery(
				"SELECT * FROM Magnus.dbo.Creature_Map WHERE change_param = '�����������' ORDER BY point ASC");

		//System.out.println ("���������� ����� repaint - " + new java.util.Date().toString()   );
	   
		for (int i = 0; i < 28 ; i++){ //��� �������  ����� �� 0 �� 28
			//������ ������� ����� 
			drawCell(g, nowPoint.x , nowPoint.y);
			
			//���������, ����� �������
			if ( i ==   Integer.valueOf(   myRes.get(0).get(2).get(0)    )    ){ //�������� � 2 ������ ��� 0 � 1 - �������� ������				
				//��������� ������� �����������
				String nowTurn =  myRes.get(0).get(2).get(2);
				String nowParam = myRes.get(1).get(2).get(2);
				
				//������ �������� �� ��, ��� ����	
				if (  nowTurn.equals("�����") ){					
					nowDiff.x = 0; 
					nowDiff.y = -1; 
				}
				if (  nowTurn.equals("����") ){				
					nowDiff.x = 0; 
					nowDiff.y = 1; 
				}
				
				if (  nowTurn.equals("�����") ){					
					nowDiff.x = -1; 
					nowDiff.y = 0; 
				}
				if (  nowTurn.equals("������") ){				
					nowDiff.x = 1; 
					nowDiff.y = 0; 
				}	
				if (  nowParam.equals("���") ){				
					g.setColor(Color.GREEN);
				}
				
				//������� ����� ������, �� ���� �� ��������� ��� ������ ������, ������ ��������� ��������� �������
				//��� �������, ���� �� ������������, ���� ����������
				if (myRes.get(0).size() > 3){
					myRes.get(0).remove(2);
				}
			}
			//������� �����
			nowPoint.x = nowPoint.x + nowDiff.x;
			nowPoint.y = nowPoint.y + nowDiff.y;
		}		
	}
}

//�������� ������ ��� ������������ ��������� �� ���� ��������� � ����������� ��������������� ��������� ������������ ������.
// ������ ������� �����
//���� ����� ����� ��� "���" - ������ ������ ������� ������
//���� ����� ����� ��� "����" - ������ ���������� � �����.

//






