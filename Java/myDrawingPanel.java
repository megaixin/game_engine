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

   
 //нарисовать вадрат (инт рассто€ние—верху, инт рассто€ние—боку){
  public void toDrawQuadrate (Graphics g, int atopDist, int sideDist){

    g.drawLine(10, atopDist, 15, sideDist);
    // 10 - дистанци€ слева направо, от кра€ панели; 
    //20(atopDist) - дист-€ от верха панели и вниз;
    //15 - длинна линии вниз от точки 10; 20 - точка в которой будет завершено ведение линии 15
    //g.drawLine(atopDist, sideDist, atopDist, sideDist);
    //g.drawLine(10, atopDist, 15, sideDist);
   }

}	

//почему их две? потому что одна запись о линии рисуетс€ полуквадратом (?)
