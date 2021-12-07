public class Musical extends Movie {

    private String instrument;
    private int songsCount;

    public Musical() {
        super();
        this.instrument = "Instrument 1";
        this.songsCount = 10;
    }

    public Musical(String instrument, String director, int length) {
        super(director, length);
        super.setAudience(2500);
        this.instrument = instrument;
        this.songsCount = 20;
    }

    public Musical(String director, int length, int audience, String instrument, int songsCount) {
        super(director, length, audience);
        this.instrument = instrument;
        this.songsCount =  songsCount;
    }

    @Override
    public String title() {
        return "Musical Movie Title";
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getSongsCount() {
        return songsCount;
    }

    public void setSongsCount(int songsCount) {
        this.songsCount = songsCount;
    }
}
