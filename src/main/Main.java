package main;

import model.ConsultarMoneda;
import model.ConvertirMoneda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        ConvertirMoneda convert = new ConvertirMoneda();


        int opc =0;
        while(opc !=9){
            System.out.println("*******************");
            System.out.println("1.-Convertir de Dolar a CLP \n" +
                    "2.-Convertir de CLP a Dolar \n" +
                    "3.-Convertir de YEN a CLP \n" +
                    "4.-Convertir de CLP A YEN \n" +
                    "5.-Convertir de WON a CLP \n" +
                    "6.-Convertir de CLP a WON \n" +
                    "7.-Convertir de EURO a CLP \n" +
                    "8.-Convertir de CLP a EURO \n" +
                    "9.-Salir.");
            opc = scan.nextInt();
            scan.nextLine();

            switch (opc){
                case 1:
                    System.out.println("OPC 1");
                    convert.convertrMoneda("USD","CLP",consulta,scan);
                    Thread.sleep(2000);
                    break;
                case 2:
                    System.out.println("OPC 2");
                    convert.convertrMoneda("CLP","USD",consulta,scan);
                    Thread.sleep(2000);
                    break;
                case 3:
                    System.out.println("OPC 3");
                    convert.convertrMoneda("JPY","CLP",consulta,scan);
                    Thread.sleep(2000);
                    break;
                case 4:
                    System.out.println("OPC 4");
                    convert.convertrMoneda("CLP","JPY",consulta,scan);
                    Thread.sleep(2000);
                    break;
                case 5:
                    System.out.println("OPC 5");
                    convert.convertrMoneda("KRW","CLP",consulta,scan);
                    Thread.sleep(2000);
                    break;
                case 6:
                    System.out.println("OPC 6");
                    convert.convertrMoneda("CLP","KRW",consulta,scan);
                    Thread.sleep(2000);
                    break;
                case 7:
                    System.out.println("OPC 7");
                    convert.convertrMoneda("CLP","EUR",consulta,scan);
                    Thread.sleep(2000);
                    break;
                case 8:
                    System.out.println("OPC 8");
                    convert.convertrMoneda("EUR","CLP",consulta,scan);
                    Thread.sleep(2000);
                    break;
                case 9:
                    Thread.sleep(2000);
                    System.out.println("OPC 9. SALIR!");
                    break;
            }

        }
    }
}
