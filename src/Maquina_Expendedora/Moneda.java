package Maquina_Expendedora;

abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){
    }
    public Moneda getSerie(){
        return this;

    }
    public abstract int getValor();

    
}