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
        this.energy = energy;
        this.key = key;
        this.loudness = loudness;
        this.mode = mode;
        this.speechiness = speechiness;
        this.acousticness = acousticness;
        this.instrumentalness = instrumentalness;
        this.liveness = liveness;
        this.valance = valance;
        this.tempo = tempo;
        this.timeSignature = timeSignature;
    }

    public Metadata(){

    }

    public String getTrackURI() {
        return trackURI;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistNames() {
        return artistNames;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public int getPopularity() {
        return popularity;
    }

    public boolean getExplicit(){
        return explicit;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getAddedAt() {
        return addedAt;
    }

    public String getGenres() {
        return genres;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public double getDanceability() {
        return danceability;
    }

    public double getEnergy() {
        return energy;
    }

    public int getKey() {
        return key;
    }

    public double getLoudness() {
        return loudness;
    }

    public int getMode() {
        return mode;
    }

    public double getSpeechiness() {
        return speechiness;
    }

    public double getAcousticness() {
        return acousticness;
    }

    public double getInstrumentalness() {
        return instrumentalness;
    }

    public double getLiveness() {
        return liveness;
    }

    public double getValance() {
        return valance;
    }

    public double getTempo() {
        return tempo;
    }

    public int getTimeSignature() {
        return timeSignature;
    }

    public void setTrackURI(String trackURI) {
        this.trackURI = trackURI;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setArtistNames(String artistNames) {
        this.artistNames = artistNames;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public void setAddedAt(String addedAt) {
        this.addedAt = addedAt;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }

    public void setDanceability(double danceability) {
        this.danceability = danceability;
    }
    
    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setLoudness(double loudness) {
        this.loudness = loudness;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public void setSpeechiness(double speechiness) {
        this.speechiness = speechiness;
    }

    public void setAcousticness(double acousticness) {
        this.acousticness = acousticness;
    }

    public void setInstrumentalness(double instrumentalness) {
        this.instrumentalness = instrumentalness;
    }

    public void setLiveness(double liveness) {
        this.liveness = liveness;
    }

    public void setValance(double valance) {
        this.valance = valance;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public void setTimeSignature(int timeSignature) {
        this.timeSignature = timeSignature;
    }
}