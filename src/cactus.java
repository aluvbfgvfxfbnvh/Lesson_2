public class cactus extends Plant implements Printable {
    private int age;

    public cactus(int oxygen, int age) {
        super(oxygen);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void print() {
        System.out.println("Возрост кактуса: " + age + "\nВыработка кислорада: " + getOxygen());
        System.out.println("--------------------------------------");
    }
}
