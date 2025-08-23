
import Controller.BandController;
import Model.*;
import View.BandView;

public class App {
    public static void main(String[] args) throws Exception {
        Band band = new JazzBand();
        BandView view = new BandView();
        BandController controller = new BandController(band, view);
        System.out.println(band.getInstruments());

    }
}
