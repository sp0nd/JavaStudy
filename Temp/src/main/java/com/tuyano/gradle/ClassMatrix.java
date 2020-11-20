package com.tuyano.gradle;
import java.sql.SQLOutput;
import java.util.*;
class Matrix{
    protected int row;
    protected int col;
    int[] element;
    public Random random = new Random();
    public Matrix(int N, int M){
        row=N;          col=M;
        element=new int[row * col];
    }
    Matrix init() {
        for (int i = 0; i < row * col; i++)
                this.element[i] = random.nextInt(5) + 1;
        return this;
    }
    void view(){
        int Ae;
        if(element.length==1) return;
        else if(this.element[0]==0) return;
        for(int i=0;i<this.row;i++){
            for (int j=0;j<this.col;j++){
                Ae=this.element[( i * this.row) + j];
                if (Ae < 10 && Ae > -1)
                    System.out.print("0" + Ae + " ");
                else
                    System.out.print( Ae + " ");
            }
            System.out.println();
        }
    }
}
class CalculateAndSave extends Matrix{

    CalculateAndSave(int N, int M) {
        super(N, M);
    }
    Matrix Add(Matrix a,Matrix b){
        if(a.row!=b.row ||a.col !=b.col ||a.row!=this.row || a.col != this.col){
            if(a.row!=this.row || a.col != this.col)
                System.out.println("This matrix can't be stored in storage.");
            else
                System.out.println("The sizes of the two matrices are different.");
            return this;
        }
        for(int i=0;i<a.row*a.col;i++)
                this.element[i]=a.element[i]+b.element[i];
        return this;
    }
    Matrix Sub(Matrix a, Matrix b){
        if(a.row != b.row || a.col !=b.col || a.row!=this.row || a.col != this.col){
            if(a.row!=this.row || a.col != this.col)
                System.out.println("This matrix can't be stored in storage.");
            else
                System.out.println("The sizes of the two matrices are different.");
            return this;
        }
        for(int i=0;i<a.row*a.col;i++)
            this.element[i]=a.element[i]-b.element[i];
        return this;
    }
    Matrix Mul(Matrix a, Matrix b){
        if(a.col != b.row || a.row != this.row || b.col != this.col){
            if(a.row != this.row || b.col != this.col)
                System.out.println("This matrix can't be stored in storage.");
            else
                System.out.println("Violated the condition on matrix multiplication.");
            return this;
        }
        for(int i=0;i<a.row;i++)
            for(int j=0;j<b.col;j++)
                for(int k=0;k<b.row;k++)
                this.element[ i * a.row + j ] += a.element[ i * a.col + k ]*b.element[ k * b.row + j ];

        return this;
    }
}
public class ClassMatrix {

    public static void main(String[] args) {

        Matrix A = new Matrix(2,2);
        Matrix B = new Matrix(2,2);
        CalculateAndSave C = new CalculateAndSave( 2, 2);
        A.init();
        B.init();
        A.view();
        System.out.println();
        B.view();
        System.out.println();
        C.Mul(A, B).view();
//        Matrix
//        Calculator X = new Calculator(2, 3);
//        /////////////////////////////////////////////
//        Scanner scan = new Scanner(System.in);
//        int N1,M1,N2,M2,N3,M3;
//
//        N1=scan.nextInt();
//        M1=scan.nextInt();
//        System.out.println(N1 + " ," + M1);
//
//        N2=scan.nextInt();
//        M2=scan.nextInt();
//        System.out.println(N2 + " ," + M2);
//
//        N3=scan.nextInt();
//        M3=scan.nextInt();
//        System.out.println(N3 + " ," + M3);
//
//        Matrix A=new Matrix(N1,M1);
//        Matrix B=new Matrix(N2,M2);
//        Matrix C=new Matrix(N2,M2);
//        A.Sum(B);
//        A.view();
//        B.view();
//        C.view();
    }
}
