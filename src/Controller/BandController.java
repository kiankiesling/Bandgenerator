package Controller;

import java.awt.event.*;
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
        view.updateUI(view.getKeyTextField().getText());
    }

    public void onTempoTextField() {
        view.updateUI(view.getTempoTextField().getText());
    }
}
