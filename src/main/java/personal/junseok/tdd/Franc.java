package personal.junseok.tdd;

public class Franc extends Money {

    public Franc(int amount) {
        super.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(super.amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Franc franc = (Franc) object;
        return super.amount == franc.amount;
    }
}
