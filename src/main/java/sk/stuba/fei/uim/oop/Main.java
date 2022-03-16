package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zveri = new ArrayList<>(List.of(new Pes("Dunčo"), new Macka("Murko"),
                new Pes("Luna"), new Macka("Garfield")));
        System.out.println(zveri);
        zveri.sort(null);
        System.out.println(zveri);
    }
}
