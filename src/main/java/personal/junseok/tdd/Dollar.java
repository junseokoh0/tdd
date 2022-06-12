package personal.junseok.tdd;

public class Dollar extends Money {

    public final String currency;

    public Dollar(int amount) {
        super.amount = amount;
        currency = "USD";
    }

    public Money times(int multiplier) {
        return new Dollar(super.amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }

}
