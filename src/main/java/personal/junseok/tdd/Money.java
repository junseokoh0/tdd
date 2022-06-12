package personal.junseok.tdd;

public class Money {
    protected int amount;
    public String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && getClass().equals(money.getClass());
    }

    public String currency() {
        return this.currency;
    }

    public Money times(int amount) {
        return null;
    }

}
