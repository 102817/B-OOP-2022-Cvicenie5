package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zveri = new ArrayList<>(List.of(new Pes("Dunčo"), new Macka("Murko")));

        Set<String> auta = new HashSet<>();
        auta.add("Volvo");
        auta.add("BMW");
        auta.add("VW");
        auta.add("Audi");
        auta.add("Volvo");
        auta.add("BMW");

        System.out.println(auta);
        System.out.println(auta.size());

        if (auta.contains("Volvo")) {
            auta.remove("Volvo");
        }

        List<String> auta2 = new ArrayList<>(List.of("Volvo", "BMW"));
        System.out.println(auta);
        auta.removeAll(auta2);

        System.out.println(auta);
        auta.clear();
    }
}
