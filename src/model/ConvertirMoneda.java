package model;

import java.util.Scanner;

public class ConvertirMoneda {
    public void convertrMoneda(String monedaBase, String monedaTarget,ConsultarMoneda consulta, Scanner lectura){

        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMonedas(monedaBase,monedaTarget);
        System.out.println("La tasa de conversion para hoy\n1 "+ monedaBase + "=" + monedas.conversion_rate()+ " " + monedaTarget);
        System.out.println("Ingrese la cantidad de: "+ monedaBase);

        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();

        System.out.println(cantidad + " "+ monedaBase + " " +cantidadConvertida + " " +monedas.targetCode());
    }

    public void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();

        System.out.println("Ingrese la moneda por la cual quiere convertir");
        String monedatarget = lectura.nextLine().toUpperCase();

        convertrMoneda(monedaBase,monedatarget,consulta,lectura);
    }
}
