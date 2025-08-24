package Model;

public class Song {
    private String songKey;
    private int tempoInBpm;
    private int lengthInSeconds;
    private String songDescription;

    public Song(String songKey, int tempoInBpm, int lengthInSeconds, String songDescription) {
        this.songKey = songKey;
        this.tempoInBpm = tempoInBpm;
        this.lengthInSeconds = lengthInSeconds;
        this.songDescription = songDescription;
    }

    public void setSongKey(String songKey) {
        this.songKey = songKey;
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
