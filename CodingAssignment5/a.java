
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class a
{
     public static void main(String[] args) {
        System.out.println("Test Remove Zeros");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,0,0,1,4,0,6,0));
        System.out.println("Starting List: " + nums);
        removeZeros(nums);
        System.out.println("Expected: [3, 4, 1, 4, 6] \n Actual: " + nums);

        System.out.println();

        ArrayList<String> words = new ArrayList<>(Arrays.asList("this", "is", "a", "list", "of", "words"));
        System.out.println("Test Letter Counter:");
        System.out.println(words);
        System.out.println("Expected: 18 \n Actual: " + countLetters(words));

        System.out.println();

        System.out.println("Test keyPosition: find a 1");
        System.out.println(nums);
        System.out.println("Expected: 2 \n Actual: " + findPosition(1, nums));

        System.out.println();

        System.out.println("Test parse into array");
        System.out.println("Expected: [W, e, s, t, , L, i, n, n] \n Actual: " + parseIntoArrayList("West Linn"));

        System.out.println();

        System.out.println("Test FindMin for Personobjects");
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person(32, "Abe"),
                new Person(14, "Betty"), new Person(18, "Cris")));
        System.out.println(people);
        System.out.println("Expected: BETTY \n Actual: " + findMin(people));

        System.out.println();

        System.out.println("Purse Test:");
        Purse myPurse = new Purse();
        myPurse.add(new Coin(.25, "quarter"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.01, "penny"));
        myPurse.add(new Coin(.25, "quarter"));

        System.out.println(myPurse);
        System.out.println("# of Quarters = " + myPurse.count(new Coin(.25, "quarter")));
        System.out.println("Smallest Coin = " + myPurse.findSmallest());
        System.out.println("Total of Purse = $" + myPurse.getTotal());

    }
   public static void removeZeros(ArrayList<Integer>list){
       for(int i=0;i<list.size();){
           if(list.get(i)==0){
            list.remove(i);
           }else{
            i++;
            }
       }
   }
   public static int countLetters(ArrayList list){
    int sum=0;
       for(int i=0; i<list.size();i++){
           sum+=list.get(i).toString().length();
       }
    return sum;
    }
   public static int findPosition(int keyValue,ArrayList <Integer> list ){
        int index=-1;
        for(int i=0; i<list.size();i++){
            if(keyValue==list.get(i)){
                index=i;
            } 
        }
        return index;
   }
   public static ArrayList parseIntoArrayList(String input){
       ArrayList <String> out = new ArrayList <String>();
       for(int i=0;i<input.length();i++){
           out.add(input.substring(i,i+1));
        }
        return out;
    }
   public static String findMin(ArrayList <Person> list){
       int indexMin=0;
       int minAge = list.get(0).getAge();
       for(int i=1; i<list.size(); i++){
           if(list.get(i).getAge()<minAge){
            minAge=list.get(i).getAge();
            indexMin=i;
            }
       }
       return list.get(indexMin).getName();
   }
   
}
