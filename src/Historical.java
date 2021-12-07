public class Historical extends Movie {

    private String period;
    private int correspondToLevel;

    public Historical() {
        super();
        this.period = "Period 1";
        this.correspondToLevel = 1;
    }

    public Historical(String period, String director, int length) {
        super(director, length);
        super.setAudience(2500);
        this.period = period;
        this.correspondToLevel = 2;
    }

    public Historical(String director, int length, int audience, String period, int correspondToLevel) {
        super(director, length, audience);
        this.period = period;
        this.correspondToLevel = correspondToLevel;
    }

    @Override
    public String title() {
        return "Historical Movie Title";
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getCorrespondToLevel() {
        return correspondToLevel;
    }

    public void setCorrespondToLevel(int correspondToLevel) {
        this.correspondToLevel = correspondToLevel;
    }
}
