import java.awt.Graphics;
import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
  
  
  @Override
  public void paint(Graphics g){
    super.paint(g);
    toDrawQuadrate(g, 20, 20);
  }

   
   //����������������� ( ��� ����������������, ��� ���������������){
  public void toDrawQuadrate (Graphics g, int atopDist, int sideDist){

	  
    g.drawLine(3, 20, atopDist, sideDist);
    //g.drawLine(21, 20, 21, 35);
    //g.drawLine(3, 35, 21, 35);
    //g.drawLine(3, 35, 3, 20);
     
   }
}	



//� ��� �������� ��������� Graphics g?
//���� ����� ������ ����� ����� ������ ����-������������ ����� �� ������
//�������� ��� ��� ��� ��� ��������