package Maquina_Expendedora;

public enum ValorProducto {
    COCA(1,700),
    SPRITE(2,800),
    FANTA(3,900),
    SUPER8(4,400),
    SNICKERS(5,500);

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
