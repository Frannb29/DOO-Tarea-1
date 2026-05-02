package Maquina_Expendedora;

class Comprador {
    private String sonido;
    private int vuelto;

    
    public Comprador(Moneda m, int cual, Expendedor exp) throws PagoInsuficienteException, PagoIncorrectoException,
    NoHayProductoException {
            this.sonido=null;
            this.vuelto=0;

            Producto b= exp.comprarProducto(m,cual);
            if(b!=null){
                this.sonido=b.consumir();
            }
            Moneda mon;
            while((mon=exp.getVuelto())!=null){
                this.vuelto+=mon.getValor();
            }
        } 
    
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return sonido;
    }
}