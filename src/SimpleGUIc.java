import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUIc implements ActionListener{

    JFrame frame;

    public static void main(String[] args) {
        SimpleGUIc apGUI = new SimpleGUIc();
        apGUI.toWork();
    }

    public void toWork(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("change the color");
        button.addActionListener(this);

        MyGraphicPanel graphicPanel = new MyGraphicPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, graphicPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}
