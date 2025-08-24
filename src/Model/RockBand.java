package Model;

public class RockBand implements Band {

    private String instruments;
    private Song song;
    private String genre;

    public RockBand() {
        setInstruments("Guitar, Drums, Bass, Vocals");
        song = new Song("idk", 0, 0, 0, "IDK");
        setGenre("Rock");
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
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
