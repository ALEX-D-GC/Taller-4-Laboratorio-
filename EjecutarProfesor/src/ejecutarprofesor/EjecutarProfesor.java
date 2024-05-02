package ejecutarprofesor;

import ppackageProfesor.Profesor;

public class EjecutarProfesor {

    public static void main(String[] args) {
       Profesor profesor1 = new Profesor("Alex","Gutierrez",10000,"1105884595");
        profesor1.calcularSueldoTotal();
        System.out.println(profesor1);
        
        Profesor profesor2;
        profesor2 = new Profesor("pedro","Pugo",20120,"1108546895");
        profesor2.calcularSueldoTotal();
        System.out.println(profesor2);
    }
}

//Integrantes: 
//Alex Gutiérrez
//Israel Asanza//Integrantes: 