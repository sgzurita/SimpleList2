package com.android.curso.simplelist2;

/**
 * Created by salvador on 21/03/2018.
 */

public class Persona {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Persona(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;

        Persona persona = (Persona) o;

        if (!getNombre().equals(persona.getNombre())) return false;
        if (!getPrimerApellido().equals(persona.getPrimerApellido())) return false;
        return getSegundoApellido().equals(persona.getSegundoApellido());
    }

    @Override
    public int hashCode() {
        int result = getNombre().hashCode();
        result = 31 * result + getPrimerApellido().hashCode();
        result = 31 * result + getSegundoApellido().hashCode();
        return result;
    }
}
