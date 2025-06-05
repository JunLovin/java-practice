import java.util.ArrayList;

public class GestorDeTareas {
    ArrayList<Tarea> tareas;

    public GestorDeTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String titulo, String descripcion) {
        Tarea nuevaTarea = new Tarea(titulo, descripcion);
        this.tareas.add(nuevaTarea);
        System.out.println("Tarea: " + titulo + " fue agregada correctamente");
    }

    public void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < this.tareas.size()) {
            Tarea tareaACompletar = this.tareas.get(indice);
            if (!tareaACompletar.estaCompletada()) {
                tareaACompletar.marcarComoCompletada();
                System.out.println("Tarea: " + tareaACompletar.obtenerTitulo() + " Se completó correctamente");
            } else {
                System.out.println("La tarea: " + tareaACompletar.obtenerTitulo() + " Ya está completada");
            }
        } else {
            System.out.println("Índice de tarea inválido");
        }
    }

    public void listarTareas() {
        if (this.tareas.isEmpty()) {
            System.out.println("No hay tareas que listar.");
            return;
        }
        for (int i = 0; i < this.tareas.size(); i++) {
            System.out.println("\n----------");
            Tarea tarea = this.tareas.get(i);
            System.out.println("[Índice:  " + i + "]");
            System.out.println(tarea.toString());
            System.out.println("----------\n");
        }
    }

    public void listarTareasPendientes() {
        boolean hayPendientes = false;
        System.out.println("---------- Tareas Pendientes ---------");
        for (int i = 0; i < this.tareas.size(); i++) {
            Tarea tarea = this.tareas.get(i);
            if (!tarea.estaCompletada()) {
                System.out.println("[Índice:  " + i + "]");
                System.out.println(tarea.toString());
                hayPendientes = true;
            }
        }
        if (!hayPendientes) {
            System.out.println("¡Todas las tareas están completadas!");
        }
        System.out.println("-----------------------------");
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < this.tareas.size()) {
            Tarea tareaEliminada = this.tareas.remove(indice);
            System.out.println("Se eliminó la tarea " + tareaEliminada.obtenerTitulo() + " correctamente");
        } else {
            System.out.println("Índice de tarea inválido");
        }
    }
}