import java.awt.Graphics;
import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
  
  @Override
  public void paint(Graphics g){
    super.paint(g);
    toDrawQuadrate(g, 35, 30);
    toDrawChest(g, 80, 40);
  }

  public void toDrawQuadrate(Graphics g, int inX, int inY){

	    g.drawLine(inX, inY, inX+30, inY);
	    g.drawLine(inX+30, inY, inX+30, inY+30);
	    g.drawLine(inX+30, inY+30, inX, inY+30);
	    g.drawLine(inX, inY+30, inX, inY);  
   
	    g.drawLine(inX+2, inY+2, inX+28, inY+2);
	    g.drawLine(inX+28, inY+2, inX+28, inY+28);
	    g.drawLine(inX+28, inY+28, inX+2, inY+28);
	    g.drawLine(inX+2, inY+2, inX+2, inY+28); 
	    
	    g.drawLine(inX, inY+15, inX+15, inY);
		g.drawLine(inX+15, inY, inX+30, inY+15);  
		g.drawLine(inX+30, inY+15, inX+15, inY+30);
		g.drawLine(inX+15, inY+30, inX, inY+15);
  }

  public void toDrawChest(Graphics g, int inX, int inY){
	  g.drawLine(inX, inY, inX+20, inY);
	  g.drawLine(inX+20, inY, inX+20, inY+16);
	  g.drawLine(inX+20, inY+15, inX, inY+15);
	  g.drawLine(inX, inY+16, inX, inY);
	  
	  g.drawLine(inX+2, inY+2, inX+18, inY+2);
	  g.drawLine(inX+18, inY+2, inX+18, inY+13);
	  g.drawLine(inX+18, inY+13, inX+2, inY+13);
	  g.drawLine(inX+2, inY+13, inX+2, inY+2);
	  
	  g.drawLine(inX, inY, inX+3, inY-3);
	  g.drawLine(inX+3, inY-3, inX+17, inY-3);
	  g.drawLine(inX+17, inY-3, inX+20, inY);
	  g.drawOval(inX+8, inY+7, inX-76, inY-38);
	  
}


  public void toDrawDoor(Graphics g, int inX, int inY){
	  //g.drawLine(inX, inY, inX+5, inY-5);
	  //g.drawLine(inX, inY, inX+5, inY-5);

  }


}	
