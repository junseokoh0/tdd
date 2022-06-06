package personal.junseok.tdd;

public class Dollar extends Money {

    public Dollar(int amount) {
        super.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(super.amount * multiplier);
    }

}
