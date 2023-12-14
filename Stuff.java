public class Stuff {
    // instance variables
    private int value;

    // constructor
    public Stuff(int value) {
        this.value = value;
    }

    // getter/setter methods
    public int getValue() {
        return value;
    }

    // public methods
    public void printAddAmount(int amt) {
        int value = amt;
        value += amt;
        value += 5;
        System.out.println(value);
    }

    public void printAmountMystery(int value) {
        int mystery = value - 6;
        System.out.println(mystery);
    }
}
