package personal.junseok.tdd;

public class Franc extends Money {

    public Franc(int amount) {
        super.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(super.amount * multiplier);
    }

}
