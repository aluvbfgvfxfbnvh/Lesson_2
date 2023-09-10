public class chamomile extends Plant implements Printable {
    private boolean isEven;

    public chamomile(int oxygen, boolean isEven) {
        super(oxygen);
        this.isEven = isEven;
    }

    public boolean isEven() {
        return isEven;
    }

    @Override
    public void print() {
        System.out.println("Количество лепестков четное?: " + isEven + "\nВыработка кислорада: " + getOxygen());
        System.out.println("--------------------------------------");
    }
}