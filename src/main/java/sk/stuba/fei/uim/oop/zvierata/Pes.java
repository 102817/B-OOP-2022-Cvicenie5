package sk.stuba.fei.uim.oop.zvierata;

public class Pes extends Zviera {

    public Pes(String meno) {
        super(meno);
    }

    @Override
    public void zvukZvierata() {
        System.out.println("hau hau");
    }

    @Override
    public int compareTo(Zviera o) {
        return 0;
    }
}
