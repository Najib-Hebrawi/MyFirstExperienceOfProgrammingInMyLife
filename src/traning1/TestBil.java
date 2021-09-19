package traning1;

public class TestBil { public static void main(String[] args) {

    Bil b1;
    Hjul vf,hf,vb,hb;

    hf = new Hjul(15, 2.1f);
    vf = new Hjul(15, 2.1f);
    vb = new Hjul(15, 2.2f);
    hb = new Hjul(15, 2.2f);

    b1 = new Bil("Audi", "A3", vf, hf, vb, hb);

    System.out.println(b1);
// alternativt kan hjul objekterne oprettes "on the fly"
    b1 = new Bil("Audi", "A3", new Hjul(15,2.1f),
            new Hjul(15,2.1f),
            new Hjul(15,2.2f),
            new Hjul(15,2.2f));


}
}



