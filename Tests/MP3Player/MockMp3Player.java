package MP3Player;

import java.util.List;

public class MockMp3Player implements MP3Player {

    private boolean isPlaying;
    private double currentPosition;
    private int currentSong;
    private List<String> songList;

    public MockMp3Player() {
        isPlaying = false;
        currentPosition = 0;
        currentSong = 0;
    }

    @Override
    public void play() {
        if (songList != null){
            isPlaying = true;
            currentPosition += 0.1;
        }
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
        return currentPosition;
    }

    @Override
    public String currentSong() {
        return songList.get(currentSong);
    }

    @Override
    public void next() {
        if (currentSong < songList.size() - 1)
            currentSong++;
    }

    @Override
    public void prev() {
        if (currentSong != 0)
            currentSong--;
    }

    @Override
    public boolean isPlaying() {
        return isPlaying;
    }

    @Override
    public void loadSongs(List<String> names) {
        songList = names;
    }
}
