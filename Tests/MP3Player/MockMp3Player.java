package MP3Player;

import java.util.List;

public class MockMp3Player implements MP3Player {

    private boolean isPlaying;
    private double currentPosition;

    public MockMp3Player() {
        isPlaying = false;
        currentPosition = 0;
    }

    @Override
    public void play() {
        isPlaying = true;
        currentPosition += 0.1;
    }

    @Override
    public void pause() {
        isPlaying = false;
    }

    @Override
    public void stop() {
        isPlaying = false;
        currentPosition = 0;
    }

    @Override
    public double currentPosition() {
        return 0;
    }

    @Override
    public String currentSong() {
        return null;
    }

    @Override
    public void next() {

    }

    @Override
    public void prev() {

    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public void loadSongs(List<String> names) {

    }
}
