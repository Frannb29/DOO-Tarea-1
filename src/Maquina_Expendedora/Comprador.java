package Maquina_Expendedora;

class Comprador {
    private String sonido;
    private int vuelto;

    
    public Comprador(Moneda m, ValorProducto cual, Expendedor exp) throws PagoInsuficienteException, PagoIncorrectoException,
    NoHayProductoException {
            this.sonido=null;
            this.vuelto=0;

            try{
                Producto b = exp.comprarProducto(m,cual);
                if(b!=null){
                    this.sonido=b.consumir();
                }
            }
            catch (PagoInsuficienteException | PagoIncorrectoException | NoHayProductoException e){
                Moneda mon;
                while((mon=exp.getVuelto())!=null){
                    this.vuelto+=mon.getValor();
                }
                throw e;
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