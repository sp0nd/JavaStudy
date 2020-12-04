package com.tuyano.gradle;
class Point{
   int x,y;
      Point(int n,int m){
       x=n;y=m;
      }
}
interface StackInterface{
    public boolean IsEmpty();
    public boolean IsFull();
    public int Element();
    public void Push(Point p);
    public Point Pop();
}
class QueenStack implements StackInterface{
    int top,size;
    Point[] data;
    int[][] board;
    QueenStack(int Size){
        size=Size;
        top=-1;
        data=new Point[size];
        board=new int[size][size];
    }

    public boolean IsEmpty(){return top==-1;}
    public boolean IsFull(){return top==size - 1;}
    public int Element(){
        if(data==null) {System.out.println("Already Empty."); return 1;}
        if(IsFull()) {System.out.println("Already Full."); return 1;}
        for(int i=0;i<top;i++)
            System.out.println(data[i].x+","+data[i].y);
        System.out.println();
        return 1;
    }

    public void Push(Point p){
        if(!IsFull()){ data[++top]=p;}
        else System.out.println("Stack List is Full.");
    }

    public Point Pop(){
        if(!IsEmpty())  return data[top--]=null;

        else{
            System.out.println("Stack List is Empty.");
            return null;
        }
    }
    int[][] PrintBoard(int[][] board){
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        return board;
    }
//    boolean CheckMove(int currentRow, int col){
//        int leftTemp=currentRow;
//        int rightTemp=currentRow;
//        if(currentRow==0) return true;
//        for(int i=currentRow;i>-1;i--) // up
//            if(board[i][col]!=0)          return false;
//
//
//        for(int i=col;i>0;i--)        // upper left diagonal
//            if(board[leftTemp--][i]!=0)return false;
//
//
//        for(int i=col;i<size;i++)    // upper right diagonal
//            if(board[rightTemp--][i]!=0) return false;
//        return true;
//    }

    boolean slope(int i ,int j, int row, int col) {

        double result = (row - i) / (double)(col - j);

        if ( Math.abs(result) == 1) return true;
        return false;
    }

    boolean CheckMove(int row, int col){

        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < size; j++ ) {
                if ( board[i][j] == 1 ) {
                    if ( j == col || slope(i, j, row, col) ) return false;
                }
            }
        }
        return true;
    }

    int[][] SolveQueen(){
        int[][] copy= new int[size][size];
        int row=0,col=0;
        while(row<size)
        {

            if(CheckMove(row,col)){
                board[row][col]=1;
                Push(new Point(row,col));
                if(row<size-1)row++;
                col=0;
            }
            else { // CheckMove(row,col) != true
                if(col==size-1){ //col== 3
                    row=data[top].x;
                    col=data[top].y;

                    board[row][col]=0;
                    Pop();
                }
                if(col<size-1) col++;
                else {
                    row=data[top].x;
                    col=data[top].y;
                    board[row][col]=0;
                    col++;
                    Pop();
                }
            }
            if(top==size-1&&data[top]!=null) break;
        }
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                copy[i][j]=board[i][j];
        return copy;
    }
}
public class QueenProblem {
    public static void main(String[] args) {
        QueenStack stack =new QueenStack(8); //stack size + board Size
        stack.PrintBoard(stack.board);

        stack.PrintBoard(stack.SolveQueen());
    }
}
