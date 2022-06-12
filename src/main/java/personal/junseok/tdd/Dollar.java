package personal.junseok.tdd;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super.amount = amount;
        super.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.dollar(super.amount * multiplier);
    }

}
