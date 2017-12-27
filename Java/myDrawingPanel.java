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
			
			//здесь будет вызов метода, к примеру: g.toDrawQuadrate(); (?)
	 }

	 
	 //нарисовать вадрат ( инт рассто€ние—верху, инт рассто€ние—боку){
	 public static void toDrawQuadrate (int atopDist, int sideDist){
		    
		 //что здесь нужно сделать чтобы метод рисовал две линиии квадрата?
		 //в теле метода тоже нужен пейнт?
		 // как состыковать две линии?
		 
		 //и вот тут ебошить рисование квадрата
		 //в нужном месте
		 // а вызывать этот метод из paint
		 
	 }
}
		

