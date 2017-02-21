package MP3Player;

import java.util.ArrayList;
import java.util.List;

public interface MP3Player {

    /**
     * Rozpocznij odtwarzanie
     * od utworu znajdującego się na szczycie listy
     * utworów lub nie rób nic gdy lista jest pusta.
     */
    public void play();

    /**
     * Wstrzymaj odtwarzanie. Odtwarzanie będzie
     * później wznowione od tego miejsca.
     */
    public void pause();

    /**
     * Zatrzymajmodtwarzanie. Bieżący utwór pozostaje
     * na szczycie listy, ale odtwarzanie zostanie
     * wznowione od jego początku.
     */
    public void stop();

    /** Zwraca liczbę sekund od początku
     * bieżącego utworu.
     */
    public double currentPosition();


    /**
     * Zwraca nazwę odtwarzanego pliku.
     */
    public String currentSong();

    /**
     * Przechodzi do następnego utworu na liście
     * i rozpoczyna jego odtwarzanie.
     */
    public void next();

    /**
     * Wraca do poprzedniego utworu na liście
     * i rozpoczyna jego odtwarzanie.
     */
    public void prev();

    /**
     * Zwraca true gdy odtwarzany jest utwór.
     */
    public boolean isPlaying();

    /**
     * Ładuje pliki na listę utworów.
     */
    public void loadSongs(List<String> names);
}

