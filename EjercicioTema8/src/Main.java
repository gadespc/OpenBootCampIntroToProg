class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono =telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }
}


public class Main {
    public static void main(String[] args) {
        Persona anciano = new Persona();

        anciano.setEdad(89);
        anciano.setNombre("Juan");
        anciano.setTelefono("666-666-666");

        System.out.println(anciano.getEdad());
        System.out.println(anciano.getNombre());
        System.out.println(anciano.getTelefono());

    }
}