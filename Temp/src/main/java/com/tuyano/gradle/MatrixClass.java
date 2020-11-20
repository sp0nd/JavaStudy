package com.tuyano.gradle;
import java.util.*;
public class MatrixClass {
    public static Random rand = new Random();
    public static class Matrix {
        int row, col;
        int[] matrix;
        Matrix() {}
        Matrix(int a, int b) {
            row = a; col = b;
            matrix = new int[row * col];
            for (int i = 0; i < row * col; i++)
                matrix[i] = rand.nextInt(5) + 1;
        }
        void View(int n) {
            int e;
            if (n == 0) { // Classical loop, 2D Array Style - Nested
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        e = matrix[i * col + j];
                        if (e < 9 && e >= 0)    System.out.print(" " + e + " ");
                        else                    System.out.print(e + " ");
                    }
                    System.out.println();
                }
            }
            else if (n == 1) { // Classical loop
                for (int i = 0; i < row * col; i++) {
                    e = matrix[(i / col) * col + i % col];
                    if (e < 9 && e >= 0)    System.out.print(" " + e + " ");
                    else                    System.out.print(e + " ");
                    if ((i + 1) % col == 0) System.out.println();
                }
            }
            else { // Advanced loop
                int count = 0;
                for (int i : matrix) {
                    if (i < 9 && i >= 0)        System.out.print(" " + i + " ");
                    else                        System.out.print(i + " ");
                    if ((count + 1) % col == 0) System.out.println();
                    count++;
                }
            }
            System.out.println();
        }
    }
    public static class Calculator extends Matrix {
        Calculator() {}
        Matrix Sum(Matrix A, Matrix B) {
            this.row = A.row; this.col = A.col;
            this.matrix = new int[this.row * this.col];
            if (A.row != B.row || A.col != B.col) {
                System.out.println("The sizes of the two matrices are different.");
                this.matrix = new int[1];
                return this;
            }
            for (int i = 0; i < A.row * A.col; i++)
                matrix[i] = A.matrix[i] + B.matrix[i];
            return this;
        }
        Matrix Sub(Matrix A, Matrix B) {
            this.row = A.row; this.col = A.col;
            this.matrix = new int[this.row * this.col];
            if (A.row != B.row || A.col != B.col) {
                System.out.println("The sizes of the two matrices are different.");
                this.matrix = new int[1];
                return this;
            }
            for (int i = 0; i < A.row * A.col; i++)
                matrix[i] = A.matrix[i] - B.matrix[i];
            return this;
        }
        Matrix Mul(Matrix A, Matrix B) {
            this.row = A.row; this.col = B.col;
            this.matrix = new int[this.row * this.col];
            if (A.col != B.row) {
                System.out.println("Violated the condition on matrix multiplication.");
                this.matrix = new int[1];
                return this;
            }
            for (int i = 0; i < A.row; i++)
                for (int j = 0; j < B.col; j++)
                    for (int k = 0; k < A.col; k++)
                        matrix[i * A.col + j] += A.matrix[i * A.col + k] * B.matrix[k * A.col + j];
            return this;
        }
        void View(int n) {
            if (this.matrix.length == 1) return;
            super.View(n);
        }
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Matrix A = new Matrix(2, 3);
        Matrix B = new Matrix(2, 3);
        Matrix C = new Matrix(3, 3);
        A.View(2); B.View(2);
        cal.Sum(A, B).View(2);
        cal.Sub(A, B).View(2);
        A.View(0); C.View(1);
        cal.Mul(A, C).View(2);

    }
}