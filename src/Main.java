public class Main {
    public static void main(String[] args) {
        ttBox();
        nnBox();
    }

    public static void ttBox() {

        MagicBox<String> textBox = new MagicBox<>(3);

        textBox.add("HFJHSJFJ");
        textBox.add("SMDSDASL");
        textBox.add("HIWIIIIW");
        textBox.add("ZZZZZZZZ");
        textBox.pick();
    }

    public static void nnBox() {
        MagicBox<Integer> numBox = new MagicBox<>(3);
        numBox.add(111);
        numBox.add(222);
        numBox.add(333);
        numBox.pick();
    }
}