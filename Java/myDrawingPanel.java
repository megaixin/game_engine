import java.awt.Graphics;
import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
  
  @Override
  public void paint(Graphics g){
    super.paint(g);
    //toDrawQuadrate(g, 20, 20);
    //toDrawQuadrate(g, 20, 20);
    //toDrawQuadrate(g, 21, 35);
    //toDrawQuadrate(g, 3, 20);
    toDrawLine (g, 5, 5);
  
  }

   
  /* //нарисовать вадрат (инт рассто€ние—верху, инт рассто€ние—боку){
  public void toDrawQuadrate (Graphics g, int atopDist, int sideDist){

	  
    g.drawLine(atopDist, sideDist, atopDist, sideDist);
    g.drawLine(atopDist, sideDist, atopDist, sideDist);
    g.drawLine(atopDist, sideDist, atopDist, sideDist);
    g.drawLine(atopDist, sideDist, atopDist, sideDist);
     
   }
*/
  public void toDrawLine(Graphics g, int top, int left){

	  g.drawLine(5, top, 5, left);
	  
	 }



}	


