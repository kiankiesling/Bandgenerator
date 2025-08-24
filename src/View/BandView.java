package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BandView extends JFrame {

    private JButton button;
    private JLabel BandLabel = new JLabel("This Band consists of: ");
    private JTextField songKeyTextField;
    private JTextField songTempoInBpmTextField;

    public BandView() {
        setLayout(new GridBagLayout());
        this.setTitle("Bandgenerator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        button = new JButton("Generate!");
        songKeyTextField = new JTextField("key");
        songTempoInBpmTextField = new JTextField("BPM");
        this.add(button);
        this.add(BandLabel);
        this.add(songKeyTextField);
        this.add(songTempoInBpmTextField);
        this.pack();
        this.setVisible(true);

    }

    // public void addButtonListener(ActionListener l) {
    // button.addActionListener(l);
    // }

    public JButton getButton() {
        return button;
    }

    public JTextField getTempoTextField() {
        return songTempoInBpmTextField;
    }

    public JTextField getKeyTextField() {
        return songKeyTextField;
    }

    // public void addSongKeyListener(ActionListener l) {
    // songKeyTextField.addActionListener(l);
    // }

    // public void addSongTempoListener(ActionListener l) {
    // songTempoInBpmTextField.addActionListener(l);
    // }

    public void updateUI(String instruments) {
        BandLabel.setText("This Band consists of: " + instruments);
    }

}
