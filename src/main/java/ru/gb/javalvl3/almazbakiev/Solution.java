package ru.gb.javalvl3.almazbakiev;

public class Solution {

    public static void main(String[] args) {

//        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//        int[] arr2 = new int[]{2, 3, 4, 5, 6, 7, 8};
        int[] arr3 = new int[]{2, 3, 4, 5, 6, 7, 1};
//        int[] arr4 = new int[5];
//        int[] arr5 = new int[]{4, 1, 1, 1, 1};

//        System.out.println(hasArrayNumberOneAndFour(arr1));
//        System.out.println(hasArrayNumberOneAndFour(arr2));
        System.out.println(hasArrayNumberOneAndFour(arr3));
//        System.out.println(hasArrayNumberOneAndFour(arr4));
//        System.out.println(hasArrayNumberOneAndFour(arr5));
    }

    public static int[] returnNewArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            throw new EmptyArrayException("� �������� ��������� ����� �������� �� ������ ���������� ������������� ������");
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                i++;
                int lengthCopiedArray = array.length - i;
                int[] newArray = new int[lengthCopiedArray];
                System.arraycopy(array, i, newArray, 0, lengthCopiedArray);
                return newArray;
            }
        }
        throw new RuntimeException("������� ������ ������ ��������� ���� �� ���� ��������");
    }

    public static boolean hasArrayNumberOneAndFour(int[] array) {
        if (array == null) {
            throw new NullPointerException();
        }
        boolean isOne = false;
        boolean isFour = false;
        for (int element : array) {
            if (element == 1) {
                isOne = true;
            }
            if (element == 4) {
                isFour = true;
            }
            if (isOne && isFour) {
                return true;
            }
        }
        return false;
    }
}
