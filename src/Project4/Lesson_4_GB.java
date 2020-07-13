package Project4;

import java.util.Random;
import java.util.Scanner;

public class Lesson_4_GB {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
//    Начинаем 3 задание.
//    public static final int SIZE = 6;
//    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_0 = '0';
    public static final char DOT_X = 'X';

    public static void main(String[] args){
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (checkWin(DOT_X)){
                System.out.println("Человек победил.");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья.");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)){
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
        }
        System.out.println("Игра окончена.");

    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }


    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap(){
        for (int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++){
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static Scanner sc = new Scanner(System.in);
    public static void humanTurn() {
        int x,y;
        do {
            System.out.println("Введите кардинаты в формате X, Y.");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }
    public static boolean  isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE){
            return false;
        }
        if (map[x][y] == DOT_EMPTY){
            return true;
        }else{
            return false;
        }
    }
    public static Random rand = new Random();
    public static void aiTurn(){
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }while (!isCellValid(x,y));
        System.out.println("Искуственный Интеллект сходил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_0;
    }
//    public static boolean checkWin(char symb) {
//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
//    }


//2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    public static boolean checkWin(char symb) {
        if (checkDiagonal(symb) || checkLanes(symb)){
            return true;
        }
        return false;

    }
    public static boolean checkLanes(char symb){
        boolean vertical, horizon;
        for (int hor = 0; hor < SIZE; hor++){
            vertical = true;
            horizon = true;
            for (int ver = 0; ver < SIZE; ver++){
                vertical &= (map[ver][hor] == symb);
                horizon &= (map[hor][ver] == symb);
            }
            if (vertical || horizon){
                return true;
            }
        }
        return false;
    }
    public static boolean checkDiagonal(char symb){
        boolean toleft = true;
        boolean toright = true;
        for (int i = 0; i < SIZE; i++){
            toright &= (map[i][i] == symb);
            toleft &= (map[SIZE - i - 1][i] == symb);
        }
        if (toright || toleft){
            return true;
        }
        return false;
    }



//3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
// Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
//    public static boolean checkWin(char symb) {
//        for (int hor = 0; hor < 3; hor++){
//            for (int ver = 0; ver < 3; ver++){
//                if (checkDiagonal(symb, hor, ver) || checkLanes(symb, hor, ver)){
//                    return true;
//                }
//            }
//        }
//        return false;
//
//    }
//        public static boolean checkLanes(char symb, int setX, int setY){
//            boolean vertical, horizon;
//            for (int hor = setX; hor < DOTS_TO_WIN + setY; hor++){
//                vertical = true;
//                horizon = true;
//                for (int ver = setY; ver < DOTS_TO_WIN + setX; ver++){
//                    vertical &= (map[ver][hor] == symb);
//                    horizon &= (map[hor][ver] == symb);
//                }
//                if (vertical || horizon){
//                    return true;
//                }
//            }
//            return false;
//        }
//        public static boolean checkDiagonal(char symb, int setX, int setY){
//            boolean toleft = true;
//            boolean toright = true;
//            for (int i = setX; i < DOTS_TO_WIN + setY; i++) {
//                for (int j = setY; j < DOTS_TO_WIN + setX; j++) {
//                    toright &= (map[i][i] == symb);
//                    toleft &= (map[DOTS_TO_WIN - i][i] == symb);
//                }
//            }
//            return (toright || toleft);
//        }
// Код не работает, Физически не успеваю в нем до конца разобраться.



}
