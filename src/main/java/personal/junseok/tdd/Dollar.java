package personal.junseok.tdd;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int time) {
        this.amount = this.amount * time;
    }
}
