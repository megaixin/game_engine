import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class myPanel {
	public static void main (String[] args){
  
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 202 ,270);
        frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 25, 175, 180);
		panel.setLayout(null);
		
		JButton button = new JButton("Пуск");
		button.setBounds(50, 70, 70, 40);
		button.setLayout(null);
          
		frame.add(panel);
		panel.add(button);
    
		frame.setVisible(true);
		panel.setVisible(true);
		button.setVisible(true);
	}
}