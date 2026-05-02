package Maquina_Expendedora;

class Moneda1000 extends Moneda {
    public Moneda1000(){
        super();
    }
    @Override
    public int getValor(){
        return 1000;
    }

    @Override
    public int compareTo(Moneda m){
        return Integer.compare(1000, m.getValor());
    }

    @Override
    public String toString(){
        return "Valor: "+1000+", Serie: "+this.hashCode();
    }
}