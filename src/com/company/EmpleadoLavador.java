package com.company;

public class EmpleadoLavador extends Empleados {

    Integer roturas;

    public EmpleadoLavador(String nombre, Integer edad, Integer dni, Integer sueldo, Integer roturas) {
        super(nombre, edad, dni, sueldo);
        this.roturas = roturas;
    }

    public void setRoturas(Integer roturas) {
        this.roturas = roturas;
    }

    public Integer getRoturas() {
        return roturas;
    }

    @Override
    public void cobrarSueldo() {
        super.cobrarSueldo();
    }

    public Integer descontarSueldo(){
        Integer importeADescontar = getRoturas() * 5;
        setSueldo(getSueldo() - importeADescontar);
        return getSueldo();
    }
}
