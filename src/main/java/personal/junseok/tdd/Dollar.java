package personal.junseok.tdd;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        this.amount *= multiplier;
        return null;
    }
}
