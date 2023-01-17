/*
* Write a function to create a 2-D List/Array with random integers between 0 to 100.
* This function should take two arguments - numberOfRows and numberOfColumns and return 2D list.
2. Write a function to sort the 2-D list based on column index keeping the rows intact. This function should take two arguments -
* 2D list created above and column Index and return sorted 2D list.
* */

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
    public static void colsort(int [][]mat,int row,int col)
    {
        int [][] t=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                t[i][j]=mat[j][i];
            }
        }
        System.out.println(" ");
        for (int [] q:t
        ) {
            System.out.println(Arrays.toString(q));
        }
        for (int [] q:t
             ) {
            Arrays.sort(q);

        }
        System.out.println(" ");
        for (int [] q:t
        ) {
            System.out.println(Arrays.toString(q));
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=t[j][i];
            }
        }
        for (int [] q:mat
        ) {
            System.out.println(Arrays.toString(q));
        }

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
