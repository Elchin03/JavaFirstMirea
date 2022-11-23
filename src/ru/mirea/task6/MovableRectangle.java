package ru.mirea.task6;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        if (!speedTest()) {
            System.out.println("Скорости точек не равны");
        }
    }


    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }


    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }


    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }


    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    private boolean speedTest() {
        return topLeft.xSpeed() == bottomRight.xSpeed() && topLeft.ySpeed() == bottomRight.ySpeed();
    }


    public String toString() {
        return String.format("Rectangle: Top left: %s, bottom right: %s", topLeft, bottomRight);
    }
}