import java.util.ArrayList;
public class EjercicioCuatro {

        public static void main(String[] args) {
            ArrayList<String> listUno = new ArrayList<>();
            ArrayList<String> listDos = new ArrayList<>();

            listUno.add("Apple");
            listUno.add("Banana");
            listUno.add("Cherry");
            listUno.add("Date");

            listDos.add("Banana");
            listDos.add("Date");
            listDos.add("Elderberry");
            listDos.add("Fig");

            ArrayList<String> comunElements = new ArrayList<>();
            for (String item : listUno) {
                if (listDos.contains(item)) {
                    comunElements.add(item);
                }
            }

            System.out.println("Comunes: " + comunElements);
        }
}
