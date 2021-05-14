
import java.util.ArrayList;
import java.util.List;
public class Purse { 
    private ArrayList <Coin> coins; 
    
    public Purse() { 
        ArrayList <Coin> coins = new ArrayList <Coin> (); 
    }
 
    // adds aCoin to the purse 
    public void add(Coin aCoin) { 
        coins.add(aCoin); 
    } 
 
    // returns total value of all coins in purse 
    public double getTotal() {
        double total=0;
        for(Coin a:coins){
            total+=a.getValue();
        }
        //COMPLETE THIS METHOD!
        return total;
    } 
 
    // returns the number of coins in the Purse that matches aCoin 
    // (both myName & myValue) 
    public int count(Coin aCoin) {
        int counter=0;
        for(int i=0; i<coins.size(); i++){
            if(coins.get(i).equals(aCoin)){
                counter++;
            }
        }
        return counter;
        //COMPLETE THIS METHOD
    } 
    // returns the name of the Coin in the Purse that has the smallest value
    public String findSmallest(){
        int index=0;
        double small = coins.get(0).getValue();
        for(int i=1;i<coins.size(); i++){
            if(coins.get(i).getValue()<small){
                small=coins.get(i).getValue();
                index=i;
            }
        }
        return coins.get(index).getName();
    }
}

