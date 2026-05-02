package Maquina_Expendedora;
import java.util.Arrays;

public class mainprueba {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2);
        Comprador c1=null;
        Comprador c2=null;
        Comprador c3=null;
        Comprador c4=null;
        Comprador c5=null;
        Comprador c6=null;

        try {
            c1 = new Comprador(new Moneda1000(), ValorProducto.COCA, exp);
            System.out.println(c1.queBebiste() + ", vuelto: " + c1.cuantoVuelto());
        } catch (PagoInsuficienteException | PagoIncorrectoException | NoHayProductoException e) {
            System.err.println(e);
        }

        try {
            c2 = new Comprador(new Moneda500(), ValorProducto.COCA, exp);
            System.out.println(c2.queBebiste() + ", vuelto: " + c2.cuantoVuelto());
        } catch (PagoInsuficienteException | PagoIncorrectoException | NoHayProductoException e) {
            System.err.println(e);
        }

        try {
            c3 = new Comprador(new Moneda500(), ValorProducto.COCA, exp);
            System.out.println(c3.queBebiste() + ", vuelto: " + c3.cuantoVuelto());
        } catch (PagoInsuficienteException | PagoIncorrectoException | NoHayProductoException e) {
            System.err.println(e);
        }

        try {
            c4 = new Comprador(new Moneda100(), ValorProducto.SPRITE, exp);
            System.out.println(c4.queBebiste() + ", vuelto: " + c4.cuantoVuelto());
        } catch (PagoInsuficienteException | PagoIncorrectoException | NoHayProductoException e) {
            System.err.println(e);
        }

        try {
            c5 = new Comprador(null, ValorProducto.SPRITE, exp);
            System.out.println(c5.queBebiste() + ", vuelto: " + c5.cuantoVuelto());
        } catch (PagoInsuficienteException | PagoIncorrectoException | NoHayProductoException e) {
            System.err.println(e);
        }

        try {
            c6 = new Comprador(new Moneda1000(), ValorProducto.SNICKERS, exp);
            System.out.println(c6.queBebiste() + ", vuelto: " + c6.cuantoVuelto());
        } catch (PagoInsuficienteException | PagoIncorrectoException | NoHayProductoException e) {
            System.err.println(e);
        }

        Moneda m1=new Moneda100();
        Moneda m5=new Moneda500();
        Moneda m10=new Moneda1000();

        System.out.println(m5);
        System.out.println(m5.compareTo(new Moneda1000()));
        System.out.println(m5.compareTo(new Moneda500()));
        System.out.println(m5.compareTo(new Moneda100()));

        Moneda mons[]={m5,m10,m1};

        for(int i=0; i<3; i++){
            System.out.print(mons[i].getValor()+" ");
        }
        System.out.println();

        Arrays.sort(mons);

        for(int i=0; i<3; i++){
            System.out.print(mons[i].getValor()+" ");
        }
    }
}

