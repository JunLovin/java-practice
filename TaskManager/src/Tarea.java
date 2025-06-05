import java.time.LocalDate;

public class Tarea {
    String titulo;
    String descripcion;
    boolean completada;
    LocalDate fecha;

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
        this.fecha = LocalDate.now();
    }

    public void marcarComoCompletada() {
        this.completada = true;
        System.out.println("Se completó la tarea: " + this.titulo);
    }

    public String obtenerTitulo() {
        System.out.println(this.titulo);
        return this.titulo;
    }

    public String obtenerDescripcion() {
        System.out.println(this.descripcion);
        return this.descripcion;
    }

    public boolean estaCompletada() {
        return this.completada;
    }

    public String toString() {
        String estado = this.completada ? "Completada" : "Sin completar";
        return "Título: " + this.titulo + "\n" +
                "Descripción: " + this.descripcion + "\n" +
                "Estado: " + estado + "\n" +
                "Fecha de Creación: " + this.fecha + "\n" +
                "--------------------";
    }
}