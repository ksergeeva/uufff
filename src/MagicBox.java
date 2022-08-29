
import java.util.Random;

public class MagicBox<T> {
    Random random = new Random();
    int randomInt;
    public T[] items;

    public MagicBox(int ranitems) {
        this.items = (T[]) new Object[ranitems];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Добавили : " + item);
                return true;
            }
        }
        System.out.println("Нет места!!!");
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Свободных ячеек: " + (items.length - i) + ", надо добавить.");
            }
        }
        randomInt = random.nextInt(items.length);
        System.out.println("Коробка полна!!!");
        System.out.println("Случайный элемент из коробки: " + items[randomInt]);
        System.out.println();
        return items[randomInt];
    }
}
