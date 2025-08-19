package View;

import javax.swing.*;

public class BandView extends JFrame {

    public BandView() {
        this.setTitle("Bandgenerator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public void updateUI(String instruments) {
        JLabel label = new JLabel("This Band consists of: " + instruments);
        this.add(label);
    }
}
