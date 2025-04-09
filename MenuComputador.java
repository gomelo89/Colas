import java.util.Queue;
import java.util.Scanner;

public class MenuComputador {
    public Queue<ObjComputador> Computador(Queue<ObjComputador> cola, Scanner sc) {
        boolean bandera = true;
        MetodosGenerales m = new MetodosGenerales();
        int opt = 0;

        while (bandera) {
            System.out.println("1: Ingresar Computador");
            System.out.println("2: Prestar Computador");
            System.out.println("3: Modificar Computador");
            System.out.println("4: Devolver Computador");
            System.out.println("5: Volver al menú Principal");

            while (!sc.hasNextInt()) {
                System.out.println("Por favor ingrese un dato numérico");
                sc.next();
            }
            opt = sc.nextInt();
            sc.nextLine();

            if (opt < 1 || opt > 5) {
                System.out.println("Por favor ingrese un valor de 1 a 5");
                continue;
            }

            switch (opt) {
                case 1:
                    cola = m.IngresarComputador(cola);
                    System.out.println("Registro con éxito");
                    break;
                case 2:
                    cola = m.PrestarComputador(cola);
                    break;
                case 3:
                    cola = m.ModificarComputador(cola);
                    break;
                case 4:
                    cola = m.DevolverComputador(cola);
                    break;
                case 5:
                    System.out.println("Chao");
                    bandera = false;
                    break;
                default:
                    break;
            }
        }

        return cola;
    }
}