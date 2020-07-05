package othello;

public class Player2 extends Player {

    @Override
    public int enterRow() {
        System.out.println("player 2");
        return super.enterRow();
    }

    @Override
    public int enterColumn() {
        return super.enterColumn();
    }
    public void callMove(){
        move(enterRow(),enterColumn());
    }

    @Override
    public void move(int row, int column) {
        Player.b1 = Main.blackCircle;
        Player.w1 = Main.whiteCircle;
        super.move(row, column);
    }

    @Override
    public boolean checkLoc() {
        Player.w = Main.blackCircle;
        Player.b = Main.whiteCircle;
        return super.checkLoc();
    }
}
