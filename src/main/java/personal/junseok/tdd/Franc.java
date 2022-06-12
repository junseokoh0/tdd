package personal.junseok.tdd;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super.amount = amount;
        super.currency = currency;
    }

    public Money times(int multiplier) {
        return new Franc(super.amount * multiplier, null);
    }
}
