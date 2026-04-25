package Maquina_Expendedora;

public abstract class Dulce extends Producto{
    public Dulce(int serie){
        super(serie);
    }
    @Override
    public abstract String consumir();
}
