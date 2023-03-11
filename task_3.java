import java.util.ArrayList;
import java.util.Random;

/**
 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */
public class task_3 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(new Random().nextInt(10,100));
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer item : list) {
            if (item > max) max = item;
            if (item < min) min = item;
            sum += item;
        }
        System.out.println(list);
        System.out.printf("Максимальное значение: %d\n", max);
        System.out.printf("Минимальное значение: %d\n", min);
        System.out.printf("Среднее значение: %d\n", sum/list.size());
    }
}
