package com.company;

public class Empleados {

    private String nombre;
    private Integer edad;
    private Integer dni;
    private Integer sueldo;

    public Empleados (String nombre, Integer edad, Integer dni, Integer sueldo){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDni() {
        return dni;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void cobrarSueldo(){
        setSueldo(getSueldo());
    }
}
