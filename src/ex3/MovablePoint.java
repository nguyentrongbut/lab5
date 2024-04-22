package ex3;

public class MovablePoint implements Movable {
    private int x;
    private int y;

    public void moveUp() {
        y++;
    }
    public void moveDown() {
        y--;
    }
    public void moveLeft() {
        x++;
    }
    public void moveRight() {
        x--;
    }
}
