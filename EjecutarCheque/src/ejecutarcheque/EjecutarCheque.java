package ejecutarcheque;

import ppackageCheque.Cheque;

public class EjecutarCheque {

    public static void main(String[] args) {
        Cheque cheque1 = new Cheque("israel ", "Coopmego", 2230.75);
        cheque1.calcularComisionbanco();
        System.out.println(cheque1);

        Cheque cheque2 = new Cheque("alex", "Semilla del Progreso", 2220.75);
        cheque2.calcularComisionbanco();
        System.out.println(cheque2);
    }
}

//Integrantes: 
//Alex Gutiérrez
//Israel Asanza
