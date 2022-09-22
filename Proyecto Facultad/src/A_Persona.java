abstract class A_Persona {
    //Atributos: nombre, apellido, legajo
    private String nombre;
    private String apellido;
    private int legajo;

    //Metodo modificarDatos:
    public void modificarDatos(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }
}