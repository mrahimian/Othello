package othello;

public class Computer extends Player {
    public void move() {
        int[] arr = new int[8] ;
        int[] g = new int[8] ;
        int t2=0;
        int store = 0;
        int row2=0, col2=0;
        int numToChange = 0;
        int t = 0;
        int a, b;
        int counter;
        boolean flag ;
        boolean flag2 = false;
        if (Main.map[2][3] == ' ' && (Main.map[4][3] == Main.whiteCircle||Main.map[4][7] == Main.whiteCircle||
                Main.map[2][7] == Main.whiteCircle)) {
            if (Main.map[4][3] == Main.whiteCircle) {
                counter = 0;
                a = 2;
                b = 3;
                flag = false;
                do {
                    counter++;
                    a += 2;
                    if (a + 2 >= 18) {
                        break;
                    }
                    if (Main.map[a + 2][b] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a + 2][b] == Main.whiteCircle);
                if (flag) {
                    a = 2;
                    b = 3;
                    Main.map[2][3] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        a += 2;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
            if (Main.map[4][7] == Main.whiteCircle) {
                counter = 0;
                a = 2;
                b = 3;
                flag = false;
                do {
                    counter++;
                    a += 2;
                    b += 4;
                    if (a + 2 >= 18 || b + 4 >= 34) {
                        break;
                    }
                    if (Main.map[a + 2][b + 4] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a + 2][b + 4] == Main.whiteCircle);
                if (flag) {
                    a = 2;
                    b = 3;
                    Main.map[2][3] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        a += 2;
                        b += 4;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
            if (Main.map[2][7] == Main.whiteCircle) {
                counter = 0;
                a = 2;
                b = 3;
                flag = false;
                do {
                    counter++;
                    b += 4;
                    if (b + 4 >= 34) {
                        break;
                    }
                    if (Main.map[a][b + 4] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a][b + 4] == Main.whiteCircle);
                if (flag) {
                    a = 2;
                    b = 3;
                    Main.map[2][3] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        b += 4;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
        } else if (Main.map[16][3] == ' '&& (Main.map[14][3] == Main.whiteCircle||Main.map[14][7] == Main.whiteCircle||
                Main.map[16][7] == Main.whiteCircle)) {
            if (Main.map[16][7] == Main.whiteCircle) {
                counter = 0;
                a = 16;
                b = 3;
                flag = false;
                do {
                    counter++;
                    b += 4;
                    if (b + 4 >= 34) {
                        break;
                    }
                    if (Main.map[a][b + 4] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a][b + 4] == Main.whiteCircle);
                if (flag) {
                    a = 16;
                    b = 3;
                    Main.map[16][3] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        b += 4;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
            if (Main.map[14][7] == Main.whiteCircle) {
                counter = 0;
                a = 16;
                b = 3;
                flag = false;
                do {
                    counter++;
                    a -= 2;
                    b += 4;
                    if (a - 2 < 0 || b + 4 >= 34) {
                        break;
                    }
                    if (Main.map[a - 2][b + 4] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a - 2][b + 4] == Main.whiteCircle);
                if (flag) {
                    a = 16;
                    b = 3;
                    Main.map[16][3] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        a -= 2;
                        b += 4;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
            if (Main.map[14][3] == Main.whiteCircle) {
                counter = 0;
                a = 16;
                b = 3;
                flag = false;
                do {
                    counter++;
                    a -= 2;
                    if (a - 2 < 0) {
                        break;
                    }
                    if (Main.map[a - 2][b] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a - 2][b] == Main.whiteCircle);
                if (flag) {
                    a = 16;
                    b = 3;
                    Main.map[16][3] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        a -= 2;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
        } else if (Main.map[16][31] == ' '&& (Main.map[14][27] == Main.whiteCircle||Main.map[16][27] == Main.whiteCircle||
                Main.map[14][31] == Main.whiteCircle)) {
            if (Main.map[14][31] == Main.whiteCircle) {
                counter = 0;
                a = 16;
                b = 31;
                flag = false;
                do {
                    counter++;
                    a -= 2;
                    if (a - 2 < 0) {
                        break;
                    }
                    if (Main.map[a - 2][b] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a - 2][b] == Main.whiteCircle);
                if (flag) {
                    a = 16;
                    b = 31;
                    Main.map[16][31] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        a -= 2;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
            if (Main.map[14][27] == Main.whiteCircle) {
                counter = 0;
                a = 16;
                b = 31;
                flag = false;
                do {
                    counter++;
                    a -= 2;
                    b -= 4;
                    if (a - 2 < 0 || b - 4 < 0) {
                        break;
                    }
                    if (Main.map[a - 2][b - 4] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a - 2][b - 4] == Main.whiteCircle);
                if (flag) {
                    a = 16;
                    b = 31;
                    Main.map[16][31] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        a -= 2;
                        b -= 4;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
            if (Main.map[16][27] == Main.whiteCircle) {
                counter = 0;
                a = 16;
                b = 31;
                flag = false;
                do {
                    counter++;
                    b -= 4;
                    if (b - 4 < 0) {
                        break;
                    }
                    if (Main.map[a][b - 4] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a][b - 4] == Main.whiteCircle);
                if (flag) {
                    a = 16;
                    b = 31;
                    Main.map[16][31] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        b -= 4;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
        } else if (Main.map[2][31] == ' '&& (Main.map[2][27] == Main.whiteCircle||Main.map[4][31] == Main.whiteCircle||
                Main.map[4][27] == Main.whiteCircle)) {
            if (Main.map[2][27] == Main.whiteCircle) {
                counter = 0;
                a = 2;
                b = 31;
                flag = false;
                do {
                    counter++;
                    b -= 4;
                    if (b - 4 < 0) {
                        break;
                    }
                    if (Main.map[a][b - 4] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a][b - 4] == Main.whiteCircle);
                if (flag) {
                    a = 2;
                    b = 31;
                    Main.map[2][31] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        b -= 4;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
            if (Main.map[4][27] == Main.whiteCircle) {
                counter = 0;
                a = 2;
                b = 31;
                flag = false;
                do {
                    counter++;
                    a += 2;
                    b -= 4;
                    if (a + 2 >= 18 || b - 4 < 0) {
                        break;
                    }
                    if (Main.map[a + 2][b - 4] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a + 2][b - 4] == Main.whiteCircle);
                if (flag) {
                    a = 2;
                    b = 31;
                    Main.map[2][31] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        a += 2;
                        b -= 4;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
            if (Main.map[4][31] == Main.whiteCircle) {
                counter = 0;
                a = 2;
                b = 31;
                flag = false;
                do {
                    counter++;
                    numToChange++;
                    a += 2;
                    if (a + 2 >= 18) {
                        break;
                    }
                    if (Main.map[a + 2][b] == Main.blackCircle) {
                        flag = true;
                        flag2 = true;
                        break;
                    }
                } while (Main.map[a + 2][b] == Main.whiteCircle);
                if (flag) {
                    a = 2;
                    b = 31;
                    Main.map[2][31] = Main.blackCircle;
                    for (int i = 0; i < counter; i++) {
                        a += 2;
                        Main.map[a][b] = Main.blackCircle;
                        t=1;
                    }
                }
            }
        }
        if(!flag2){
            t2 = 1;
            for (int row = 0; row < 18; row++) {
                for (int col = 0; col < 34; col++) {
                    int save = 0;
                    if (Main.map[row][col] == ' ' ) {
                        numToChange = 0;
                        if (row + 2 < 18) {
                            if (Main.map[row + 2][col] == Main.whiteCircle) {
                                arr[0] = 0;
                                counter = 0;
                                a = row;
                                b = col;
                                flag = false;
                                do {
                                    counter++;
                                    numToChange++;
                                    a += 2;
                                    if (a + 2 >= 18) {
                                        break;
                                    }
                                    if (Main.map[a + 2][b] == Main.blackCircle) {
                                        flag = true;
                                        arr[0] = 1;
                                        break;
                                    }
                                } while (Main.map[a + 2][b] == Main.whiteCircle);
                                if (flag) {
                                    save += numToChange;
                                    numToChange -= counter;
                                } else {
                                    numToChange -= counter;
                                }
                            }
                        }
                        if (row + 2 < 18 && col + 4 < 34) {
                            if (Main.map[row + 2][col + 4] == Main.whiteCircle) {
                                arr[1] = 0;
                                counter = 0;
                                a = row;
                                b = col;
                                flag = false;
                                do {
                                    counter++;
                                    numToChange++;
                                    a += 2;
                                    b += 4;
                                    if (a + 2 >= 18 || b + 4 >= 34) {
                                        break;
                                    }
                                    if (Main.map[a + 2][b + 4] == Main.blackCircle) {
                                        flag = true;
                                        arr[1] = 1;
                                        break;
                                    }
                                } while (Main.map[a + 2][b + 4] == Main.whiteCircle);
                                if (flag) {
                                    save += numToChange;
                                    numToChange -= counter;
                                } else {
                                    numToChange -= counter;
                                }
                            }
                        }
                        if (col + 4 < 34) {
                            if (Main.map[row][col + 4] == Main.whiteCircle) {
                                arr[2] = 0;
                                counter = 0;
                                a = row;
                                b = col;
                                flag = false;
                                do {
                                    counter++;
                                    numToChange++;
                                    b += 4;
                                    if (b + 4 >= 34) {
                                        break;
                                    }
                                    if (Main.map[a][b + 4] == Main.blackCircle) {
                                        flag = true;
                                        arr[2] = 1;
                                        break;
                                    }
                                } while (Main.map[a][b + 4] == Main.whiteCircle);
                                if (flag) {
                                    save += numToChange;
                                    numToChange -= counter;
                                } else {
                                    numToChange -= counter;
                                }
                            }
                        }
                        if (row - 2 > 0 && col + 4 < 34) {
                            if (Main.map[row - 2][col + 4] == Main.whiteCircle) {
                                arr[3] = 0;
                                counter = 0;
                                a = row;
                                b = col;
                                flag = false;
                                do {
                                    counter++;
                                    numToChange++;
                                    a -= 2;
                                    b += 4;
                                    if (a - 2 < 0 || b + 4 >= 34) {
                                        break;
                                    }
                                    if (Main.map[a - 2][b + 4] == Main.blackCircle) {
                                        flag = true;
                                        arr[3] = 1;
                                        break;
                                    }
                                } while (Main.map[a - 2][b + 4] == Main.whiteCircle);
                                if (flag) {
                                    save += numToChange;
                                    numToChange -= counter;
                                } else {
                                    numToChange -= counter;
                                }
                            }
                        }
                        if (row - 2 > 0) {
                            if (Main.map[row - 2][col] == Main.whiteCircle) {
                                arr[4] = 0;
                                counter = 0;
                                a = row;
                                b = col;
                                flag = false;
                                do {
                                    counter++;
                                    numToChange++;
                                    a -= 2;
                                    if (a - 2 < 0) {
                                        break;
                                    }
                                    if (Main.map[a - 2][b] == Main.blackCircle) {
                                        flag = true;
                                        arr[4] = 1;
                                        break;
                                    }
                                } while (Main.map[a - 2][b] == Main.whiteCircle);
                                if (flag) {
                                    save += numToChange;
                                    numToChange -= counter;
                                } else {
                                    numToChange -= counter;
                                }
                            }
                        }
                        if (row - 2 > 0 && col - 4 > 0) {
                            if (Main.map[row - 2][col - 4] == Main.whiteCircle) {
                                arr[5] = 0;
                                counter = 0;
                                a = row;
                                b = col;
                                flag = false;
                                do {
                                    counter++;
                                    numToChange++;
                                    a -= 2;
                                    b -= 4;
                                    if (a - 2 < 0 || b - 4 < 0) {
                                        break;
                                    }
                                    if (Main.map[a - 2][b - 4] == Main.blackCircle) {
                                        flag = true;
                                        arr[5] = 1;
                                        break;
                                    }
                                } while (Main.map[a - 2][b - 4] == Main.whiteCircle);
                                if (flag) {
                                    save += numToChange;
                                    numToChange -= counter;
                                } else {
                                    numToChange -= counter;
                                }
                            }
                        }
                        if (col - 4 > 0) {
                            if (Main.map[row][col - 4] == Main.whiteCircle) {
                                arr[6] = 0;
                                counter = 0;
                                a = row;
                                b = col;
                                flag = false;
                                do {
                                    counter++;
                                    numToChange++;
                                    b -= 4;
                                    if (b - 4 < 0) {
                                        break;
                                    }
                                    if (Main.map[a][b - 4] == Main.blackCircle) {
                                        flag = true;
                                        arr[6] = 1;
                                        break;
                                    }
                                } while (Main.map[a][b - 4] == Main.whiteCircle);
                                if (flag) {
                                    save += numToChange;
                                    numToChange -= counter;
                                } else {
                                    numToChange -= counter;
                                }
                            }
                        }
                        if (row + 2 < 18 && col - 4 > 0) {
                            if (Main.map[row + 2][col - 4] == Main.whiteCircle) {
                                arr[7] = 0;
                                counter = 0;
                                a = row;
                                b = col;
                                flag = false;
                                do {
                                    counter++;
                                    numToChange++;
                                    a += 2;
                                    b -= 4;
                                    if (a + 2 >= 18 || b - 4 < 0) {
                                        break;
                                    }
                                    if (Main.map[a + 2][b - 4] == Main.blackCircle) {
                                        flag = true;
                                        arr[7] = 1;
                                        break;
                                    }
                                } while (Main.map[a + 2][b - 4] == Main.whiteCircle);
                                if (flag) {
                                    save += numToChange;
                                    numToChange -= counter;
                                } else {
                                    numToChange -= counter;
                                }
                            }
                        }
                    }
                    if (save > store) {
                        store = save;
                        row2 = row;
                        col2 = col;
                        for (int k = 0; k < 8 ; k++) {
                            g[k] = arr[k];
                        }
                    }
                }
            }
        }
        int m=0,n=0;
        if (t2 ==1){
            if(g[0]==1) {
                if (row2 + 2 < 18) {
                    if (Main.map[row2 + 2][col2] == Main.whiteCircle) {
                        m = row2;
                        n = col2;
                        Main.map[m][n] = Main.blackCircle;
                        while (Main.map[m + 2][n] == Main.whiteCircle) {
                            Main.map[m + 2][n] = Main.blackCircle;
                            m += 2;
                            if (Main.map[m + 2][n] == Main.blackCircle) {
                                break;
                            }
                        }
                    }
                }
            }
            if(g[1]==1) {
                if (row2 + 2 < 18 && col2 + 4 < 34) {
                    if (Main.map[row2 + 2][col2 + 4] == Main.whiteCircle) {
                        m = row2;
                        n = col2;
                        Main.map[m][n] = Main.blackCircle;
                        while (Main.map[m + 2][n + 4] == Main.whiteCircle) {
                            Main.map[m + 2][n + 4] = Main.blackCircle;
                            m += 2;
                            n += 4;
                            if (Main.map[m + 2][n + 4] == Main.blackCircle) {
                                break;
                            }
                        }
                    }
                }
            }
            if(g[2]==1) {
                if (col2 + 4 < 34) {
                    if (Main.map[row2][col2 + 4] == Main.whiteCircle) {
                        m = row2;
                        n = col2;
                        Main.map[m][n] = Main.blackCircle;
                        while (Main.map[m][n + 4] == Main.whiteCircle) {
                            Main.map[m][n + 4] = Main.blackCircle;
                            n += 4;
                            if (Main.map[m][n + 4] == Main.blackCircle) {
                                break;
                            }
                        }
                    }
                }
            }
            if(g[3]==1) {
                if (col2 + 4 < 34 && row2 - 2 >= 0) {
                    if (Main.map[row2 - 2][col2 + 4] == Main.whiteCircle) {
                        m = row2;
                        n = col2;
                        Main.map[m][n] = Main.blackCircle;
                        while (Main.map[m - 2][n + 4] == Main.whiteCircle) {
                            Main.map[m - 2][n + 4] = Main.blackCircle;
                            m -= 2;
                            n += 4;
                            if (Main.map[m - 2][n + 4] == Main.blackCircle) {
                                break;
                            }
                        }
                    }
                }
            }
            if(g[4]==1) {
                if (row2 - 2 >= 0) {
                    if (Main.map[row2 - 2][col2] == Main.whiteCircle) {
                        m = row2;
                        n = col2;
                        Main.map[m][n] = Main.blackCircle;
                        while (Main.map[m - 2][n] == Main.whiteCircle) {
                            Main.map[m - 2][n] = Main.blackCircle;
                            m -= 2;
                            if (Main.map[m - 2][n] == Main.blackCircle) {
                                break;
                            }
                        }
                    }
                }
            }
            if(g[5]==1) {
                if (row2 - 2 >= 0 && col2 - 4 >= 0) {
                    if (Main.map[row2 - 2][col2 - 4] == Main.whiteCircle) {
                        m = row2;
                        n = col2;
                        Main.map[m][n] = Main.blackCircle;
                        while (Main.map[m - 2][n - 4] == Main.whiteCircle) {
                            Main.map[m - 2][n - 4] = Main.blackCircle;
                            m -= 2;
                            n -= 4;
                            if (Main.map[m - 2][n - 4] == Main.blackCircle) {
                                break;
                            }
                        }
                    }
                }
            }
            if(g[6]==1) {
                if (col2 - 4 >= 0) {
                    if (Main.map[row2][col2 - 4] == Main.whiteCircle) {
                        m = row2;
                        n = col2;
                        Main.map[m][n] = Main.blackCircle;
                        while (Main.map[m][n - 4] == Main.whiteCircle) {
                            Main.map[m][n - 4] = Main.blackCircle;
                            n -= 4;
                            if (Main.map[m][n - 4] == Main.blackCircle) {
                                break;
                            }
                        }
                    }
                }
            }
            if(g[7]==1) {
                if (col2 - 4 >= 0 && row2 + 2 < 18) {
                    if (Main.map[row2 + 2][col2 - 4] == Main.whiteCircle) {
                        m = row2;
                        n = col2;
                        Main.map[m][n] = Main.blackCircle;
                        while (Main.map[m + 2][n - 4] == Main.whiteCircle) {
                            Main.map[m + 2][n - 4] = Main.blackCircle;
                            m += 2;
                            n -= 4;
                            if (Main.map[m + 2][n - 4] == Main.blackCircle) {
                                break;
                            }
                        }
                    }
                }
            }

        }
    }
    @Override
    public boolean checkLoc() {
        Player.b = Main.whiteCircle;
        Player.w = Main.blackCircle;
        return super.checkLoc();
    }
}
