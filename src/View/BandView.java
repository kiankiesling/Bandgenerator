package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BandView extends JFrame {

    private JButton button;
    private JLabel label = new JLabel("This Band consists of: ");

    public BandView() {
        setLayout(new GridBagLayout());
        this.setTitle("Bandgenerator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        button = new JButton("Generate!");
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);

    }

    public void addButtonListener(ActionListener l) {
        button.addActionListener(l);
    }

    public void updateUI(String instruments) {
        label.setText("This Band consists of: " + instruments);
    }

}
