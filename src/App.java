
import Controller.BandController;
import Model.Band;
import View.BandView;

public class App {
    public static void main(String[] args) throws Exception {
        Band band = new Band();
        BandView view = new BandView();
        BandController controller = new BandController(band, view);
        controller.setInstruments("Guitar, Drums, Bass, Vocals");
        System.out.println(band.getInstruments());

    }
}
