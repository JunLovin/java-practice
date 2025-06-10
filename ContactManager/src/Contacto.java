public class Contacto {
    String nombre;
    String telefono;
    String email;


    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getName() {
        return this.nombre;
    }

    public String getNumber() {
        return this.telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setTelefono(String nuevoTelefono) {
        this.telefono = nuevoTelefono;
        System.out.println("Se cambió el teléfono del usuario " + this.nombre + " a " + this.telefono);
    }

    public void setEmail(String nuevoEmail) {
        this.email = nuevoEmail;
        System.out.println("Se cambió el email del usuario " + this.nombre + " a " + this.email);
    }

    public String toString() {
        return "-----CONTACTO-----\n" +
                "Nombre: " + this.nombre + "\n" +
                "Teléfono: " + this.telefono + "\n" +
                "Email: " + this.email + "\n" +
                "------------------";
    }
}