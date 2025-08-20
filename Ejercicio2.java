package ejercicios;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random r = new Random();
        int tam = r.nextInt(11) + 10;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < tam; i++) nums.add(r.nextInt(101));

        int suma = 0, max = nums.get(0), min = nums.get(0);
        for (int n : nums) { suma += n; if (n > max) max = n; if (n < min) min = n; }

        System.out.println("Lista: " + nums);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + (suma / (double) nums.size()));
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
