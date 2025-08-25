package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BandView extends JFrame {

    private JButton button;
    private JLabel BandLabel = new JLabel("Click the generate button, then fill out the form!");
    private JLabel SongKeyLabel = new JLabel("");
    private JLabel SongTempoLabel = new JLabel("");
    private JLabel SongNumberOfChordsLabel = new JLabel("");
    private JLabel SongDescriptionLabel = new JLabel("");
    private JTextField songKeyTextField;
    private JTextField songTempoInBpmTextField;
    private JTextField songNumberOfChordsTextField;
    private JTextField songDescriptionTextField = new JTextField("Description");
    private PopupFactory popupFactory = new PopupFactory();

    public BandView() {
        setLayout(new GridBagLayout());
        this.setTitle("Bandgenerator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        button = new JButton("Generate!");
        songKeyTextField = new JTextField("key");
        songTempoInBpmTextField = new JTextField("BPM");
        songNumberOfChordsTextField = new JTextField("amount of chords");
        this.add(button);
        this.add(BandLabel);
        this.add(SongKeyLabel);
        this.add(SongTempoLabel);
        this.add(SongNumberOfChordsLabel);
        this.add(SongDescriptionLabel);
        this.add(songKeyTextField);
        this.add(songTempoInBpmTextField);
        this.add(songNumberOfChordsTextField);
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

    public JTextField getSongNumberOfChordsTextField() {
        return songNumberOfChordsTextField;
    }

    public JTextField getSongDescriptionTextField() {
        return songDescriptionTextField;
    }

    public void updateUI(String genre) {
        // Popup p = popupFactory.getPopup("You suck", rootPane, EXIT_ON_CLOSE, ABORT);
        // p.show();
        BandLabel.setText("You are in a " + genre + " Band! ");
    }

    public void updateSongBpmUI(String bpm) {
        SongTempoLabel.setText("at " + bpm + " BPM. ");
    }

    public void updateSongKeyUI(String key) {
        SongKeyLabel.setText("We play a song in the key of " + key + " ");
    }

    public void updateNumberOfChordsUI(String numberOfChordsString) {

        SongNumberOfChordsLabel.setText("It has " + numberOfChordsString + " Chords. ");
    }

    public void updateSongDescriptionUI(String description) {
        SongDescriptionLabel.setText(description);
    }

}
