public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setEdad(18);
        cliente.setNombre("Gabriel");
        cliente.setTelefono("675-666-666");
        cliente.setCredito(250);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());


        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(39);
        trabajador.setNombre("Jose Manuel");
        trabajador.setTelefono("666-655-655");
        trabajador.setSalario(1700);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }
}

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

        this.telefono = telefono;
    }

    public String getTelefono() {

        return this.telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }
}