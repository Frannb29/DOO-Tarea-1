package Maquina_Expendedora;

class Moneda500 extends Moneda {
    public Moneda500(){
        super();
    }
    
    @Override
    public int getValor(){
        return 500;
    }

    @Override
    public int compareTo(Moneda m){
        return Integer.compare(500, m.getValor());
    }

    @Override
    public String toString(){
        return "Valor: "+500+", Serie: "+this.hashCode();
    }
}