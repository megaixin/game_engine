import java.awt.Graphics;
import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
  
  @Override
  public void paint(Graphics g){
    super.paint(g);
     toDrawQuadrate(g, 40, 20);
    // toDrawQuadrate(g, 35, 21);
    //toDrawQuadrate(g, 3, 20);
  
  }

   
 //����������������� (��� ����������������, ��� ���������������){
  public void toDrawQuadrate (Graphics g, int atopDist, int sideDist){

    g.drawLine(20, atopDist, 20, sideDist);
    // 10 - �����-��������� (�1) ����� �������, �� ���� ������ (��. �����); 
    //60(atopDist) - ������� ����� ���� �� ����� � 1 ���� (� ���� ����) �������� ����� 60 (��� ���� ���������) �� ������ (��. �����);
    //��� � ���� ������ ������������ �����.
    //25 - �� ������ ����� ; � ����� � ������ ���� ���������� ����� �2, � ������ ��� �������� �� ����� ��������� �� �� ����� ��� � ����� �1
    //g.drawLine(atopDist, sideDist, atopDist, sideDist);
    //g.drawLine(10, atopDist, 15, sideDist);
   }

}	

// ������ ������������ ����� ����� �������? (?)
//��� ��������� �������� ����� � ���������� ����� ���������� �� ��� �� ������� ������� ����������� � ���������, 
//����� ������ �� ��������� �� � ����� ��������� ������ � ���������