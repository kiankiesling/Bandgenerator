package Model;

public class Song {
    private String songKey;
    private int numberOfChords;
    private int tempoInBpm;
    private int lengthInSeconds;
    private String songDescription;

    public Song(String songKey, int numberOfChords, int tempoInBpm, int lengthInSeconds, String songDescription) {
        this.songKey = songKey;
        this.numberOfChords = numberOfChords;
        this.tempoInBpm = tempoInBpm;
        this.lengthInSeconds = lengthInSeconds;
        this.songDescription = songDescription;
    }

    public void setSongKey(String songKey) {
        this.songKey = songKey;
    }

    public void setNumberOfChords(int numberOfChords) {
        this.numberOfChords = numberOfChords;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    public void setSongDescription(String songDescription) {
        this.songDescription = songDescription;
    }

    public void setTempoInBpm(int tempoInBpm) {
        this.tempoInBpm = tempoInBpm;
    }

    public int getNumberOfChords() {
        return numberOfChords;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getSongDescription() {
        return songDescription;
    }

    public String getSongKey() {
        return songKey;
    }

    public int getSongTempoInBpm() {
        return tempoInBpm;
    }
}
