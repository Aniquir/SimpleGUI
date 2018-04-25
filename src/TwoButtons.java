import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.doWork();
    }

    public void doWork(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonLabel = new JButton("Change label");
        buttonLabel.addActionListener(new LabelListener());

        JButton buttonColor = new JButton("Change color");
        buttonColor.addActionListener(new ColorListener());

        label = new JLabel("This is label");
        MyGraphicPanel panel = new MyGraphicPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, buttonColor);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.EAST, buttonLabel);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(400,300);
        frame.setVisible(true);
    }

    private class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Auuuuuu!");
        }
    }

    private class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}
