import Ejercicio1.Rectangulo;
import Ejercicio2.Empleado;
import Ejercicio3.itemVenta;
import Ejercicio4.Cuentabancaria;
import Ejercicio5.Hora;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                    /*EJERCICIO 1
        double area;                ///Preguntar si en los main tambien se declaran con public/private
        double perimetro;

        Rectangulo rectangle = new Rectangulo(10,20);

        System.out.println(String.format("Valores primer rectangulo Alto = %s Ancho = %s", rectangle.getAlto(),rectangle.getAncho()));

        Rectangulo  rectanguloVacio = new Rectangulo();
        System.out.println("Valores cargados en RectanguloVacio = "+rectanguloVacio.getAncho()+"///Alto "+rectanguloVacio.getAlto());

        area= rectangle.calculoArea();
        System.out.println("Probando area : "+area);

        perimetro= rectangle.calculoPerimetro();
        System.out.println("Probando Perimetro : "+perimetro);

        ///Probando pero con los sets

        rectangle.setAlto(15);
        rectangle.setAncho(12);

        area= rectangle.calculoArea();
        System.out.println("Probando area : "+area);

        perimetro= rectangle.calculoPerimetro();
        System.out.println("Probando Perimetro : "+perimetro);

                                                     */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                /* EJERCICIO 2
        Empleado carlos = new Empleado(23456345,"Carlos","Gutierrez",25000);

        Empleado ana =new Empleado(34234123,"Ana","Gutierrez",27500);



        carlos.mostrarEmpleado();

        System.out.println(ana.getEmpleado());

        ////Me parece medio engorroso las llamadas del sout peeero esta bien creo
        System.out.println(carlos.aumentoSueldo(carlos.getSalario()));




        float saldoAnual=carlos.calculoAnual(carlos.getSalario());
        System.out.println("Saldo anual : "+saldoAnual);

                                                 */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*                                  EJERCICIO 3 (Chequear metodo ToString() de la resolucion)

        itemVenta bebida =new itemVenta(2,"Bebida sabor cola",12,150.50);
        itemVenta donSatur = new itemVenta(3,"Los salados pa",10,25.10);

        double precio;


        ///donSatur.calculoTotal()
        System.out.println(bebida.muestraProducto());
        System.out.println("Calculo total : "+precio);


         */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*                              EJERCICIO 4,en comparacion a la resolucion me quedo muy cargado el main,pero bueno
                                                    tambien podria agregar un switch por si queres acreditar/debitar cuantas veces quieras

        Scanner scan =new Scanner(System.in);
        Cuentabancaria banelco = new Cuentabancaria(21,"Rodrigo Rodriguez",15000);
        double balanceTotal=0;

        System.out.println(banelco.toString());
        System.out.println("Ingrese monto a depositar : ");
        double deposito = scan.nextDouble();
        balanceTotal=banelco.deposito(deposito);
        banelco.setBalance(balanceTotal);
        System.out.println("Balance total : "+banelco.getBalance());

        System.out.println("Ingrese monto a retirar ");
        deposito=scan.nextDouble();
        balanceTotal=banelco.retirar(deposito);
        banelco.setBalance(balanceTotal);
        System.out.println("Balance luego de la operacion : "+banelco.getBalance());


*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*                                      EJERCICIO 5 Cumple con la consigna PERO tuve que hacer trampa con el sout
                                                            modularizando c/funcion como en la resolucion quedaria mejor (repasar)
         */
        Hora primerReloj = new Hora(23, 59,58);

        primerReloj.muestraHora();
        primerReloj.agregarSegundo();
        primerReloj.muestraHora();
        primerReloj.agregarSegundo();
        primerReloj.muestraHora();
        primerReloj.agregarSegundo();
        primerReloj.muestraHora();
        System.out.println("Comienza la resta");
        primerReloj.restarSegundo();
        primerReloj.muestraHora();
        primerReloj.restarSegundo();
        primerReloj.muestraHora();
        primerReloj.restarSegundo();
        primerReloj.muestraHora();
        primerReloj.restarSegundo();
        primerReloj.muestraHora();
        /*




    }
}
