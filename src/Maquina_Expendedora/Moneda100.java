package Maquina_Expendedora;

class Moneda100 extends Moneda {
    public Moneda100(){
        super();
    }

    @Override
    public int getValor(){
        return 100;
    }

    @Override
    public int compareTo(Moneda m){
        return Integer.compare(100, m.getValor());
    }
    
    @Override
    public String toString(){
        return "Valor: "+100+", Serie: "+this.hashCode();
    }
}