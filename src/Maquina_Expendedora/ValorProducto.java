package Maquina_Expendedora;

public enum ValorProducto {
    COCA(1,300),
    SPRITE(2,200),
    FANTA(3,200),
    SUPER8(4,500),
    SNICKERS(5,1000);

    private int opcion;
    private int precio;

    ValorProducto(int opcion, int precio){
        this.opcion = opcion;
        this.precio = precio;
    }
    public int getOpcion(){
        return opcion;
    }
    public int getPrecio(){
        return precio;
    }

}