public class tree extends Plant implements Printable {
    private String type;

    public tree(int oxygen, String type) {
        super(oxygen);
        this.type = type;
    }

    public String getName() {
        return type;
    }

    @Override
    public void print() {
        System.out.println("Вид дерево: " + type + "\nВыработка кислорада: " + getOxygen());
        System.out.println("--------------------------------------");
    }
}
