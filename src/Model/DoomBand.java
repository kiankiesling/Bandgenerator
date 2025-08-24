package Model;

public class DoomBand implements Band {

    private String instruments;
    private Song song;
    private String genre;

    public DoomBand() {
        setInstruments("Guitar, Drums, Bass, Vocals");
        song = new Song("idk", 0, 0, 0, "IDK");
        setGenre("Stoner Doom");
    }

    public String getInstruments() {
        return instruments;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public Song getSong() {
        return song;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }

}
