package Controller;

import Model.Band;
import View.BandView;

public class BandController {

    private Band model;
    private BandView view;

    public BandController(Band model, BandView view) {
        this.model = model;
        this.view = view;
    }

    public void setInstruments(String instruments) {

        model.setInstruments(instruments);
    }

    public void updateView() {
        view.updateUI(model.getInstruments());
    }
}
