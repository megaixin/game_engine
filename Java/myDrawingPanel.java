import java.awt.Graphics;
import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
  
  @Override
  public void paint(Graphics g){
    super.paint(g);
     toDrawQuadrate(g, 40, 20);
    //toDrawQuadrate(g, 35, 21);
    //toDrawQuadrate(g, 3, 20);
  
  }

   
 //����������������� (��� ����������������, ��� ���������������){
  public void toDrawQuadrate (Graphics g, int atopDist, int sideDist){

    g.drawLine(20, atopDist, 20, sideDist);// 20, 40, 20, 20
    // 1(�1) - �����-���������  ����� �������, �� ���� ������ (��. �����); 
    //(�2)(atopDist) -  ������ ���� ���������� �� ���� ������ (��. �����);
    //(�3) - ������ ����� �� ����� �1-�2 ���� �� ������ (��. �����);
    //(�4)(sideDist) - �����-��������� �����-������� �� ��� ������ � ������� ��������� ������ ����� ����� (��.�����)
    
    
    //g.drawLine(atopDist, sideDist, atopDist, sideDist);
    //g.drawLine(10, atopDist, 15, sideDist);
   }

}	

//�������� ������ ����� ���������.