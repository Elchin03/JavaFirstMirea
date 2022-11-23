package ru.mirea.task6;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }


    public void moveUp() {
        center.moveUp();
    }


    public void moveDown() {
        center.moveDown();
    }


    public void moveRight() {
        center.moveRight();
    }


    public void moveLeft() {
        center.moveLeft();
    }


    public String toString() {
        return String.format("Круг с центром, находящимся в точке %s", center);
    }
}