import java.awt.Graphics;
import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
	
	
	 @Override
		public void paint(Graphics g){
			super.paint(g);
			g.drawLine(3, 20, 20, 20);
	        g.drawLine(21, 20, 21, 35);
	        g.drawLine(3, 35, 21, 35);
	        g.drawLine(3, 35, 3, 20);
			
			//����� ����� ����� ������, � �������: g.toDrawQuadrate(); (?)
	 }

	 
	 //����������������� ( ��� ����������������, ��� ���������������){
	 public static void toDrawQuadrate (int atopDist, int sideDist){
		    
		 //��� ����� ����� ������� ����� ����� ������� ��� ������ ��������?
		 //� ���� ������ ���� ����� �����?
		 // ��� ����������� ��� �����?
		 
		 //� ��� ��� ������� ��������� ��������
		 //� ������ �����
		 // � �������� ���� ����� �� paint
		 
	 }
}
		

