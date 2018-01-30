import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

public class myDrawingPanel extends JPanel{
	@Override
	public void paint(Graphics g){
		super.paint(g);    
		drawFullMap(g);
	} 
  
	//рисуем в координатах панели
	public void drawCellDecart(Graphics g, int inX, int inY){//рисуем квадрат
      
		//базовый квадрат
		g.setColor(Color.black);
		g.drawRect(inX, inY, 30, 30);
     
		//детальки
		g.drawLine(inX+2, inY+2, inX+7, inY+2);//левая сторона, от базовой точки прямая вправо
		g.drawLine(inX+2, inY+2, inX+2, inY+7);//левая сторона, от базовой точки прямая вниз
	  
		g.drawLine(inX+2, inY+23, inX+2, inY+28);//левая сторона квадрата, линия сверху вниз
		g.drawLine(inX+2, inY+28, inX+7, inY+28);//левая сторона квадрата, линия слева направо
	   
		g.drawLine(inX+23, inY+2, inX+28, inY+2);//правая верхняя сторона сторона квадрата, верхняя линия слева направо 
		g.drawLine(inX+28, inY+2, inX+28, inY+7);//правая верхняя сторона квадрата, нижняя линия справа налево
	   
		g.drawLine(inX+28, inY+23, inX+28, inY+28);//правая нижняя сторона, линия сверху вниз 
		g.drawLine(inX+28, inY+28, inX+23, inY+28);//правая нижняя сторона, линия справа налево 
	}
	public void drawStarDecart(Graphics g, int inX, int inY){//рисуем метку персонажа, звёздочку 
		int[] myXArr = {inX-2+6,   inX+20+6,   inX+2+7,    inX+9+6,  inX+16+6};  
		int[] myYArr = {inY+2+10,  inY+2+10,   inY+15+10,  inY-7+10, inY+15+10};
		g.setColor(Color.blue);
		g.fillPolygon(myXArr, myYArr, myXArr.length);	  
	} 
	public void drawCreatureDecart(Graphics g, int inX, int inY){ //рисуем метку существа на карте, цветной квадрат
		g.setColor(Color.ORANGE);
		g.fillRect(inX+8, inY+8, 15, 15);
	}
   
	//рисуем в наших координатах
	public void drawCell(Graphics g, int x, int y){//рисуем клетку в заданном месте
		drawCellDecart(g, 15+30*x, 15+30*y); 
	}	
	public void drawStar(Graphics g, int x, int y){//рисуем звезду героя в заданном месте
		drawStarDecart(g, 15+30*x, 15+30*y);
	}
	public void drawCreature(Graphics g, int x, int y){//рисуем отряд в заданном месте
		drawCreatureDecart(g, 15+30*x, 15+30*y);
	}

	public void drawFullMap (Graphics g){//этот метод должен рисовать всю карту используя базы данных	
		
		//SqlExecutor.showResult(myRes);
		
		//задаем стартовые значения
		Point nowPoint = new Point (8,0); //текущая позиция будет точка  на карте 4,7.Поинт хранит обьект с двумя точками.
		Point nowDiff = new Point (-1, 0); //смещение будет идти вверх, то есть x+0, у-1 
		
		ArrayList<ArrayList<ArrayList<String>>> myRes = 
				SqlExecutor.executeQuery(
						"SELECT * FROM Magnus.dbo.Creature_Map WHERE change_type = 'Направление' ORDER BY point ASC");						 
				SqlExecutor.executeQuery(
				"SELECT * FROM Magnus.dbo.Creature_Map WHERE change_param = 'Направление' ORDER BY point ASC");

		//System.out.println ("Вызывается метод repaint - " + new java.util.Date().toString()   );
	   
		for (int i = 0; i < 28 ; i++){ //для каждого  числа от 0 до 28
			//рисуем текущую точку 
			drawCell(g, nowPoint.x , nowPoint.y);
			
			//проверяем, вдруг поворот
			if ( i ==   Integer.valueOf(   myRes.get(0).get(2).get(0)    )    ){ //начинаем с 2 потому что 0 и 1 - название данных				
				//вычисляем текущее направление
				String nowTurn =  myRes.get(0).get(2).get(2);
				String nowParam = myRes.get(1).get(2).get(2);
				
				//меняем смещение на то, что есть	
				if (  nowTurn.equals("Вверх") ){					
					nowDiff.x = 0; 
					nowDiff.y = -1; 
				}
				if (  nowTurn.equals("Вниз") ){				
					nowDiff.x = 0; 
					nowDiff.y = 1; 
				}
				
				if (  nowTurn.equals("Влево") ){					
					nowDiff.x = -1; 
					nowDiff.y = 0; 
				}
				if (  nowTurn.equals("Вправо") ){				
					nowDiff.x = 1; 
					nowDiff.y = 0; 
				}	
				if (  nowParam.equals("Лес") ){				
					g.setColor(Color.GREEN);
				}
				
				//удаляем нахой строку, но чтоб не вафлилось при пустом списке, всегда оставляем последний элемент
				//это костыль, надо бы переработать, чтоб покрасивее
				if (myRes.get(0).size() > 3){
					myRes.get(0).remove(2);
				}
			}
			//смещаем точку
			nowPoint.x = nowPoint.x + nowDiff.x;
			nowPoint.y = nowPoint.y + nowDiff.y;
		}		
	}
}

//написать логику для распознавани местности по типу местности и закрашивать соответствующую местность определенным цветом.
// рисуем текущую точку
//если точка имеет тип "лес" - клетку рисуем зеленым цветом
//если точка имеет тип "вода" - клетку окрашиваем в синий.

//






