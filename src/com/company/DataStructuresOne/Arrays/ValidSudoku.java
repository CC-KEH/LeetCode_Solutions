package com.company.DataStructuresOne.Arrays;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] st =       {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                           , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                           , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                           , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                           , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                           , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                           , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                           , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                           , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(st));
    }
    public static boolean isValidSudoku(char[][] board) {
        return checkSudoku(board,0,0);
    }

    private static boolean checkSudoku(char[][] st,int i, int j) {

        if(checkHorizontal(i,j,st) && checkVertical(i,j,st) && checkBox(i,j,st)){
            if(j<st[0].length){
                return checkSudoku(st,i,++j);
            }else{
                j=0;
                return checkSudoku(st,++i,j);
            }
        }else{
            return false;
        }
    }

    private static boolean checkBox(int i, int j, char[][] st) {
        int row = Math.abs(i/3);
        int col = Math.abs(j/3);
        for (int k = 0; k < row; k++) {
            for (int l = 0; l <col ; l++) {
                if(st[k][l]==st[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkHorizontal(int row,int col,char[][] st){
        for(int i = 0; i<col ; i++) {
           if(st[row][i] == st[row][col]){
               return false;
           }
        }
        return true;
    }
    private static boolean checkVertical(int row,int col,char[][] st){
        for(int i = 0; i<row ; i++) {
            if(st[i][col] == st[row][col]){
                return false;
            }
        }
        return true;
    }
}
