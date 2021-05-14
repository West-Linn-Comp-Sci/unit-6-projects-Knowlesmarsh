
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array2DExplorer
{
    
    public static int minRow(int[][] nums, int row){
        int min=nums[row][0];
        for(int target:nums[row]){
            if(min>target){
                min=target;
            }
        }
        return min;
    }
    public static int[] colMaxs(int[][] matrix){
        //create storage
        int[] storage= new int[matrix[0].length];
        //loop for each collum
        for(int i=0; i<matrix[0].length;i++){
            int max = matrix[0][i];
            //loop for each row
            for(int j=0; j<matrix.length;j++){
                //check the value in that row with the max
                if(matrix[j][i]>max){
                    max=matrix[j][i];
                }
            }
            storage[i]=max;
        }
        return storage;
    }
    public static int[] allRowSums(int[][] data){
        int[] storage = new int[data.length]; 
        int rowCounter=0;
        for(int[] row: data){
            int sum=0;
            for(int value: row){
                sum+=value;
            }
            storage[rowCounter]=sum;
            rowCounter++;
        }
        return storage;
    }
    public static double[] averageCol(int[][]nums){
        //create storage
        double[] storage= new double[nums[0].length];
        //loop the collums
        for(int i=0; i<nums[0].length;i++){
            double sum=0;
            //loop the rows
            for(int j=0; j<nums.length;j++){
                sum+=nums[j][i];
            }
            storage[i]=sum/nums.length;
        }
        return storage;
    }
    public static int smallEven(int[][] matrix){
        //create min holder
        int min=matrix[0][0];
        //check every value in every row
        for(int[] row:matrix){
            for(int num:row){
                //check for even and smaller
                if(num%2==0&&num<min){
                    min=num;
                }
            }
        }
        return min;
    }
    public static int biggestRow(int[][] nums){
        int maxIndex = 0;
        int maxValue = 0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int value:nums[i]){
                sum+=value;
            }
            if(sum>maxValue){
                maxValue=sum;
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
