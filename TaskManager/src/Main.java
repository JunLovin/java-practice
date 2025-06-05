import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas gestor = new GestorDeTareas();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ GESTOR DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Listar todas las tareas");
            System.out.println("4. Listar tareas pendientes");
            System.out.println("5. Eliminar tarea");
            System.out.println("0. Salir");
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
                    System.out.print("Ingrese el título de la tarea: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    gestor.agregarTarea(titulo, descripcion);
                    break;
                case 2:
                    System.out.print("Ingrese el índice de la tarea a marcar como completada: ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine());
                        gestor.marcarTareaComoCompletada(indice);
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número para el índice.");
                    }
                    break;
                case 3:
                    gestor.listarTareas();
                    break;
                case 4:
                    gestor.listarTareasPendientes();
                    break;
                case 5:
                    System.out.print("Ingrese el índice de la tarea a eliminar: ");
                    try {
                        int indice = Integer.parseInt(scanner.nextLine());
                        gestor.eliminarTarea(indice);
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número para el índice.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del gestor de tareas. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}