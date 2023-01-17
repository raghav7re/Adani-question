/*
* Write a function to create a 2-D List/Array with random integers between 0 to 100.
* This function should take two arguments - numberOfRows and numberOfColumns and return 2D list.
2. Write a function to sort the 2-D list based on column index keeping the rows intact. This function should take two arguments -
* 2D list created above and column Index and return sorted 2D list.
* */

/*
5
7
[81, 53, 95, 60, 87, 77, 81]
[77, 88, 44, 39, 8, 44, 1]
[56, 47, 66, 55, 81, 0, 43]
[3, 61, 97, 51, 62, 98, 96]
[78, 38, 75, 98, 36, 56, 11]

[3, 61, 97, 51, 62, 98, 96]
[56, 47, 66, 55, 81, 0, 43]
[77, 88, 44, 39, 8, 44, 1]
[78, 38, 75, 98, 36, 56, 11]
[81, 53, 95, 60, 87, 77, 81]

*/

import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] mat=new int[row][col];
    createmat(mat,row,col);
    colsort(mat,row,col);
    }
    public  static void print(int [] [] r)
    {
        System.out.println(" ");
        for (int [] q:r
        ) {
            System.out.println(Arrays.toString(q));
        }

    }
    public static void colsort(int [][]mat,int row,int col)
    {
       // int [][] t= (int[][]) Arrays.stream(mat).sorted((a)->Comparator.comparingInt().toArray();
        Arrays.sort(mat, (a, b) -> Integer.compare(a[0], b[0]));
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
