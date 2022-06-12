package personal.junseok.tdd;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Dollar(super.amount * multiplier, super.currency);
    }

}
