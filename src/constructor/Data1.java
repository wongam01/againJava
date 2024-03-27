package constructor;

public class Data1 {
    int values1;
}

class Data2 {
    int value;

    Data2(int x) {
        value = x;
    }

    public Data2() {

    }
}

class constructor {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2();
    }
}