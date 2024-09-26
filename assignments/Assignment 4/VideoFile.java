package exercises;

public class VideoFile implements Playable {

    public static String fileName = "Sash! - La Primavera.mp4";

    @Override
    public String play() {
        return "Playing videofile: " + fileName;
    }

    @Override
    public String pause(Integer seconds) {
        return "Videofile " + fileName + " paused for " + seconds + " seconds";
    }

    @Override
    public String stop() {
        return "Videofile " + fileName + " stopped";
    }
}
