import java.util.ArrayList;
public class EjercicioTres {

        public static void main(String[] args) {

            ArrayList<Integer> numbers = new ArrayList<>();

            for (int n = 1; n <= 10; n++) {
                numbers.add(n);
            }
            ArrayList<Integer> eventoNumero = new ArrayList<>();
            for (int number : numbers) {
                if (number % 2 == 0) {
                    eventoNumero.add(number);
                }
            }
            System.out.println("Lista original: " + numbers);
            System.out.println("Lista par: " + eventoNumero);
        }
    }