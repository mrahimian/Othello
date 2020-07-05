package othello;


import java.util.Scanner;

public class Player {
    static char w = ' ';
    static char b = ' ';
    static char w1 = ' ';
    static char b1 = ' ';

    /**
     * enter row
     * @return
     */
    public int enterRow() {
        System.out.println("Enter row (1 to 8) :");
        Scanner enterRow = new Scanner(System.in);
        int row = Integer.parseInt(enterRow.nextLine());
        if (row != 1 && row != 2 && row != 3 && row != 4 && row != 5 && row != 6 && row != 7 && row != 8){
            System.out.println("InValid Input. It must be between 1 to 8. Choose again.");
            enterRow();
        }
        row *= 2;
        return row;
    }

    /**
     * enter column
     * @return
     */
    public int enterColumn() {
        System.out.println("Enter column (A to H) :");
        Scanner enterCol = new Scanner(System.in);
        String s = enterCol.nextLine();
        char column = s.toUpperCase().charAt(0);
        if (column !='A'&&column !='B'&&column !='C'&&column !='D'&&column !='E'&&column !='F'&&column !='G'&&column !='H') {
            System.out.println("InValid Input. It must be between A to H. Choose again.");
            enterColumn();
        }
        int col = ((int) column - 64) * 4 - 1;

        return col;
    }

    /**
     * put in specified space and check the rules
     * @param row
     * @param col
     */
    public void move(int row , int col) {
        int t=0;
        int a,b;
        int counter = 0;
        boolean flag = false;
        if (Main.map[row][col] == ' ' && row > 0 && col > 0) {
            if (row + 2 < 18) {
                if (Main.map[row + 2][col] == w1) {
                    counter = 0;
                    a = row;
                    b = col;
                    flag = false;
                    do {
                        counter++;
                        a += 2;
                        if (a+2>=18) {
                            break;
                        }
                        if (Main.map[a + 2][b] == b1) {
                            flag = true;
                            break;
                        }
                    } while (Main.map[a + 2][b] == w1);
                    if (flag) {
                        a = row;
                        b = col;
                        Main.map[row][col] = b1;
                        for (int i = 0; i < counter; i++) {
                            a += 2;
                            Main.map[a][b] = b1;
                            t=1;
                        }
                    }
                }
            }
            if (row + 2 < 18 && col + 4 < 34 ) {
                if (Main.map[row + 2][col + 4] == w1) {
                    counter = 0;
                    a = row;
                    b = col;
                    flag = false;
                    do {
                        counter++;
                        a += 2;
                        b += 4;
                        if (a+2>=18 || b+4>=34) {
                            break;
                        }
                        if (Main.map[a + 2][b + 4] == b1) {
                            flag = true;
                            break;
                        }
                    } while (Main.map[a + 2][b + 4] == w1);
                    if (flag) {
                        a = row;
                        b = col;
                        Main.map[row][col] = b1;
                        for (int i = 0; i < counter; i++) {
                            a += 2;
                            b += 4;
                            Main.map[a][b] = b1;
                            t=1;
                        }
                    }
                }
            }
            if (col + 4 < 34) {
                if (Main.map[row][col + 4] == w1) {
                    counter = 0;
                    a = row;
                    b = col;
                    flag = false;
                    do {
                        counter++;
                        b += 4;
                        if (b+4>=34) {
                            break;
                        }
                        if (Main.map[a][b + 4] == b1) {
                            flag = true;
                            break;
                        }
                    } while (Main.map[a][b + 4] == w1);
                    if (flag) {
                        a = row;
                        b = col;
                        Main.map[row][col] = b1;
                        for (int i = 0; i < counter; i++) {
                            b += 4;
                            Main.map[a][b] = b1;
                            t=1;
                        }
                    }
                }
            }
            if (row - 2 > 0 && col + 4 < 34) {
                if (Main.map[row - 2][col + 4] == w1) {
                    counter = 0;
                    a = row;
                    b = col;
                    flag = false;
                    do {
                        counter++;
                        a -= 2;
                        b += 4;
                        if (a-2<0 || b+4>=34) {
                            break;
                        }
                        if (Main.map[a - 2][b + 4] == b1) {
                            flag = true;
                            break;
                        }
                    } while (Main.map[a - 2][b + 4] == w1);
                    if (flag) {
                        a = row;
                        b = col;
                        Main.map[row][col] = b1;
                        for (int i = 0; i < counter; i++) {
                            a -= 2;
                            b += 4;
                            Main.map[a][b] = b1;
                            t=1;
                        }
                    }
                }
            }
            if (row - 2 > 0) {
                if (Main.map[row - 2][col] == w1) {
                    counter = 0;
                    a = row;
                    b = col;
                    flag = false;
                    do {
                        counter++;
                        a -= 2;
                        if (a-2<0) {
                            break;
                        }
                        if (Main.map[a - 2][b] == b1) {
                            flag = true;
                            break;
                        }
                    } while (Main.map[a - 2][b] == w1);
                    if (flag) {
                        a = row;
                        b = col;
                        Main.map[row][col] = b1;
                        for (int i = 0; i < counter; i++) {
                            a -= 2;
                            Main.map[a][b] = b1;
                            t=1;
                        }
                    }
                }
            }
            if (row - 2 > 0 && col - 4 > 0 ) {
                if (Main.map[row - 2][col - 4] == w1) {
                    counter = 0;
                    a = row;
                    b = col;
                    flag = false;
                    do {
                        counter++;
                        a -= 2;
                        b -= 4;
                        if (a-2<0 || b-4<0) {
                            break;
                        }
                        if (Main.map[a - 2][b - 4] == b1) {
                            flag = true;
                            break;
                        }
                    } while (Main.map[a - 2][b - 4] == w1);
                    if (flag) {
                        a = row;
                        b = col;
                        Main.map[row][col] = b1;
                        for (int i = 0; i < counter; i++) {
                            a -= 2;
                            b -= 4;
                            Main.map[a][b] = b1;
                            t=1;
                        }
                    }
                }
            }
            if (col - 4 > 0) {
                if (Main.map[row][col - 4] == w1) {
                    counter = 0;
                    a = row;
                    b = col;
                    flag = false;
                    do {
                        counter++;
                        b -= 4;
                        if (b-4<0) {
                            break;
                        }
                        if (Main.map[a][b - 4] == b1) {
                            flag = true;
                            break;
                        }
                    } while (Main.map[a][b - 4] == w1);
                    if (flag) {
                        a = row;
                        b = col;
                        Main.map[row][col] = b1;
                        for (int i = 0; i < counter; i++) {
                            b -= 4;
                            Main.map[a][b] = b1;
                            t=1;
                        }
                    }
                }
            }
            if (row + 2 <18 &&col - 4 > 0) {
                if (Main.map[row + 2][col - 4] == w1) {
                    counter = 0;
                    a = row;
                    b = col;
                    flag = false;
                    do {
                        counter++;
                        a += 2;
                        b -= 4;
                        if (a+2>=18 || b-4<0) {
                            break;
                        }
                        if (Main.map[a + 2][b - 4] == b1) {
                            flag = true;
                            break;
                        }
                    } while (Main.map[a + 2][b - 4] == w1);
                    if (flag) {
                        a = row;
                        b = col;
                        Main.map[row][col] = b1;
                        for (int i = 0; i < counter; i++) {
                            a += 2;
                            b -= 4;
                            Main.map[a][b] = b1;
                            t=1;
                        }
                    }
                }
            }
            if(t==0){
                System.out.println("Wrong Location. Choose Another.");
                move(enterRow(),enterColumn());
            }
        }
        else {
            System.out.println("This space is full. Choose another");
            move(enterRow(),enterColumn());
        }
    }

    /**
     * to check if a player can play or not and also check whether the game is finished or not
     * @return false if no choice
     */
    public boolean checkLoc() {
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 34; j++) {
                int a = i;
                int c = j;
                if (Main.map[i][j] == ' ') {
                    a = i;
                    c = j;
                    if (i + 2 < 18) {
                        if (Main.map[a + 2][c] == b) {
                            while (Main.map[a + 2][c] == b) {
                                a += 2;
                                if (a + 2 >= 18) {
                                    break;
                                }
                                if (Main.map[a + 2][c] == w) {
                                    return true;
                                }
                            }
                        }
                    }
                    a = i;
                    c = j;
                    if (i + 2 < 18 && j + 4 < 34) {
                        if (Main.map[a + 2][c + 4] == b) {
                            while (Main.map[a + 2][c + 4] == b ) {
                                a += 2;
                                c += 4;
                                if (a + 2 >= 18 || c + 4 >= 34) {
                                    break;
                                }
                                if (Main.map[a + 2][c + 4] == w) {
                                    return true;
                                }
                            }
                        }
                    }
                    a = i;
                    c = j;
                    if (j + 4 < 34) {
                        if (Main.map[a][c + 4] == b) {
                            while (Main.map[a][c + 4] == b) {
                                c += 4;
                                if (c + 4 >= 34) {
                                    break;
                                }
                                if (Main.map[a][c + 4] == w) {
                                    return true;
                                }
                            }
                        }
                    }
                        a = i;
                        c = j;
                        if (i - 2 > 0 && j + 4 < 34) {
                            if (Main.map[a - 2][c + 4] == b) {
                                while (Main.map[a - 2][c + 4] == b) {
                                    a -= 2;
                                    c += 4;
                                    if (a - 2 < 0 || c + 4 >= 34) {
                                        break;
                                    }
                                    if (Main.map[a - 2][c + 4] == w) {
                                        return true;
                                    }
                                }
                            }
                        }
                        a = i;
                        c = j;
                        if (i - 2 > 0) {
                            if (Main.map[a - 2][c] == b) {
                                while (Main.map[a - 2][c] == b ) {
                                    a -= 2;
                                    if (a - 2 < 0 ) {
                                        break;
                                    }
                                    if (Main.map[a - 2][c] == w) {
                                        return true;
                                    }
                                }
                            }
                        }
                        a = i;
                        c = j;
                        if (i - 2 > 0 && j - 4 > 0) {
                            if (Main.map[a - 2][c - 4] == b ) {
                                while (Main.map[a - 2][c - 4] == b) {
                                    a -= 2;
                                    c -= 4;
                                    if (a - 2 < 0 || c - 4 < 0) {
                                        break;
                                    }
                                    if (Main.map[a - 2][c - 4] == w) {
                                        return true;
                                    }
                                }
                            }
                        }
                        a = i;
                        c = j;
                        if (j - 4 > 0) {
                            if (Main.map[a][c - 4] == b) {
                                while (Main.map[a][c - 4] == b) {
                                    c -= 4;
                                    if (c - 4 < 0) {
                                        break;
                                    }
                                    if (Main.map[a][c - 4] == w) {
                                        return true;
                                    }
                                }
                            }
                        }
                        a = i;
                        c = j;
                        if (i + 2 < 18 && j - 4 > 0) {
                            if (Main.map[a + 2][c - 4] == b) {
                                while (Main.map[a + 2][c - 4] == b) {
                                    a += 2;
                                    c -= 4;
                                    if (a + 2 >= 18 || c - 4 < 0) {
                                        break;
                                    }
                                        if (Main.map[a + 2][c - 4] == w) {
                                        return true;
                                    }
                                }
                            }
                        }
                        }
                    }
                }
                return false;
            }

    /**
     * tell the winner
     */
    public static void winner () {
                int black = 0;
                int white = 0;
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 34; j++) {
                        if (Main.map[i][j] == Main.whiteCircle) {
                            white++;
                        }
                        if (Main.map[i][j] == Main.blackCircle) {
                            black++;
                        }
                    }
                }
                if (white > black) {
                    System.out.println("You win");
                } else if (black > white) {
                    System.out.println("You loose");
                } else {
                    System.out.println("Draw");
                }
                System.out.println("You : " + white + " Computer : " + black);
            }
        }



