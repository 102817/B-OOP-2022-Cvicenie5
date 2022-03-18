package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> auta = new ArrayList<>();
        auta.add("Volvo");
        auta.add("BMW");
        auta.add("VM");
        auta.add("Audi");

        auta.forEach(s -> {
            if (Objects.equals(s, "BMW")){
                System.out.println("Auto ktore nema smerovku");
            }
        });
    }
}
