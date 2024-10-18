import java.util.ArrayList;
public class EjercicioCinco {

        public static void main(String[] args) {
            ArrayList<Integer> numeros = new ArrayList<>();
            for (int n = 1; n <= 5; n++) {
                numeros.add(n);
            }
            Integer[] numerosArray = new Integer[numeros.size()];
            numerosArray = numeros.toArray(numerosArray);

            System.out.println("Array:");
            for (int i = 0; i < numerosArray.length; i++) {
                System.out.println(numerosArray[i]);
            }
        }
}