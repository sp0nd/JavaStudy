package com.tuyano.gradle;
import java.util.*;
public class BugGame {

    public static Random random = new Random();

    public static int Search(int[][] a){
        int row=a.length;
        int col=a[0].length;
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                if(a[i][j]==0)
                    return 0;
        return 1;
    }
    public static void view(int[][] Array2D){
        for (int[] i : Array2D) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static int moving(int idx, int max){
        if (idx==0)             return random.nextInt(2);
        else if (idx==max-1)    return random.nextInt(2)-1;
        else                    return random.nextInt(3)-1;
    }

    public static void main(String[] args) {
        int row, col, x, y, dx, dy;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter row,col : ");

        row = scan.nextInt();       col = scan.nextInt();
        x=random.nextInt(row);      y=random.nextInt(col);

        int[][] Array2D = new int[row][col];
        Array2D[x][y]=1;  // 1로 배열원소 초기화

        System.out.println("Start Point : " + x + "," + y );

        for(;;)
        {
            dx=moving(x,row);       dy=moving(y,col);
            if( dx == 0 && dy == 0 ) continue;
            x += dx;                  y += dy;
            Array2D[x][y]++;
            if(Search(Array2D)!=0) break;
        }

        System.out.println("End Point : " + x + "," + y );

        view(Array2D);
    }
}