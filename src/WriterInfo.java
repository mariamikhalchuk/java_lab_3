public class WriterInfo {

    public static void main(String[] args) {

        Animation animationMovie1 = new Animation();
        Animation animationMovie2 = new Animation("new Artist 2", "Animation Director 1", 200);
        Animation animationMovie3 = new Animation("Animation Director 2", 220, 25000, "new Artist 3", "new Style");
        Historical historicalMovie1 = new Historical();
        Historical historicalMovie2 = new Historical("new Period 2", "Historical Director", 300);
        Historical historicalMovie3 = new Historical("Historical Director", 330, 35000, "new Period 3", 22);
        Musical musicalMovie1 = new Musical();
        Musical musicalMovie2 = new Musical("new Instrument 2", "Musical Director", 400);
        Musical musicalMovie3 = new Musical("Musical Director", 440, 35000, "new Instrument 3", 33);

        System.out.println("animationMovie1: " + "Director: " + animationMovie1.getDirector() + " Length: " + animationMovie1.getLength() + " Audience: " + animationMovie1.getAudience() + " Artist: " + animationMovie1.getArtist() + " Style: " + animationMovie1.getStyle());
        System.out.println("animationMovie2: " + "Director: " + animationMovie2.getDirector() + " Length: " + animationMovie2.getLength() + " Audience: " + animationMovie2.getAudience() + " Artist: " + animationMovie2.getArtist() + " Style: " + animationMovie2.getStyle());
        System.out.println("animationMovie3: " + "Director: " + animationMovie3.getDirector() + " Length: " + animationMovie3.getLength() + " Audience: " + animationMovie3.getAudience() + " Artist: " + animationMovie3.getArtist() + " Style: " + animationMovie3.getStyle());

        System.out.println("historicalMovie1: " + "Director: " + historicalMovie1.getDirector() + " Length: " + historicalMovie1.getLength() + " Audience: " + historicalMovie1.getAudience() + " Period: " + historicalMovie1.getPeriod() + " Level: " + historicalMovie1.getCorrespondToLevel());
        System.out.println("historicalMovie2: " + "Director: " + historicalMovie2.getDirector() + " Length: " + historicalMovie2.getLength() + " Audience: " + historicalMovie2.getAudience() + " Period: " + historicalMovie2.getPeriod() + " Level: " + historicalMovie2.getCorrespondToLevel());
        System.out.println("historicalMovie3: " + "Director: " + historicalMovie3.getDirector() + " Length: " + historicalMovie3.getLength() + " Audience: " + historicalMovie3.getAudience() + " Period: " + historicalMovie3.getPeriod() + " Level: " + historicalMovie3.getCorrespondToLevel());

        System.out.println("musicalMovie1: " + "Director: " + musicalMovie1.getDirector() + " Length: " + musicalMovie1.getLength() + " Audience: " + musicalMovie1.getAudience() + " Instrument: " + musicalMovie1.getInstrument() + " Song count: " + musicalMovie1.getSongsCount());
        System.out.println("musicalMovie2: " + "Director: " + musicalMovie2.getDirector() + " Length: " + musicalMovie2.getLength() + " Audience: " + musicalMovie2.getAudience() + " Instrument: " + musicalMovie2.getInstrument() + " Song count: " + musicalMovie2.getSongsCount());
        System.out.println("musicalMovie3: " + "Director: " + musicalMovie3.getDirector() + " Length: " + musicalMovie3.getLength() + " Audience: " + musicalMovie3.getAudience() + " Instrument: " + musicalMovie3.getInstrument() + " Song count: " + musicalMovie3.getSongsCount());
    }
}
