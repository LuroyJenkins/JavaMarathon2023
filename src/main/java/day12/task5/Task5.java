package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members = new ArrayList<>();
        members.add(new MusicArtist("Pol", 36));
        members.add(new MusicArtist("Tom", 40));
        members.add(new MusicArtist("Bill", 41));

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Joel", 23));
        members1.add(new MusicArtist("Francis", 27));
        members1.add(new MusicArtist("Nikita", 19));

        MusicBand band1 = new MusicBand("AC/DC", 1973, members);
        MusicBand band2 = new MusicBand("Led Zeppelin", 1986, members1);
        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
