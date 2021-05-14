
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
   public static void main(String args[]){
        Array2DExplorer a = new Array2DExplorer();
        int[][] agh = {{1,2,3,4,5},{5,0,7,0,5},{0,2,3,4,71}};
        System.out.println(a.minRow(agh, 2));
        for(int i=0; i<agh[0].length;i++){
            System.out.print(a.colMaxs(agh)[i]+" ");
        }
        System.out.println();
        for(int i=0; i<agh.length;i++){
            System.out.print(a.allRowSums(agh)[i]+" ");
        }
        System.out.println();
        for(int i=0; i<agh[0].length;i++){
            System.out.print(a.averageCol(agh)[i]+" ");
        }
        System.out.println();
        System.out.println(a.smallEven(agh));
        System.out.println(a.biggestRow(agh));
    }
}
