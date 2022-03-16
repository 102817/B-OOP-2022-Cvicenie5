package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Zviera> zveri = new ArrayList<>(List.of(new Pes("Dunčo"), new Macka("Murko")));

        Map<String, String> hlavneMesta = new HashMap<>();
        hlavneMesta.put("Slovensko", "Bratislava");
        hlavneMesta.put("Cesko", "Praha");
        hlavneMesta.put("Polsko", "Varsava");
        hlavneMesta.put("Madarsko", "Budapest");

        System.out.println(hlavneMesta.size());
        System.out.println("---");
        if (hlavneMesta.containsKey("Slovensko")) {
            hlavneMesta.remove("Slovensko");
        }

        for (String kluc : hlavneMesta.keySet()) {
            System.out.println(kluc);
            System.out.println(hlavneMesta.get(kluc));
        }
        System.out.println("---");
        for (String hodnota : hlavneMesta.values()) {
            System.out.println(hodnota);
        }
        System.out.println("---");
        System.out.println(hlavneMesta);
        hlavneMesta.clear();
        System.out.println(hlavneMesta);


    }
}
