import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class myPanel {
	public static void main (String[] args){
  
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 400 ,450);
        frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 5, 350, 400);
		panel.setBackground(java.awt.Color.GRAY);
		panel.setLayout(null);
		
		JButton button = new JButton("Meow");
		button.setBounds(130, 10, 70, 40);
		button.setLayout(null);
		
		myDrawingPanel playWindow = new myDrawingPanel();
		playWindow.setBounds (24, 70, 300, 300);
		playWindow.setBackground(java.awt.Color.LIGHT_GRAY);
          
		frame.add(panel);
		panel.add(button);
		panel.add(playWindow);
    
		frame.setVisible(true);
		panel.setVisible(true);
		button.setVisible(true);
		
	
	}
}

