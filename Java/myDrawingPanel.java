import java.awt.Graphics;
import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
  
  @Override
  public void paint(Graphics g){
    super.paint(g);
     toDrawQuadrate(g, 20, 20);
    // toDrawQuadrate(g, 35, 21);
    //toDrawQuadrate(g, 3, 20);
  
  }

   
 //����������������� (��� ����������������, ��� ���������������){
  public void toDrawQuadrate (Graphics g, int atopDist, int sideDist){

    g.drawLine(10, atopDist, 15, sideDist);
    // 10 - ��������� ����� �������, �� ���� ������; 
    //20(atopDist) - ����-� �� ����� ������ � ����;
    //15 - ������ ����� ���� �� ����� 10; 20 - ����� � ������� ����� ��������� ������� ����� 15
    //g.drawLine(atopDist, sideDist, atopDist, sideDist);
    //g.drawLine(10, atopDist, 15, sideDist);
   }

}	

//������ �� ���? ������ ��� ���� ������ � ����� �������� ������������� (?)
