package Maquina_Expendedora;
import java.util.ArrayList;

public class Deposito<T>{
    private ArrayList<T> elementos;
    public Deposito(){
        elementos =new ArrayList<T>();
    }
    public void add(T objeto){
        elementos.add(objeto);
    }
    public T get(){
        if(elementos.size()>0){
            return elementos.remove(0);
        }
        else{
            return null;
        }
    }
}