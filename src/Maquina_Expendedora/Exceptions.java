package Maquina_Expendedora;

class NoHayProductoException extends Exception{
    public NoHayProductoException(){
        super("No queda producto en el deposito");
    }
}

class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(){
        super("Pago insuficiente");
    }
}

class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(){
        super("No se ha ingresado una moneda");
    }
}