package ru.gb.javalvl2.almazbakiev;

public class App {
    public static void main(String[] args) {

        Array array = new Array(4, 4);

        try {
            array.checkArray(array.initialArray());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}

//for (int i = 0; i < ROWS_AND_COLS_CONST; i++) {
//        for (int j = 0; j < ROWS_AND_COLS_CONST; j++) {
//        int number;
//        number = Integer.parseInt(arrString[i][j]);
//        if (number == Integer.parseInt(arrString[i][j])) {
//        sumRowsAndCols += number;
//        } else {
//        throw new MyArrayDataException("MyArrayDataException: В " + i + "-й строке " + j + "-ом столбце символ невозможно преобразовать в Integer");
//        }
//        }
//        }



//    public void checkArray(String[][] arrString) throws MyArraySizeException, MyArrayDataException {
//        if (rows == ROWS_AND_COLS_CONST && cols == ROWS_AND_COLS_CONST) {
//            System.out.println("Строковый массив 4х4!");
//        } else {
//            throw new MyArraySizeException("MyArraySizeException: Строковый массив не 4х4, а должен 4х4!!!");
//        }
//        int number = 0;
//        for (int i = 0; i < ROWS_AND_COLS_CONST; i++) {
//            for (int j = 0; j < ROWS_AND_COLS_CONST; j++) {
//                number += Integer.parseInt(arrString[i][j]);
//                if (number >= sumRowsAndCols) {
//                    sumRowsAndCols += Integer.parseInt(arrString[i][j]);
//                } else {
//                    throw new MyArrayDataException("MyArrayDataException: В " + i + "-й строке " + j + "-ом столбце символ невозможно преобразовать в Integer");
//                }
//            }
//        }
//        System.out.println("Сумма чисел в массиве равна " + sumRowsAndCols);
//    }