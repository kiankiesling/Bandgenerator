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

}
