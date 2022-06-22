public class C3 extends C2{

    public C3() {
        at1 = 0;
        setAt2(0);
        setAt3(0);
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    public C3(int at1, int at2, int at3) {
        super(at1,2,3);

        this.at1 = at1;
        setAt2(at2);
        setAt3(at3);
        System.out.println("Classe C3: chamada do construtor padrao, com parametros");

        c2at1 = 19;
        c2at2 = 19;
        c2at3 = 19;

    }


    public int c3at1;

    private int c3at2;

    protected int c3at3;



}
