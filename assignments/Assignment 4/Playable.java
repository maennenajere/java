package exercises;

/* First, create the interface Playable with the following:

Method String play().

Method String pause(Integer seconds).

Method String stop().

Then create class VideoFile that implements the above interface.

The classes should have public static attribute fileName, which is the name of file to be played.

Assuming the filename is Sash! - La Primavera.mp4, the implemented methods should return the following:

Play: Playing videofile Sash! - La Primavera.mp4.

Pause: Videofile Sash! - La Primavera.mp4 paused for 10 seconds, when pause method has parameter value 10.

Stop: Videofile Sash! - La Primavera.mp4 stopped

This exercise is quite simple for now but we'll extend this code later, when we learn about Stream API.. */
public interface Playable {

    String play();

    String pause(Integer seconds);

    String stop();
}
