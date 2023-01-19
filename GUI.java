import java.awt.BorderLayout;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI implements ActionListener{
    int count = 0;
    private JLabel label;
    private JLabel label2;
    private JFrame frame;
    private JPanel panel;
    private JButton questionA;
    private JButton button;
    private JButton questionB;
    public GUI(){
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("3");
        questionA = new JButton("4");
        questionB = new JButton("5");
        button.addActionListener(this);
        questionA.addActionListener(this);
        questionB.addActionListener(this);
        
        label2 = new JLabel("What is 2+2");
        label = new JLabel("Score :");

       
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(questionA);
        panel.add(questionB);
        panel.add(label2);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] arg) {
        new GUI();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==questionA){
            count ++;
        }
        else{
            count --;
        }
        label.setText("Score: "+ count);

    }
}