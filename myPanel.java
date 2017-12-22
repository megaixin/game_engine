import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class myPanel {
	public static void main (String[] args){
  
		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 200 ,300);
        frame.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 200, 300);
		panel.setLayout(null);
		
		JButton button = new JButton();
		button.setBounds(1, 1, 30, 50);
		button.setLayout(null);
          
		frame.add(panel);
		panel.add(button);
    
		frame.setVisible(true);
		panel.setVisible(true);
		button.setVisible(true);
		
	}
}