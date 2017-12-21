import java.awt.BorderLayout;
import java.awt.Dimension;
import java. BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class myPanel {
  
    JFrame frame = new JFrame();
    frame.setSize(100,100);
       
    JPanel panel = new JPanel();
    panel.setSize(90,90);
          
    frame.add(panel);
    
	frame.setVisible(true);
    panel.setVisible(true);

}