import java.awt.BorderLayout;
import java.awt.*;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI {
    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("yes");
        
        JLabel label = new JLabel("Score :");


        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(2,2));
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.setVisible(true);
    }
    public static void main(String[] arg) {
        new GUI();
    }
}