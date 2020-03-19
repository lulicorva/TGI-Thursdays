package com.company;

public class EmpleadoGeneral extends Empleados {
    public EmpleadoGeneral(String nombre, Integer edad, Integer dni, Integer sueldo) {
        super(nombre, edad, dni, sueldo);
    }

    @Override
    public void cobrarSueldo() {
        super.cobrarSueldo();
    }

}
