package Maquina_Expendedora;
import java.util.ArrayList;

class DepositoM{
    private ArrayList<Moneda> arr;
    public DepositoM(){
        this.arr = new ArrayList<Moneda>();
    }
    public void addMoneda(Moneda m){
        this.arr.add(m);
    }
    public Moneda getMoneda(){
        if(this.arr.size()==0){
            return null;
        }
        else{
            Moneda m=this.arr.remove(0);
            return m;
        }
    }
}