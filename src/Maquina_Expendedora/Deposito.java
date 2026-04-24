package Maquina_Expendedora;
import java.util.ArrayList;

class Deposito {
    private ArrayList<Bebida> arr;
    public Deposito(){
        this.arr = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b){
        this.arr.add(b);
    }
    public Bebida getBebida(){
        if(this.arr.size()==0){
            return null;
        }
        else{
            Bebida b=this.arr.remove(0);
            return b;
        }
    }
}