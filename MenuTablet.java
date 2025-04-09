import java.util.Queue;
import java.util.Scanner;

public class MenuTablet {
    public Queue<ObjTablet> Tablet(Queue<ObjTablet> cola, Scanner sc) {
        boolean bandera = true;
        MetodosGenerales m = new MetodosGenerales();
        int opt = 0;

        while (bandera) {
            System.out.println("1: Ingresar tablet");
            System.out.println("2: Prestar tablet");
            System.out.println("3: Modificar tablet");
            System.out.println("4: Devolver tablet");
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
                    cola = m.IngresarTablet(cola);
                    System.out.println("Registro con éxito");
                    break;
                case 2:
                    cola = m.PrestarTablet(cola);
                    break;
                case 3:
                    cola = m.ModificarTablet(cola);
                    break;
                case 4:
                    cola = m.DevolverTablet(cola);
                    break;
                case 5:
                    System.out.println("Chao");
                    bandera = false;
                    break;
            }
        }

        return cola;
    }
}
