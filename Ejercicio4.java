package ejercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();
        for (int i = 0; i < 5; i++) palabras.add(sc.nextLine());
        Collections.sort(palabras);
        System.out.println(palabras);
    }
}
