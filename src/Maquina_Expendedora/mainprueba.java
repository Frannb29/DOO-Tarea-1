package Maquina_Expendedora;

public class mainprueba {
    public static void main(String[] args) {
        Expendedor exp=new Expendedor(2, 200);
        
        Comprador c1= new Comprador(new Moneda1000(), 1, exp);
        System.out.println(c1.queBebiste()+", vuelto: "+c1.cuantoVuelto());
        
        Comprador c2=new Comprador(new Moneda500(), 1, exp);
        System.out.println(c2.queBebiste()+", vuelto: "+c2.cuantoVuelto());

        Comprador c3=new Comprador(new Moneda500(), 1, exp);
        System.out.println(c3.queBebiste()+", vuelto: "+c3.cuantoVuelto());

        Comprador c4=new Comprador(new Moneda100(), 2, exp);
        System.out.println(c4.queBebiste()+", vuelto: "+c4.cuantoVuelto());

        Comprador c5=new Comprador(null, 2, exp);
        System.out.println(c5.queBebiste()+", vuelto: "+c5.cuantoVuelto());

        Comprador c6=new Comprador(new Moneda1000(), 2, exp);
        System.out.println(c6.queBebiste()+", vuelto: "+c6.cuantoVuelto());

    }
}
