package Model;

public class DoomBand implements Band {

    private String instruments;
    private Song song;

    public DoomBand() {
        setInstruments("Guitar, Drums, Bass, Vocals");
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
