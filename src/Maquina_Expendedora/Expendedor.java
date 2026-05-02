package Maquina_Expendedora;

class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> super8;
    private Deposito<Dulce> snickers;
    private Deposito<Moneda> monVu;

    public Expendedor(int cant) {
        coca=new Deposito<Bebida>();
        sprite=new Deposito<Bebida>();
        fanta=new Deposito<Bebida>();
        super8=new Deposito<Dulce>();
        snickers=new Deposito<Dulce>();
        monVu=new Deposito<Moneda>();

        for (int i = 0; i < cant; i++) {
            coca.add(new CocaCola(100+i));
            sprite.add(new Sprite(200+i));
            fanta.add(new Fanta(300+i));
            super8.add(new Super8(400+i));
            snickers.add(new Snickers(500+i));
        }

    }

    public Producto comprarProducto(Moneda m, int select) throws PagoIncorrectoException, 
        PagoInsuficienteException, NoHayProductoException{

        Producto p=null;
        int precioProducto=ValorProducto.values()[select-1].getPrecio();
        ValorProducto op=ValorProducto.values()[select-1];

        if (m == null) {
            throw new PagoIncorrectoException();

        }
        else if (m.getValor() < precioProducto) {
            monVu.add(m);
            throw new PagoInsuficienteException();
        }

        else{
            switch (op) {
                case COCA:
                    p=coca.get();
                    if (p==null){
                        monVu.add(m);
                        throw new NoHayProductoException();
                    }
                    break;
                
                case SPRITE:
                    p=sprite.get();
                    if (p==null){
                        monVu.add(m);
                        throw new NoHayProductoException();
                    }
                    break;

                case FANTA:
                    p=fanta.get();
                    if (p==null){
                        monVu.add(m);
                        throw new NoHayProductoException();
                    }
                    break;
                
                case SUPER8:
                    p=super8.get();
                    if (p==null){
                        monVu.add(m);
                        throw new NoHayProductoException();
                    }
                    break;
                case SNICKERS:
                    p=snickers.get();
                    if (p==null){
                        monVu.add(m);
                        throw new NoHayProductoException();
                    }
                    break;

                default:
                    monVu.add(m);
                    throw new NoHayProductoException();
            }
            
            int dif = (m.getValor() - precioProducto) / 100;

            for (int i = 0; i < dif; i++) {
                monVu.add(new Moneda100());
            }
            return p;
        }
    }



    public Moneda getVuelto(){
        return monVu.get();
    }
}
