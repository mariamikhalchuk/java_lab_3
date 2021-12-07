public class Movie {

    private String director;
    private int length;
    private int audience;

    public Movie() {
        this.director = "Default Director";
        this.length = 120;
        this.audience = 1000;
    }

    public Movie(String director, int length) {
        this.director = director;
        this.length = length;
        this.audience = 2000;
    }

    public Movie(String director, int length, int audience) {
        this.director = director;
        this.length = length;
        this.audience = audience;
    }

    public String title() {
        return "Abstract Movie Title";
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAudience() {
        return audience;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }
}
