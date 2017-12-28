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

   
 //нарисовать вадрат (инт рассто€ние—верху, инт рассто€ние—боку){
  public void toDrawQuadrate (Graphics g, int atopDist, int sideDist){

    g.drawLine(20, atopDist, 20, sideDist);// 20, 40, 20, 20
    // 1(є1) - точка-дистанци€  слева направо, от кра€ панели (см. доску); 
    //(є2)(atopDist) -  сверху вниз рассто€ние от кра€ панели (см. доску);
    //(є3) - длинна линии от точки є1-є2 вниз по панели (см. доску);
    //(є4)(sideDist) - точка-дистанци€ слева-направо от кра панели в которую упираетс€ нижн€€ точка линии (см.доску)
    
    
    //g.drawLine(atopDist, sideDist, atopDist, sideDist);
    //g.drawLine(10, atopDist, 15, sideDist);
   }

}	

//описание первой линии завершено.