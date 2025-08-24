package Model;

public class JazzBand implements Band {

    private String instruments;
    private Song song;

    public JazzBand() {
        setInstruments("Piano, Drums, Upright Bass, Saxophone");
        song = new Song("idk", 0, 0, "IDK");
    }

    public String getInstruments() {
        return instruments;
    }

    public Song getSong() {
        return song;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }
}
