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
            Sprite s = new Sprite(i + 200);
            CocaCola c = new CocaCola(i + 100);
            sprite.addBebida(s);
            coca.addBebida(c);

        }

    }

    public Bebida comprarBebida(Moneda m, int select) {
        if (m == null) {
            return null;
        }
        if (m.getValor() < this.precio) {
            monVu.addMoneda(m);
            return null;
        }
        Bebida b=null;
        if (select == COCA) {
            b = coca.getBebida();
        } else if (select == SPRITE) {
            b = sprite.getBebida();
        } else {
            monVu.addMoneda(m);
            return null;
        }
        int dif = (m.getValor() - this.precio) / 100;

        for (int i = 0; i < dif; i++) {
            monVu.addMoneda(new Moneda100());
        }
        return b;
    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}
