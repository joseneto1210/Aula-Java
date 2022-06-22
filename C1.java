public class C1 {

    public C1() {
        at1 = 0;
        setAt2(0);
        setAt3(0);
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    public C1(int at1, int at2, int at3) {

        this.at1 = at1;
        setAt2(at2);
        setAt3(at3);
        System.out.println("Classe C1: chamada do construtor padrao, com parametros");
    }

    public int getAt2() {
        return at2;
    }

    public void setAt2(int at2) {
        this.at2 = at2;
    }

    public int getAt3() {
        return at3;
    }

    public void setAt3(int at3) {
        this.at3 = at3;
    }


    public int at1;

    private int at2;

    protected int at3;

}
