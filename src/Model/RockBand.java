package Model;

public class RockBand implements Band {

    private String instruments;

    public RockBand() {
        setInstruments("Guitar, Drums, Bass, Vocals");
    }

    public String getInstruments() {
        return instruments;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }

}
