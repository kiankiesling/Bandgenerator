package Controller;

import java.awt.event.*;
import Model.Band;
import View.BandView;

public class BandController implements ActionListener {

    private Band model;
    private BandView view;

    public BandController(Band model, BandView view) {
        this.model = model;
        this.view = view;
        this.view.addButtonListener(this);
    }

    public void setInstruments(String instruments) {

        model.setInstruments(instruments);
    }

    public void updateView() {
        view.updateUI(model.getInstruments());
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println("HELL YEAH");
        view.updateUI(model.getInstruments());
    }
}
