package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BandView extends JFrame {

    private JButton button;
    private JLabel BandLabel = new JLabel("This Band consists of: ");
    private JLabel SongKeyLabel = new JLabel("");
    private JLabel SongTempoLabel = new JLabel("");
    private JLabel SongDescriptionLabel = new JLabel("");
    private JTextField songKeyTextField;
    private JTextField songTempoInBpmTextField;
    private JTextField songDescriptionTextField = new JTextField("Description");

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
        this.add(SongKeyLabel);
        this.add(SongTempoLabel);
        this.add(SongDescriptionLabel);
        this.add(songKeyTextField);
        this.add(songTempoInBpmTextField);
        this.add(songDescriptionTextField);
        this.pack();
        this.setVisible(true);

    }

    public JButton getButton() {
        return button;
    }

    public JTextField getTempoTextField() {
        return songTempoInBpmTextField;
    }

    public JTextField getKeyTextField() {
        return songKeyTextField;
    }

    public JTextField getSongDescriptionTextField() {
        return songDescriptionTextField;
    }

    public void updateUI(String instruments) {
        BandLabel.setText("This Band consists of: " + instruments);
    }

    public void updateSongBpmUI(String bpm) {
        SongTempoLabel.setText("At " + bpm + " BPM");
    }

    public void updateSongKeyUI(String key) {
        SongKeyLabel.setText("We play a song in the key of " + key + " ");
    }

    public void updateSongDescriptionUI(String description) {
        SongDescriptionLabel.setText(description);
    }

}
