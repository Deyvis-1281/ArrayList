import java.util.ArrayList;

public class EjercicioDos {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int n = 1; n <= 5; n++) {
            numbers.add(n);
        }

        System.out.println("Bucle for: ");
        for (int n = 0; n < numbers.size(); n++) {
            System.out.println(numbers.get(n));
        }

        System.out.println("For-each: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Orden inverso: ");
        int index = numbers.size() - 1;
        while (index >= 0) {
            System.out.println(numbers.get(index));
            index--;
        }
    }
}
