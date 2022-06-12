package personal.junseok.tdd;

public class Franc extends Money {

    public final String currency;

    public Franc(int amount) {
        super.amount = amount;
        currency = "CHF";
    }

    public Money times(int multiplier) {
        return new Franc(super.amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }

}
