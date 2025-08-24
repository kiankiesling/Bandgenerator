package Controller;

import Model.*;
import View.BandView;

public class BandController {

    private Band model;
    private BandView view;

    public BandController(Band model, BandView view) {
        this.model = model;
        this.view = view;
        this.view.getButton().addActionListener(e -> onButton());
        this.view.getTempoTextField().addActionListener(e -> onTempoTextField());
        this.view.getKeyTextField().addActionListener(e -> onKeyTextField());
        this.view.getSongDescriptionTextField().addActionListener(e -> onDescriptionTextArea());
        this.view.getSongNumberOfChordsTextField().addActionListener(e -> onNumberOfChordsTextArea());
    }

    public void setInstruments(String instruments) {

        model.setInstruments(instruments);
    }

    public void updateView() {
        view.updateUI(model.getInstruments());
    }

    public void onButton() {
        System.out.println("HELL YEAH");
        view.updateUI(model.getGenre());
    }

    public void onKeyTextField() {
        model.getSong().setSongKey(view.getKeyTextField().getText());
        view.updateSongKeyUI(model.getSong().getSongKey());
    }

    public void onTempoTextField() {
        try {
            int tempoInInt = Integer.parseInt(view.getTempoTextField().getText());
            model.getSong().setTempoInBpm(tempoInInt);
            view.updateSongBpmUI(Integer.toString(model.getSong().getSongTempoInBpm()));
        } catch (NumberFormatException e) {
            view.updateSongBpmUI("ERROR");
        }
    }

    public void onNumberOfChordsTextArea() {
        try {
            int NumberOfChordsInt = Integer.parseInt(view.getSongNumberOfChordsTextField().getText());
            model.getSong().setNumberOfChords(NumberOfChordsInt);
            view.updateNumberOfChordsUI(Integer.toString(model.getSong().getNumberOfChords()));
        } catch (NumberFormatException e) {
            view.updateNumberOfChordsUI("ERROR");
        }
    }

    public void onDescriptionTextArea() {
        model.getSong().setSongDescription(view.getSongDescriptionTextField().getText());
        view.updateSongDescriptionUI(model.getSong().getSongDescription());
    }
}
