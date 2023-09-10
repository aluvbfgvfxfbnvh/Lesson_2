public abstract class Plant implements Printable {
    private int oxygen;

    public Plant(int oxygen) {
        this.oxygen = oxygen;
    }

    public int getOxygen() {
        return oxygen;
    }
}