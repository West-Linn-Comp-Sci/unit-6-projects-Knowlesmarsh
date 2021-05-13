
/**
 * Write a description of class Frequence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Frequence
{
    public static void main(String args[]){
        //welcome user with instructions:
        System.out.println("Welcome to Frequence please enter any number from 1 to 100. \nIf you would like to stop imputing numbers please enter any alphabetical character");
        //create scanner
        Scanner input = new Scanner(System.in);
        //start our data collection loop
        boolean collect = true;
        //create input storage
        int[] storage = new int[214748364];
        int space = 0;
        while(collect==true){
            try{
                //gather that input
                int numIn = input.nextInt();
                //Test the input
                if(numIn<1||numIn>100){
                    System.out.println("please enter a valid number");
                }else{
                    storage[space]=numIn;
                    space++;
                }
            }catch(Exception e){
                collect=false;
            }
        }
        //start the chart
        int[] chart = new int[10];
        for(int i=0; storage[i]!=0; i++){
            //the if else if cascade to sort
            if(storage[i]<=10){
                chart[0]++;
            }else if(storage[i]<=20){
                chart[1]++;
            }else if(storage[i]<=30){
                chart[2]++;
            }else if(storage[i]<=40){
                chart[3]++;
            }else if(storage[i]<=50){
                chart[4]++;
            }else if(storage[i]<=60){
                chart[5]++;
            }else if(storage[i]<=70){
                chart[6]++;
            }else if(storage[i]<=80){
                chart[7]++;
            }else if(storage[i]<=90){
                chart[8]++;
            }else if(storage[i]<=100){
                chart[9]++;
            }
        }
        //Printing the chart :)))))))
        for(int i=0; i<=9; i++){
            System.out.print((1+i*10) +"-" +(10+i*10)+":"); 
            for(int j=0; j<chart[i]; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
