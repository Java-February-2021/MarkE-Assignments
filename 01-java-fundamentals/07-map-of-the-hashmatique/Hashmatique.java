import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

        public void hashTest() {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Some song", "blah blah blah");
        trackList.put("Some other song", "How do we generate random text");
        trackList.put("Yet another song", "Give me faker API");
        trackList.put("Here we go again", "grrrrrrrrrr");
        String lyrics = trackList.get("Some song");
        System.out.println(lyrics);
        Set<String> tracks = trackList.keySet();
        for (String track : tracks) {
            String key = track.toString();
            String value = trackList.get(track).toString();
            System.out.println(key + ":" + value);
        }
    }
}