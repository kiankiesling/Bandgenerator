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
    }

    public void setInstruments(String instruments) {

        model.setInstruments(instruments);
    }

    public void updateView() {
        view.updateUI(model.getInstruments());
    }

    public void onButton() {
        System.out.println("HELL YEAH");
        view.updateUI(model.getInstruments());
    }

    public void onKeyTextField() {
        model.getSong().setSongKey(view.getKeyTextField().getText());
        view.updateSongBpmUI(model.getSong().getSongKey());
    }

    public void onTempoTextField() {
        try {
            int tempoInInt = Integer.parseInt(view.getTempoTextField().getText());
            model.getSong().setTempoInBpm(tempoInInt);

            System.out.println("HIER STEHTS!" + Integer.toString(model.getSong().getSongTempoInBpm()));
            view.updateSongBpmUI(Integer.toString(model.getSong().getSongTempoInBpm()));
        } catch (NumberFormatException e) {
            view.updateSongBpmUI("ERROR");
        }
    }
}
