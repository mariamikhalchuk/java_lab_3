public class Animation extends Movie {
    private String artist;
    private String style;

    public Animation() {
        super();
        this.artist = "Artist 1";
        this.style = "Style 1";
    }

    public Animation(String artist, String director, int length) {
        super(director, length);
        super.setAudience(2500);
        this.artist = artist;
        this.style = "Style 2";
    }

    public Animation(String director, int length, int audience, String artist, String style) {
        super(director, length, audience);
        this.artist = artist;
        this.style = style;
    }

    @Override
    public String title() {
        return "Animation Movie Title";
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
