
import java.util.Random;

import Controller.BandController;
import Model.*;
import View.BandView;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        System.out.println("Random No: " + randomNumber);
        Band band = null;
        BandView view = new BandView();
        switch (randomNumber) {
            case 0:
                band = new DoomBand();
                break;
            case 1:
                band = new RockBand();
                break;
            case 2:
                band = new JazzBand();
                break;
        }
        ;
        BandController controller = new BandController(band, view);
        System.out.println(band.getInstruments());

    }
}
