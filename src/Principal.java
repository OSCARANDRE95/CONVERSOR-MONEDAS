
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        boolean continuar = true;

        System.out.println("***************************************");
        System.out.println("\n BIENVENIDO A SU CONVERSOR DE MONEDAS ");
        System.out.println("\n**************************************");


        while (continuar){


            System.out.println("\nMENU DE CONVERSION: ");
            System.out.println("\n1)  Dolar           =>> Peso Argentino");
            System.out.println("2)  Peso Argentino  =>> Dolar");
            System.out.println("3)  Dolar           =>> Real Brasilero");
            System.out.println("4)  Real Brasilero  =>> Dolar  ");
            System.out.println("5)  Dolar           =>> Peso Colombiano");
            System.out.println("6)  Peso Colombiano =>> Dolar");
            System.out.println("7)  Salir");
            System.out.println("\nSelecciones una opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    convertirDolarAPesoArgentino (scanner);
                    break;
                case 2:
                    convertirPesoArgentinoADolar (scanner);
                    break;

                case 3:
                    convertirDolarARealBrasilero (scanner);
                    break;
                case 4:
                    convertirRealBrasileroADolar (scanner);
                    break;
                case 5:
                    convertirDolarAPesoCoombiano (scanner);
                    break;
                case 6:
                    convertirPesoColombianoADolar (scanner);
                    break;
                case 7:
                    continuar= false;
                    System.out.println("GRACIAS POR USAR EL CONVERSOR DE MOEDAS !");
                    break;

                default:
                    System.out.println("OPCION NO VALIDA,POR FAVOR SELECCIONE UNA OPCION VALIDA");
                    break;
            }
        }
        scanner.close();

    }

    private static void convertirDolarAPesoArgentino (Scanner scanner){
        System.out.print("Ingrese la cantidad de USDT a convertir  en ARS: ");
        double dolares = scanner.nextDouble();
        double pesosArgentinos = dolares * 864.75;//  tasa de cambio fija de 1 USD = 864.74 ARS
        pesosArgentinos=(double) Math.round(pesosArgentinos*100)/100;
        System.out.println(dolares + " USDT equivalen a " + pesosArgentinos + " ARS.");
    }

    private static void convertirPesoArgentinoADolar (Scanner scanner){
        System.out.print("Ingrese la cantidad de ARS a convertir en USDT: ");
        double pesosArgentinos = scanner.nextDouble();
        double dolares =  pesosArgentinos /864.75; //  tasa de cambio fija de 1 USD = 864.74 ARS
        dolares=(double) Math.round(dolares*100)/100;
        System.out.println(pesosArgentinos+ " ARS equivalen a " + dolares + " USDT.");
    }

    private static void convertirDolarARealBrasilero (Scanner scanner){
        System.out.print("Ingrese la cantidad de USDT a convertir en  BRS : ");
        double dolares = scanner.nextDouble();
        double realBrasilero =  dolares * 5.2085; //  tasa de cambio fija de 1 USD = 5.2085 BRS
        realBrasilero=(double) Math.round(realBrasilero*100)/100;
        System.out.println(dolares+ " USDT equivalen a " + realBrasilero + " BRS.");
    }

    private static void convertirRealBrasileroADolar (Scanner scanner){
        System.out.print("Ingrese la cantidad de BRS a convertir en USDT : ");
        double realBrasilero = scanner.nextDouble();
        double  dolares=  realBrasilero /5.2085; //  tasa de cambio fija de 1 USD = 5.2085 BRS
        dolares=(double) Math.round(dolares*100)/100;
        System.out.println(realBrasilero + "BRS equivalen a " + dolares + " USDT.");
    }
    private static void convertirDolarAPesoCoombiano (Scanner scanner){
        System.out.print("Ingrese la cantidad de USDT a convertir en COP: ");
        double dolares = scanner.nextDouble();
        double pesoColombiano =  dolares * 3907.9926; //  tasa de cambio fija de 1 USD = 3907.9926 COP
        pesoColombiano=(double) Math.round(pesoColombiano*100)/100;
        System.out.println(dolares+ " USDT equivalen a " + pesoColombiano + " COP.");
    }
    private static void convertirPesoColombianoADolar(Scanner scanner){
        System.out.print("Ingrese la cantidad de COP a convertir en USDT: ");
        double pesoColombiano = scanner.nextDouble();
        double  dolares=  pesoColombiano/3907.9926; //  tasa de cambio fija de 1 USD = 3907.9926 BRS
        dolares=(double) Math.round(dolares*100)/100;
        System.out.println(pesoColombiano+ "COP a " + dolares + " USDT.");
    }
}





