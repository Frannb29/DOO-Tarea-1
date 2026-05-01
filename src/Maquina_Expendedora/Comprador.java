package Maquina_Expendedora;

class Comprador {
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cual, Expendedor exp){
        try{
            Bebida b= exp.comprarBebida(m,cual);
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
        catch (NoHayProductoException np){
            this.vuelto+=exp.getVuelto().getValor();
            System.out.println(np);
        }

        catch (PagoInsuficienteException pi){
            this.vuelto+=exp.getVuelto().getValor();
            System.out.println(pi);
        }

        catch (PagoIncorrectoException pii){
            System.out.println(pii);
        }

    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return sonido;
    }
}