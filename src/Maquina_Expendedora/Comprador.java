package Maquina_Expendedora;

class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, ValorProducto cualProducto, Expendedor exp){
        Producto b= exp.comprarBebida(m,cualProducto);
        if(b!=null){
            sonido=b.consumir();
        }
        else{
            sonido=null;
        }
        this.vuelto=0;
        Moneda mon;
        while((mon=exp.getVuelto())!=null){
            this.vuelto+=mon.getValor();
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queConsumiste(){
        return sonido;
    }
}