package ru.gb.javalvl2.almazbakiev;

import java.util.Scanner;

public class CreateArray {

    private final int ROWS_AND_COLS_CONST = 4;
    private int rows;
    private int cols;
    private int sumRowsAndCols;

    public CreateArray(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public String[][] initialArray() {
        String[][] arrString = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("������� ������ � " + (i + 1) + "-� ������ � " + (j + 1) + "-� ������: ");
                Scanner sc = new Scanner(System.in);
                arrString[i][j] = sc.nextLine();
            }
        }
        return arrString;
    }

    public void checkArray(String[][] arrString) throws MyArraySizeException, NumberFormatException {
        if (rows == ROWS_AND_COLS_CONST && cols == ROWS_AND_COLS_CONST) {
            System.out.println("��������� ������ 4�4!");
        } else {
            throw new MyArraySizeException("MyArraySizeException: ��������� ������ �� 4�4, � ������ 4�4!!!");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int[][] number = new int[ROWS_AND_COLS_CONST][ROWS_AND_COLS_CONST];
                try {
                    number[i][j] = Integer.parseInt(arrString[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("MyArrayDataException: � " + (i + 1) + "-� ������ " + (j + 1) + "-�� ������� ������ ���������� ������������� � Integer");
                }
                sumRowsAndCols += number[i][j];
            }
        }
        System.out.println("����� ����� � ������� ����� " + sumRowsAndCols);
    }
}
