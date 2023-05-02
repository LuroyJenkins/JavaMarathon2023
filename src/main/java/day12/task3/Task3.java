package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("AC/DC", 1973);
        MusicBand band2 = new MusicBand("Prodigy", 1990);
        MusicBand band3 = new MusicBand("Rammstein", 1994);
        MusicBand band4 = new MusicBand("Arctic Monkeys", 2002);
        MusicBand band5 = new MusicBand("Скриптонит", 2015);
        MusicBand band6 = new MusicBand("The Beatles", 1960);
        MusicBand band7 = new MusicBand("Queen", 1970);
        MusicBand band8 = new MusicBand("Gorillaz", 1998);
        MusicBand band9 = new MusicBand("NWA", 1986);
        MusicBand band10 = new MusicBand("Каспийский груз", 2000);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);
        System.out.println(groupsAfter2000(musicBands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band: bands) {
            if(band.getYear() >= 2000)
                groupsAfter2000.add(band);
        }

        return groupsAfter2000;
    }
}
