package data.structures;

public class isToeplitzMatrix {

    static boolean isToeplitz(int[][] arr) {
        // your code goes here
        if(arr.length<=1 || arr[0].length <=1){
            return true;
        }

        for(int r=1;r<arr.length;r++){
            for(int c=1;c<arr[0].length;c++){
                if(!(arr[r-1][c-1]== arr[r][c])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    int[][] arr= {{1,2,3,4},
        {5,1,9,3},
        {6,5,1,2}};
    System.out.println(isToeplitz(arr));
    }

}
