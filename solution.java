/*
* Write a function to create a 2-D List/Array with random integers between 0 to 100.
* This function should take two arguments - numberOfRows and numberOfColumns and return 2D list.
2. Write a function to sort the 2-D list based on column index keeping the rows intact. This function should take two arguments -
* 2D list created above and column Index and return sorted 2D list.
* */

/*
4
5
[79, 40, 77, 19, 27]
[9, 44, 58, 40, 55]
[12, 14, 92, 59, 21]
[69, 97, 69, 3, 61]
2

[9, 44, 58, 40, 55]
[69, 97, 69, 3, 61]
[79, 40, 77, 19, 27]
[12, 14, 92, 59, 21]

Process finished with exit code 0

*/

import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] mat=new int[row][col];
    createmat(mat,row,col);
    int e=sc.nextInt();
    colsort(mat,row,col,e);
    }
    public  static void print(int [] [] r)
    {
        System.out.println(" ");
        for (int [] q:r
        ) {
            System.out.println(Arrays.toString(q));
        }

    }
    public static void colsort(int [][]mat,int row,int col,int e)
    {

        Arrays.sort(mat, (a, b) -> Integer.compare(a[e], b[e]));
        print(mat);

    }
    public static void createmat(int [][] mat,int row,int col)
    {
        Random r=new Random();
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                mat[i][j]=r.nextInt(100);
            }


        }
        for (int [] q:mat
             ) {
            System.out.println(Arrays.toString(q));
        }


    }


}
