package othello;

public class Player1 extends Player {

    @Override
    public int enterRow() {
        System.out.println("You");
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
        Player.w1 = Main.blackCircle;
        Player.b1 = Main.whiteCircle;
        super.move(row, column);
    }
    @Override
    public boolean checkLoc() {
        Player.b = Main.blackCircle;
        Player.w = Main.whiteCircle;
        return super.checkLoc();
    }
}

