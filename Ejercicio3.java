package ejercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) nums.add(sc.nextInt());
        Collections.sort(nums);
        System.out.println(nums);
    }
}
