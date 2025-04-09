import java.util.Queue;
import java.util.Scanner;

public class MetodosGenerales {
    Scanner sc = new Scanner(System.in);

    public Queue<ObjComputador> IngresarComputador(Queue<ObjComputador> c) {
        ObjComputador o = new ObjComputador();
        String serial = "";
        boolean serialExiste = true;
        System.out.println("Por favor ingrese el serial");
        serial=sc.next();
        while (serialExiste) {
            serialExiste = false;
            for (ObjComputador pc : c) {
                if (pc.getSerial().equalsIgnoreCase(serial)) {
                    serialExiste = true;
                    System.out.println("el serial ya existe, por favor valide");
                    serial = sc.next();
                }
            }
        }
       
        o.setSerial(serial);
        System.out.println("Ingrese la marca");
        o.setMarca(sc.next());
        System.out.println("Ingrese La memoria Ram");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese dato numérico");
            sc.next();
        }
        o.setSerial(serial);
        o.setMemoriaRam(sc.nextInt());
        System.out.println("Ingrese la capacidad del disco duro");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese dato numérico");
            sc.next();
        }
        o.setDiscoDuro(sc.nextInt());
        System.out.println("Ingrese el precio del computador");
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor ingrese dato numérico");
            sc.next();
        }
        o.setPrecio(sc.nextDouble());
        o.setDisponible(true);
        o.setCantidad(1);
        c.add(o);
        return c;
    }

    public Queue<ObjComputador> PrestarComputador(Queue<ObjComputador> c) {
        if (c.isEmpty()) {
            System.out.println("NO hay datos, por favor valide");
            return c;
        }
        System.out.println("Ingrese el serial del computador a prestar");
        String serial = sc.next();
        boolean encontrado = false;
        for (ObjComputador o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Ingrese el nombre del usuario");
                o.setNombreUsuario(sc.next());
                o.setDisponible(false);
                System.out.println("Equipo prestado con éxito");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El serial no se encuentra, por favor valide");
        }
        return c;
    }

    public Queue<ObjComputador> ModificarComputador(Queue<ObjComputador> c) {
        if (c.isEmpty()) {
            System.out.println("NO hay datos, por favor valide");
            return c;
        }
        System.out.println("Ingrese el serial del computador a modificar");
        String serial = sc.next();
        boolean encontrado = false;
        for (ObjComputador o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Ingrese el nombre del usuario");
                o.setNombreUsuario(sc.next());
                System.out.println("Modificado con éxito");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El serial no se encuentra, por favor valide");
        }
        return c;
    }

    public Queue<ObjComputador> DevolverComputador(Queue<ObjComputador> c) {
        if (c.isEmpty()) {
            System.out.println("NO hay datos, por favor valide");
            return c;
        }
        System.out.println("Ingrese el serial del computador a devolver");
        String serial = sc.next();
        boolean encontrado = false;
        for (ObjComputador o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                o.setNombreUsuario(null);
                o.setDisponible(true);
                System.out.println("Devuelto con éxito");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El serial no se encuentra, por favor valide");
        }
        return c;
    }

    // Métodos para Tablet
    public Queue<ObjTablet> IngresarTablet(Queue<ObjTablet> c) {
        ObjTablet o = new ObjTablet();
        String serial = "";
        boolean serialExiste = true;
        System.out.println("Por favor ingrese el serial");
        serial=sc.next();
        while (serialExiste) {
            serialExiste = false;
            for (ObjTablet tb : c) {
                if (tb.getSerial().equalsIgnoreCase(serial)) {
                    serialExiste = true;
                    System.out.println("el serial ya existe, por favor valide");
                    serial = sc.next();
                }
            }
        }
        o.setSerial(serial);
        System.out.println("Ingrese la marca");
        o.setMarca(sc.next());
        System.out.println("Ingrese el tamaño");
        o.setTamaño(sc.nextInt());
        System.out.println("Ingrese el precio de la tablet");
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor ingrese dato numérico");
            sc.next();
        }
        o.setPrecio(sc.nextDouble());
        o.setDisponible(true);getClass();
        c.add(o);
        return c;
    }

    public Queue<ObjTablet> PrestarTablet(Queue<ObjTablet> c) {
        if (c.isEmpty()) {
            System.out.println("NO hay datos, por favor valide");
            return c;
        }
        System.out.println("Ingrese el serial de la tablet a prestar");
        String serial = sc.next();
        boolean encontrado = false;
        for (ObjTablet o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Ingrese el nombre del usuario");
                o.setNombreUsuario(sc.next());
                o.setDisponible(false);
                System.out.println("Equipo prestado con éxito");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El serial no se encuentra, por favor valide");
        }
        return c;
    }

    public Queue<ObjTablet> ModificarTablet(Queue<ObjTablet> c) {
        if (c.isEmpty()) {
            System.out.println("NO hay datos, por favor valide");
            return c;
        }
        System.out.println("Ingrese el serial de la tablet a modificar");
        String serial = sc.next();
        boolean encontrado = false;
        for (ObjTablet o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Ingrese el nombre del usuario");
                o.setNombreUsuario(sc.next());
                System.out.println("Modificado con éxito");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El serial no se encuentra, por favor valide");
        }
        return c;
    }

    public Queue<ObjTablet> DevolverTablet(Queue<ObjTablet> c) {
        if (c.isEmpty()) {
            System.out.println("NO hay datos, por favor valide");
            return c;
        }
        System.out.println("Ingrese el serial de la tablet a devolver");
        String serial = sc.next();
        boolean encontrado = false;
        for (ObjTablet o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                o.setNombreUsuario(null);
                o.setDisponible(true);
                System.out.println("Devuelto con éxito");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El serial no se encuentra, por favor valide");
        }
        return c;
    }
}
