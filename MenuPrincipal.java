import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int opt = 0;

        // Cambiar de Stack a Queue
        Queue<ObjComputador> c = new LinkedList<>();
        Queue<ObjTablet> t = new LinkedList<>();

        while (bandera) {
            System.out.println("Bienvenidos al departamento de sistemas");
            System.out.println("Seleccione la opción que desea:");
            System.out.println("1 : menu Computador");
            System.out.println("2 : menu Tablet");
            System.out.println("3 : Salir");

            while (!sc.hasNextInt()) {
                System.out.println("Ingrese por favor un valor numérico");
                sc.next();
            }
            opt = sc.nextInt();
            sc.nextLine();

            if (opt < 1 || opt > 3) {
                System.out.println("Por favor ingrese una opción del 1 al 3");
                continue;
            }

            switch (opt) {
                case 1:
                    MenuComputador mc = new MenuComputador();
                    c = mc.Computador(c, sc);
                    break;
                case 2:
                    MenuTablet mt = new MenuTablet();
                    t = mt.Tablet(t, sc);
                    break;
                case 3:
                    System.out.println("Hasta pronto");
                    bandera = false;
                    break;
            }
        }
    }
}
