import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IncrementClicker implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JButton button;
    private static JLabel label;

    /**
     * 
     */
    public IncrementClicker() {

        panel = new JPanel();
        frame = new JFrame();
        button = new JButton("Click me");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: " + count);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // frame.setSize(800,2000);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);
    }

    int count = 0;

    public static void main(String[] args) throws Exception {
        new IncrementClicker();
        // System.out.println("Hello, World!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        count++;

        label.setText("Number of clicks: " + count);
    }
}
