/* In this exercise, you will add more features into the VideoFile class that you wrote in the previous assignment. 
The idea is to parse the given file name (in constructor) to a record, which is a private member of the class.

You need to have record Metadata, which declaration should be the following and declared in its own Java file.

record Metadata(String author, String name, String fileType)
Have the following member variables in the VideoFile class:

private Metadata videoFileData
private String fileName;
Add the following constructor to parse the given parameter:

public VideoFile(String videoFileName) {

}
The parameter contains a string as Ludwig van Beethoven - Ode an die Freude.mp4, which you should parse so that you have "Ludwig van Beethoven" as author, "Ode an die Freude" as the name and "mp4" as the fileType filled in the member record.

To parse the parameter string, look up the method split() in the String class. Here also the JDK class java.util.regex.Pattern could also be very useful.

Finally, add getter for the video file metadata:

public Metadata getVideoFileData() {

}
Note that you should not change the previous implementation of the Playable interface in this class. */
package oamk.stream;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VideoFile implements Playable {

    private Metadata videoFileData;
    private String fileName;

    public VideoFile(String videoFileName) {
        this.fileName = videoFileName;

        String regex = "(.+) - (.+)\\.(\\w+)$";
        Matcher matcher = Pattern.compile(regex).matcher(videoFileName);

        if (matcher.find()) {
            String author = matcher.group(1).trim();
            String name = matcher.group(2).trim();
            String fileType = matcher.group(3).trim();

            this.videoFileData = new Metadata(author, name, fileType);
        } else {
            throw new IllegalArgumentException("ERROR");
        }
    }

    @Override
    public String play() {
        return "Playing video: " + fileName;
    }

    @Override
    public String stop() {
        return "Stopping video: " + fileName;
    }

    @Override
    public String pause(Integer time) {
        return "Pausing video at " + time + " seconds.";
    }

    public Metadata getVideoFileData() {
        return videoFileData;
    }
}
