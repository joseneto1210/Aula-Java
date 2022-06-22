public class C2 extends C1 {

    public C2() {
        at1 = 0;
        setAt2(0);
        setAt3(0);
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    public C2(int c1at1, int c1at2, int c1at3,int at1, int at2, int at3 ) {
        super(c1at1,c1at2,c1at3);

        this.at1 = at1;
        setAt2(at2);
        setAt3(at3);
        System.out.println("Classe C3: chamada do construtor padrao, com parametros");
    }



    public int c2at1;

    private int c2at2;

    protected int c2at3;

}
