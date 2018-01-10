import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.util.ArrayList;

public class myPanel {
	public static void main (String[] args){
  
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 302 ,370);
        frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 25, 275, 280);
		panel.setBackground(java.awt.Color.GRAY);
		panel.setLayout(null);
		
		JButton button = new JButton("Пуск");
		button.setBounds(10, 12, 70, 40);
		button.setLayout(null);
		
		myDrawingPanel playWindow = new myDrawingPanel();
		playWindow.setBounds (90, 90, 175, 180);
		playWindow.setBackground(java.awt.Color.LIGHT_GRAY);
          
		frame.add(panel);
		panel.add(button);
		panel.add(playWindow);
    
		frame.setVisible(true);
		panel.setVisible(true);
		button.setVisible(true);
		
		ArrayList<ArrayList<ArrayList<String>>> myRes = SqlExecutor.executeQuery(
				"SELECT name FROM Magnus.dbo.Creature_Creature");
		
		//SqlExecutor.showResult(myRes);

		//System.out.println("");
		//System.out.println("");
		//System.out.println("");
		
		
		//System.out.println(myRes.get(0).get(2).get(0));
		
	}
}