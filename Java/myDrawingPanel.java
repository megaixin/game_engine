import java.awt.Graphics;
import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
  
  @Override
  public void paint(Graphics g){
    super.paint(g);

    toDrawQuadrate(g, 15, 30);
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
	   
      //��������� ������������ �����
	  //g.drawLine(inX+27, inY-27, inX+5, inY+10);//������� ���, ����� ������� ����� �����
	  //g.drawLine(inX+28, inY+28, inX+23, inY+28);//������� ���, ������ ������� ������ ����
	  
  }
}