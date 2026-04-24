package Maquina_Expendedora;

class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cual, Expendedor exp){
        Bebida b= exp.comprarBebida(m,cual);
        if(b!=null){
            sonido=b.beber();
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
    public String queBebiste(){
        return sonido;
    }
}