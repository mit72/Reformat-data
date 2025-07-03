public class Metadata{
    private String trackURI;
    private String trackName;
    private String albumName;
    private String artistNames;
    private String releaseDate;
    private int duration;
    private int popularity;
    private boolean explicit;
    private String addedBy;
    private String addedAt;
    private String genres;
    private String recordLabel;
    private double danceability;
    private double energy;
    private int key;
    private double loudness;
    private int mode;
    private double speechiness;
    private double acousticness;
    private double instrumentalness;
    private double liveness;
    private double valance;
    private double tempo;
    private int timeSignature;

    public Metadata(String trackURI,String trackName, String albumName, String artistNames, String releaseDate, int duration, int popularity, boolean explicit, String addedBy, String addedAt, String genres, String recordLabel, double danceability, double energy, int key, double loudness, int mode, double speechiness, double acousticness, double instrumentalness, double liveness, double valance, double tempo, int timeSignature){
        this.trackURI = trackURI;
        this.trackName = trackName;
        this.albumName = albumName;
        this.artistNames = artistNames;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.popularity = popularity;
        this.explicit = explicit;
        this.addedBy = addedBy;
        this.addedAt = addedAt;
        this.genres = genres;
        this.recordLabel= recordLabel;
        this.danceability = danceability;
        
    }

    public Metadata(){

    }

}