package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members = new ArrayList<>();
        members.add("Pol");
        members.add("Tom");
        members.add("Bill");

        List<String> members1 = new ArrayList<>();
        members1.add("Joel");
        members1.add("Francis");
        members1.add("Nikita");

        MusicBand band1 = new MusicBand("AC/DC", 1973, members);
        MusicBand band2 = new MusicBand("Led Zeppelin", 1986, members1);
        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();

    }
}
