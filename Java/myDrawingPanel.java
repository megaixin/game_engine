import java.awt.Graphics;
import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
  
  @Override
  public void paint(Graphics g){
    super.paint(g);

    toDrawQuadrate(g, 15, 30);
    toDrawHero (g, 15, 30);
  }
  
  public void toDrawQuadrate(Graphics g, int inX, int inY){//������ �������
      
	 //������� �������
	 g.drawLine(inX, inY, inX+30, inY);
	 g.drawLine(inX+30, inY, inX+30, inY+30);
	  
	 g.drawLine(inX+30, inY+30, inX, inY+30);
     g.drawLine(inX, inY+30, inX, inY);
	  
	 g.drawLine(inX+2, inY+2, inX+7, inY+2);//����� �������, �� ������� ����� ������ ������
	 g.drawLine(inX+2, inY+2, inX+2, inY+7);//����� �������, �� ������� ����� ������ ����
	  
	 g.drawLine(inX+2, inY+23, inX+2, inY+28);//����� ������� ��������, ����� ������ ����
	 g.drawLine(inX+2, inY+28, inX+7, inY+28);//����� ������� ��������, ����� ����� �������
	   
	 g.drawLine(inX+23, inY+2, inX+28, inY+2);//������ ������� ������� ������� ��������, ������� ����� ����� ������� 
	 g.drawLine(inX+28, inY+2, inX+28, inY+7);//������ ������� ������� ��������, ������ ����� ������ ������
	   
	 g.drawLine(inX+28, inY+23, inX+28, inY+28);//������ ������ �������, ����� ������ ���� 
	 g.drawLine(inX+28, inY+28, inX+23, inY+28);//������ ������ �������, ����� ������ ������ 
  }
	 
	 
	  public void toDrawHero(Graphics g, int inX, int inY){//������ ����� ���������
		  int[] myXArr = {inX-2,   inX+20,     inX+2,        inX+9,  inX+16};  
	      int[] myYArr = {inY+2, inY+2,      inY+15,       inY-7,   inY+15};
	      g.fillPolygon(myXArr, myYArr, myXArr.length);	  
	  } 	 

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}


