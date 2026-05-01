package Maquina_Expendedora;
import java.util.Scanner;

public class MainInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Expendedor exp = new Expendedor(6);

        int opcion = -1;
        while (opcion!=0) {
            System.out.println("Seleccione un producto:");
            System.out.println("1.CocaCola");
            System.out.println("2.Sprite");
            System.out.println("3.Fanta");
            System.out.println("4.Super8");
            System.out.println("5.Snickers");
            System.out.println("0.Salir");
            opcion = scanner.nextInt();

            ValorProducto producto = null;
            if(opcion == 0){
                break;
            }
            switch (opcion){
                case 1:
                    producto = ValorProducto.COCA;
                    break;
                case 2:
                    producto = ValorProducto.SPRITE;
                    break;
                case 3:
                    producto = ValorProducto.FANTA;
                    break;
                case 4:
                    producto = ValorProducto.SUPER8;
                    break;
                case 5:
                    producto = ValorProducto.SNICKERS;
                    break;
                default:
                    System.out.println("Eleccion no valida");
                    continue;
            }
            System.out.println("Ingrese Moneda:");
            System.out.println("1. Moneda 100");
            System.out.println("2. Moneda 500");
            System.out.println("3. Moneda 1000");
            int valorMoneda = scanner.nextInt();

            Moneda moneda;
            switch (valorMoneda) {
                case 1:
                    moneda = new Moneda100();
                    break;
                case 2:
                    moneda = new Moneda500();
                    break;
                case 3:
                    moneda = new Moneda1000();
                    break;
                default:
                    System.out.println("Eleccion no valida");
                    continue;
            }
            Comprador comprador = new Comprador(moneda, producto,exp);
        }
    }
}