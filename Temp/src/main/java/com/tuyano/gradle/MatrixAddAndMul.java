package com.tuyano.gradle;
import java.util.*;
public class MatrixAddAndMul {
    public static Random random = new Random();
    public static void view(int[][] FenceArray){
        for(int[] i : FenceArray) {
            for (int j : i)
                if (j >= 0 && j < 10)    System.out.print("0" + j + " ");
                else                    System.out.print(j + " ");
            System.out.println();
        }
    }
    public static int[][] MakeArray(int n,int m){
        int[][] Array= new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                Array[i][j]=random.nextInt(10)+1;
        return Array;
    }
    public static int[][] ArrayAdd(int[][] ArrayA,int[][] ArrayB){
        int rowA=ArrayA.length; //2
        int colA=ArrayA[0].length; //3
        int rowB=ArrayB.length;//3
        int colB=ArrayB[0].length;//4
        int[][] ArrayAddition= new int[rowA][colA];
        if(rowA==rowB && colA==colB){
            for(int i=0;i<rowA;i++)
                for(int j=0;j<colA;j++)
                    ArrayAddition[i][j]=ArrayA[i][j]+ArrayB[i][j];
        }
        return ArrayAddition;
    }
    public static int[][] ArrayMul(int[][] ArrayA,int[][] ArrayB){
        int rowA=ArrayA.length; //2
        int colA=ArrayA[0].length; //3
        int rowB=ArrayB.length;//3
        int colB=ArrayB[0].length;//4
        int[][] ArrayMultiply= new int[rowA][colB];
        if (colA==rowB){
            for(int i=0;i<rowA;i++) // rowA X colB
                for(int j=0;j<colB;j++)// rowA X colB
                    for(int k=0;k<colA;k++) //colA==rowB
                        ArrayMultiply[i][j]+=ArrayA[i][k] * ArrayB[k][j];
        }
            return ArrayMultiply;
    }
    public static void main(String[] args){
        int n1,m1,n2,m2,s;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array1 row ,col : ");
        n1 = scan.nextInt();
        m1 = scan.nextInt();
        System.out.println( n1 + "," + m1 );
        System.out.println("Enter Array2 row ,col : ");
        n2 = scan.nextInt();
        m2 = scan.nextInt();
        int[][] ArrayA = MakeArray(n1,m1);
        int[][] ArrayB = MakeArray(n2,m2);
        System.out.println("Select number 1(Add) or 2(mul)");
        s= scan.nextInt();
        System.out.println("======ArrayA======");
        view(ArrayA);
        System.out.println("======ArrayB======");
        view(ArrayB);
        if(s==1){
            int[][] ArrayAddition=ArrayAdd(ArrayA,ArrayB);
            if(ArrayAddition[0][0]==0) {
                System.out.println("The matrix Add condition do not met.");
                return ;
            }
            System.out.println("======Addition======");
            view(ArrayAddition);
        }
        else{
            int[][] ArrayMultiply = ArrayMul(ArrayA,ArrayB);
            if(ArrayMultiply[0][0]==0) {
                System.out.println("Metric multiplication condition not valid.");
                return ;
            }
            System.out.println("======Multiply======");
            view(ArrayMultiply);
        }

    }
}
