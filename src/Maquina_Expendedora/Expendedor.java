package Maquina_Expendedora;

class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> super8;
    private Deposito<Dulce> snickers;
    private Deposito<Moneda> monVu;
    public Expendedor(int numProducto){
        coca=new Deposito();
        sprite=new Deposito();
        fanta=new Deposito();
        super8=new Deposito();
        snickers=new Deposito();
        monVu=new Deposito();
        for(int i=0;i<numProducto;i++){
            coca.add(new CocaCola(100+i));
            sprite.add(new Sprite(200+i));
            fanta.add(new Fanta(300+i));
            super8.add(new Super8(400+i));
            snickers.add(new Snickers(500+i));
        }
    }
    public Producto comprarProducto(Moneda m,ValorProducto producto){
        if(m==null){
            return null;
        }
        int precioProducto=producto.getPrecio();
        if(m.getValor()<precioProducto){
            monVu.add(m);
            return null;
        }
        Producto productoAuxiliar=null;
        if(producto==ValorProducto.COCA){
            productoAuxiliar=coca.get();
        }
        else if(producto==ValorProducto.SPRITE){
            productoAuxiliar=sprite.get();
        }
        else if(producto==ValorProducto.FANTA){
            productoAuxiliar=fanta.get();
        }
        else if(producto==ValorProducto.SUPER8){
            productoAuxiliar=super8.get();
        }
        else if(producto==ValorProducto.SNICKERS){
            productoAuxiliar=snickers.get();
        }
        if(productoAuxiliar!=null){
            int vuelto= m.getValor()-precioProducto;
            while(vuelto>0){
                monVu.add(new Moneda100());
                vuelto-=100;
            }
            return productoAuxiliar;
        }
        else{
            monVu.add(m);
            return null;
        }
    }
    public Moneda getVuelto(){
        return monVu.get();
    }
}
