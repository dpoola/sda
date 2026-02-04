public class BadStyleClass {

    int AVALUE, bvalue = 0;

    public BadStyleClass() {
        AVALUE = 1;
        bvalue = 1;
    }

    public int add1(int x, int y) {
        if (x < 6) return x + y;
        return 0;
    }

    public int add2(int x, int y) {
        int myVariable = y;
        for (int i = 0; i < myVariable; i++) {
            x += 1;
        }
        return x;
    }


}


