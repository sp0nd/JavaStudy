package com.tuyano.gradle;
import java.util.*;
public class FenceBugGame {
    public static Random random = new Random();
    public static Scanner scan = new Scanner(System.in);
    public static int[][] Fence(int row, int col){
        int[][] FenceArray= new int[row][col];
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                if(i == 0 || j == 0 || i == row - 1 || j == col - 1)
                    FenceArray[i][j]=-1;
        return FenceArray;
    }
    public static void view(int[][] FenceArray){
        for(int i[] : FenceArray) {
            for (int j : i)
                if (j >= 0 && j < 10)    System.out.print("0" + j + " ");
                else                    System.out.print(j + " ");
            System.out.println();
        }
    }
    public static int Search(int[][] FenceArray) {
        int row = FenceArray.length, col = FenceArray[0].length;
        for(int i = 1; i < row - 1; i++)
            for(int j = 1; j < col - 1; j++)
                if(FenceArray[i][j] == 0)
                    return 0;
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("enter row,col : ");
        int row, col, x, y, dx, dy;
        row = scan.nextInt();
        col = scan.nextInt();
        int[][] FenceArray = Fence(row, col);
        x = random.nextInt(row - 2) + 1;
        y = random.nextInt(col - 2) + 1;
        FenceArray[x][y] = 1;
        view(FenceArray);
        System.out.println("Start point : " + x + ", " + y);
        for (;;) {
            dx = random.nextInt(3) - 1;
            dy = random.nextInt(3) - 1;
//            if(dx == 0 && dy == 0) continue;
//            if(FenceArray[x+dx][y+dy] == -1) continue;
//            x += dx; y += dy;
//            FenceArray[x][y]++;
            if(dx == 0 && dy == 0) continue;
            x += dx; y += dy;
            if(FenceArray[x][y] != -1) FenceArray[x][y]++;
            else { x -= dx; y -= dy; }
            if(Search(FenceArray) != 0) break;
        }
        System.out.println("End point : " + x + ", " + y);
        view(FenceArray);
    }
}