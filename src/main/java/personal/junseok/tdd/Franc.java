package personal.junseok.tdd;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Money(super.amount * multiplier, super.currency);
    }
}
