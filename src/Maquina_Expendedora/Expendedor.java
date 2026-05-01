package Maquina_Expendedora;

class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    private Deposito sprite;
    private Deposito coca;
    private DepositoM monVu;
    private int precio;

    public Expendedor(int cant, int precio) {
        this.sprite = new Deposito();
        this.coca = new Deposito();
        this.monVu = new DepositoM();
        this.precio = precio;

        for (int i = 0; i < cant; i++) {
            sprite.addBebida(new Sprite(i + 200));
            coca.addBebida(new CocaCola(i + 100));
        }

    }

    public Bebida comprarBebida(Moneda m, int select) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        Bebida b=null;
        if (m == null) {
            throw new PagoIncorrectoException();

        }
        else if (m.getValor() < this.precio) {
            monVu.addMoneda(m);
            throw new PagoInsuficienteException();
        }

        else{
            switch (select) {
                case COCA:
                    b=coca.getBebida();
                    if (b==null){
                        monVu.addMoneda(m);
                        throw new NoHayProductoException();
                    }
                    break;
                
                case SPRITE:
                    b=sprite.getBebida();
                    if (b==null){
                        monVu.addMoneda(m);
                        throw new NoHayProductoException();
                    }
                    break;

                default:
                    monVu.addMoneda(m);
                    return null;
            }
            
            int dif = (m.getValor() - this.precio) / 100;

            for (int i = 0; i < dif; i++) {
                monVu.addMoneda(new Moneda100());
            }
            return b;
        }
    }



    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}
