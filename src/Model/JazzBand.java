package Model;

public class JazzBand implements Band {

    private String instruments;
    private Song song;
    private String genre;

    public JazzBand() {
        setInstruments("Piano, Drums, Upright Bass, Saxophone");
        song = new Song("idk", 0, 0, 0, "IDK");
        setGenre("Jazz");
    }

    public String getInstruments() {
        return instruments;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Song getSong() {
        return song;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }
}
