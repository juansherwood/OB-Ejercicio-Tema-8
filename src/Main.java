public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setEdad(20);
        miPersona.setNombre("Juan");
        miPersona.setTelefono("10203040");

        System.out.println("Edad: " + miPersona.getEdad() + "\nNombre: " + miPersona.getNombre() +
                "\nTeléfono: " + miPersona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

}