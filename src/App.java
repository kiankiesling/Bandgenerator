
import Controller.BandController;
import Model.RockBand;
import View.BandView;

public class App {
    public static void main(String[] args) throws Exception {
        RockBand band = new RockBand();
        BandView view = new BandView();
        BandController controller = new BandController(band, view);
        System.out.println(band.getInstruments());

    }
}
