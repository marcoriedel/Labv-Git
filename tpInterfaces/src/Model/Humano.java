package Model;

public class Humano {

    String Nombre;
    Integer Edad;
    Integer Peso;

    public Humano(String nombre, Integer edad, Integer peso) {
        Nombre = nombre;
        Edad = edad;
        Peso = peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer peso) {
        Peso = peso;
    }
}
