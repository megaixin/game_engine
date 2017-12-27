import java.awt.Graphics;
import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
	
	
	 @Override
		public void paint(Graphics g){
			super.paint(g);
			g.drawLine(3, 15, 25, 34);
	 }
}			

