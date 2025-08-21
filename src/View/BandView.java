package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BandView extends JFrame {

    private JButton button;

    public BandView() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        this.setTitle("Bandgenerator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        button = new JButton("Generate!");
        this.add(button);
        this.pack();
        this.setVisible(true);

    }

    public void addButtonListener(ActionListener l) {
        button.addActionListener(l);
    }

    public void updateUI(String instruments) {
        JLabel label = new JLabel("This Band consists of: " + instruments);
        this.add(label);
    }

}
