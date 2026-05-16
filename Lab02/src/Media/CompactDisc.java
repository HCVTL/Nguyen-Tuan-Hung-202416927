package Media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc(String artist, ArrayList<Track> tracks) {
        super();
        this.artist = artist;
        this.tracks = tracks;
    }

    public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
        super();
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.director = director;
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Already have track " + track.getTitle());
            return;
        }

        tracks.add(track);
    }

    public void removeTrack(Track track){
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Deleted track " + track.getTitle());
        }
        else {
            System.out.println("Track does not exist.");
        }
    }

    @Override
    public int getLength() {
        int sumLength = 0;
        for (Track track : tracks) {
            sumLength += track.getLength();
        }

        return sumLength;
    }

    public String getArtist() {
        return artist;
    }

    public void play() {
        for (Track track : tracks) {
            track.play();
        }
    }
}