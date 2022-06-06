package personal.junseok.tdd;

public class Dollar extends Money {

    public Dollar(int amount) {
        super.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(super.amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return super.amount == dollar.amount;
    }
}
