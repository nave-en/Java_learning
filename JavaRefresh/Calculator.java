public class Calculator {
    public int no1;
    public int no2;
    public static int counter;

    public static int accessVariable() {
        return counter;
    }
    Calculator(int no1, int no2) {
        counter++;
        this.no1 = no1;
        this.no2 = no2;
    }

    public int getNo1() {
        return this.no1;
    }

    public int getNo2() {
        return this.no2;
    }

    public int add() {
        return this.no1 + this.no2;
    }

    public int sub() {
        return this.no1 - this.no2;
    }

    public int mul() {
        return this.no1 * this.no2;
    }

    public int div() {
        return this.no1 / this.no2;
    }
}
