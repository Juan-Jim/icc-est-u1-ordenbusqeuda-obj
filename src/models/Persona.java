package models;

public class Persona {

    private String nombre;
    private int edad;
    private Direccion direccion;
    
    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getCodigoDireccion() {
        return direccion.getCodigo();
    }

    public boolean compareCodigoDireccion(Persona personas) {
        //boolean codicion = direccion.getCodigo() > persona.getDireccion().getCodigo();
        //return codicion;

        return  getCodigoDireccion() > personas.getCodigoDireccion();
    }

    public boolean compareCodigoDireccion(int codigo) {
        boolean condicion = direccion.getCodigo() > codigo;
        return condicion;
    }

    public boolean equalsByCodigoDireccion(Persona persona) {
        return direccion.getCodigo() == persona.getDireccion().getCodigo();
    }

    public boolean equalsByCodigoDireccion(int codigo) {
        return direccion.getCodigo() == codigo;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
    }


    
    
}
