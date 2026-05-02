package Maquina_Expendedora;
import java.util.Scanner;

public class MainInteractivo {
    public static void main(String[] args) {
        boolean loop=true;
        Expendedor exp=null;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de productos a llenar(0 para salir):");
        int cantidad=scanner.nextInt();
        while(cantidad<0){
            System.out.println("Error: la cantidad debe ser positiva");
            System.out.println("Ingrese la cantidad de productos a llenar(0 para salir):");
        }
        if (cantidad==0) System.exit(0);
        exp = new Expendedor(cantidad);
        

        while(loop){
            Moneda moneda=null;
            int productoNum=0;


            int opcion = -1;
            
                System.out.println("Seleccione un producto:");
                System.out.println("1.CocaCola");
                System.out.println("2.Sprite");
                System.out.println("3.Fanta");
                System.out.println("4.Super8");
                System.out.println("5.Snickers");
                System.out.println("0.Salir");
                opcion = scanner.nextInt();

                if(opcion == 0){
                    loop=false;
                    break;
                }
                while(opcion<0 || opcion>5){
                    System.out.println("Eleccion no valida");
                    System.out.println("1.CocaCola");
                    System.out.println("2.Sprite");
                    System.out.println("3.Fanta");
                    System.out.println("4.Super8");
                    System.out.println("5.Snickers");
                    System.out.println("0.Salir");
                    opcion = scanner.nextInt();
                }

                ValorProducto vp=ValorProducto.values()[opcion-1];
                

                
                switch (vp){
                    case COCA:
                        productoNum = ValorProducto.COCA.getOpcion();
                        break;
                    case SPRITE:
                        productoNum = ValorProducto.SPRITE.getOpcion();
                        break;
                    case FANTA:
                        productoNum = ValorProducto.FANTA.getOpcion();
                        break;
                    case SUPER8:
                        productoNum = ValorProducto.SUPER8.getOpcion();
                        break;
                    case SNICKERS:
                        productoNum = ValorProducto.SNICKERS.getOpcion();
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
                        break;
                }

                Comprador comprador=null;

                try{
                    comprador = new Comprador(moneda, productoNum, exp);
                    System.out.println("Producto: "+ comprador.queBebiste()+", Vuelto: "+comprador.cuantoVuelto());
                } catch (PagoInsuficienteException | PagoIncorrectoException | NoHayProductoException e){
                    System.err.println(e);
                }
                
                int cnt=-1;
                System.out.println("Desea comprar algo mas? (1 para si, otro entero para no): ");
                cnt=scanner.nextInt();
                if(cnt==1){
                    continue;
                }
                else{
                    loop=false;
                    break;
                }
                
                
        }

        try(scanner){
        } catch(Exception e){
            System.err.println(e);
        }
    
    }
}