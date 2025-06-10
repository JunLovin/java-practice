import java.util.Scanner;
import java.util.ArrayList;

public class GestorDeContactos {
    ArrayList<Contacto> listaDeContactos;

    public GestorDeContactos() {
        listaDeContactos = new ArrayList<Contacto>();
    }

    public void AgregarContacto(String nombre, String telefono, String email) {
        Contacto nuevoContacto = new Contacto(nombre, telefono, email);
        this.listaDeContactos.add(nuevoContacto);
        System.out.println("Se agregó el nuevo contacto " + nuevoContacto.getName());
    }

    public void listarContactos() {
        for (Contacto contacto : this.listaDeContactos) {
            System.out.println(contacto.toString());
        }
    }

    public Contacto buscarContactoPorNombre(String nombre) {
        for (Contacto contacto : this.listaDeContactos) {
            if (contacto.getName().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public void eliminarContacto(int indice) {
        if (indice >= 0 && indice <= this.listaDeContactos.size()) {
            this.listaDeContactos.remove(indice);
            System.out.println("Se ha eliminado el contacto correctamente");
            return;
        }
        System.out.println("Ingresa un índice válido");
        return;
    }

    public void actualizarContacto(int indice, String nuevoTelefono, String nuevoEmail) {
        Contacto contactoPorActualizar = this.listaDeContactos.get(indice);
        contactoPorActualizar.setTelefono(nuevoTelefono);
        contactoPorActualizar.setEmail(nuevoEmail);
    }

    public static void main(String[] args) {
        GestorDeContactos gestor = new GestorDeContactos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ GESTOR DE CONTACTOS ---");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Listar todos los contactos");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Buscar Contacto");
            System.out.println("5. Eliminar Contacto");
            System.out.println("0. Salir del gestor");
            System.out.print("Elija una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                opcion = -1;
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el correo del contacto: ");
                    String email = scanner.nextLine();
                    gestor.AgregarContacto(nombre, telefono, email);
                    break;
                case 2:
                    gestor.listarContactos();
                    break;
                case 3:
                    System.out.print("Ingrese el índice del contacto a actualizar ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine());
                        System.out.println("Ingrese el nuevo teléfono del contacto: ");
                        String nuevoTelefono = scanner.nextLine();
                        System.out.println("Ingrese el nuevo correo del contacto: ");
                        String nuevoEmail = scanner.nextLine();
                        gestor.actualizarContacto(indice, nuevoTelefono, nuevoEmail);
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número para el índice.");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del contacto a buscar: ");
                    String contactoABuscar = scanner.nextLine();
                    Contacto contactoBuscado = gestor.buscarContactoPorNombre(contactoABuscar);
                    System.out.println(contactoBuscado.toString());
                    break;
                case 5:
                    System.out.print("Ingrese el índice del contacto a eliminar: ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine());
                        gestor.eliminarContacto(indice);
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número para el índice.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del gestor de contactos. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}