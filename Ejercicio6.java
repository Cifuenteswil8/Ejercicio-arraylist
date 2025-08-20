package ejercicios;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashMap<String,String> users = new HashMap<>();
        users.put("admin","1234");
        users.put("juan","abcd");
        Scanner sc = new Scanner(System.in);

        int intentos = 3; boolean acceso = false;
        while (intentos > 0 && !acceso) {
            String u = sc.nextLine();
            String p = sc.nextLine();
            if (users.containsKey(u) && users.get(u).equals(p)) acceso = true;
            else intentos--;
        }
        System.out.println(acceso ? "Acceso permitido" : "Acceso denegado");
    }
}
