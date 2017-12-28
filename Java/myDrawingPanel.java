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

   
 //нарисовать вадрат (инт рассто€ние—верху, инт рассто€ние—боку){
  public void toDrawQuadrate (Graphics g, int atopDist, int sideDist){

    g.drawLine(20, atopDist, 20, sideDist);
    // 10 - точка-дистанци€ (є1) слева направо, от кра€ панели (см. доску); 
    //60(atopDist) - рисовка линии идет от точки є 1 вниз (и чуть вбок) достига€ точки 60 (или иной указанной) на панели (см. доску);
    //это и есть перва€ нарисованна€ лини€.
    //25 - Ќ≈ длинна линии ; а точка в кторой идет завершение линии є2, а потому дл€ квадрата ей будет подходить то же число что и точке є1
    //g.drawLine(atopDist, sideDist, atopDist, sideDist);
    //g.drawLine(10, atopDist, 15, sideDist);
   }

}	

// почему нарисованна€ лини€ така€ коротка? (?)
//при изменении третьего числа в аргументах лини€ уклон€етс€ но там не столько сколько указываетс€ в агрументе, 
//число вообще не совпадает ни с одним внесенным числом в аргументы