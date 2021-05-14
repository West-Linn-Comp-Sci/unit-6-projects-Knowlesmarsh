
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private int myAge;
    private String myName;
    /**
     * Constructor for objects of class Person
     */
    public Person(int ageTemp, String nameTemp)
    {
        // initialise instance variables
        myAge = ageTemp;
        myName=nameTemp;
    }
    public String getName(){
        return this.myName;
    }
    public int getAge(){
        return this.myAge;
    }
}
