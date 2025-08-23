package Model;

public class JazzBand implements Band {

    private String instruments;

    public JazzBand() {
        setInstruments("Piano, Drums, Upright Bass, Saxophone");
    }

    public String getInstruments() {
        return instruments;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }
}
