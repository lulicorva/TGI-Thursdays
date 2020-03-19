package com.company;

public class Main {

    public static void main(String[] args) {

        EmpleadoGeneral empleado1 = new EmpleadoGeneral("Juan",34,345673,40000);
        EmpleadoLavador empleado2 = new EmpleadoLavador("Mario", 29,395869,40000,3);
        Sistema sistemaContador = new Sistema();

        empleado1.cobrarSueldo();
        System.out.println(empleado1.getSueldo());

        System.out.println(empleado2.getRoturas());
        System.out.println(empleado2.descontarSueldo());

        System.out.println(empleado1.getDni());
        System.out.println(empleado2.getSueldo());

    }
}
