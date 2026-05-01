package Maquina_Expendedora;

class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, ValorProducto cualProducto, Expendedor exp){
        Producto auxiliar =exp.comprarProducto(m,cualProducto);
        if(auxiliar!=null){
            sonido= auxiliar.consumir();
        }
        else{
            sonido=null;
        }
        vuelto=0;
        Moneda monedaVuelto=exp.getVuelto();
        while(monedaVuelto!=null) {
            vuelto+=monedaVuelto.getValor();
            monedaVuelto=exp.getVuelto();
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return sonido;
    }
}