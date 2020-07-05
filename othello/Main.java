package othello;

import java.util.Scanner;

public class Main {
    static final int uni1 = 9679;
    static final int uni2 = 9711;
    static final char whiteCircle = (char) uni1;
    static final char blackCircle = (char) uni2;
    static char[][] map = new char[18][34];

    /**
     * Here we create map
     */
    public static void createMap(){
        char k='A';
        char p='1';
        for (int i = 0; i < 18 ; i++) {
            for (int j = 0; j < 34 ; j++) {
                if(i == 0 ){
                    if(j%4==3) {
                        map[i][j] = k;
                        k++;
                    }
                    else{map[i][j] = ' ';}
                }
                else {
                    if(j==0){
                        if(i%2==0){
                            map[i][j] = p;
                            p++;
                        }
                    }
                    else {
                        if (i % 2 == 0 && j % 4 == 1) {
                            map[i][j] = '|';
                        } else if (i % 2 == 1 && j % 4 == 1) {
                            map[i][j] = '+';
                        } else if (i % 2 == 1 && j % 4 != 1) {
                            map[i][j] = '-';
                        } else {
                            map[i][j] = ' ';
                        }
                    }
                }
            }
        }
        map[8][15] = whiteCircle;
        map[10][19] = whiteCircle;
        map[8][19] = blackCircle;
        map[10][15] = blackCircle;
    }

    /**
     * print map
     */
    public static void print(){

        for (int i = 0; i < 18 ; i++) {
            for (int j = 0; j < 34 ; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Computer computer = new Computer();
        System.out.println("Enter 1 for 1player or 2 for 2players :");
        Scanner me = new Scanner(System.in);
        int scan = me.nextInt();
        System.out.println("Let's Go");
        createMap();
        print();
        if(scan == 1){
            while (true){
                if (p1.checkLoc()) {
                    p1.callMove();
                    print();
                }
                else {
                    if (computer.checkLoc()){
                        System.out.println("pass");
                    }
                    else {
                        break;
                    }
                }
                if (computer.checkLoc()) {
                    computer.move();
                    print();
                }
                else {
                    if (p1.checkLoc()){
                        System.out.println("pass");
                    }
                    else {
                        break;
                    }
                }
            }
            Player.winner();
        }
        else if(scan == 2){
            while (true){
                if (p2.checkLoc()) {
                    p2.callMove();
                    print();
                }
                else {
                    if (p1.checkLoc()){
                        System.out.println("pass");
                    }
                    else {
                        break;
                    }
                }
                if (p1.checkLoc()) {
                    p1.callMove();
                    print();
                }
                else {
                    if (p2.checkLoc()){
                        System.out.println("pass");
                    }
                    else {
                        break;
                    }
                }
            }
            Player.winner();
        }





    }
}