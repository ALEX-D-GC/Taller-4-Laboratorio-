package ejecutarautomotor;

import ppackageAutomotor.TestAutomotor;

public class EjecutarAutomotor {

    public static void main(String[] args) {
        TestAutomotor automotor1 = new TestAutomotor("1105658502", "Hyundai", 2018, 9500.75);
        automotor1.calcularValorMatricula();
        System.out.println(automotor1);
        
        // Corrección: Cierre de comillas en el número de cédula
        TestAutomotor automotor2 = new TestAutomotor("1105884595", "Abarth", 2012, 9500);
        automotor2.calcularValorMatricula();
        System.out.println(automotor2);
    }
}

//Integrantes: 
//Alex Gutiérrez
//Israel Asanza