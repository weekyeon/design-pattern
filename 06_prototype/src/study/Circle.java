package study;

public class Circle extends Shape{

    private int x,y,r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    public int getR() { return r; }
    public void setR(int r) { this.r = r; }

    // Shape 복사
    public Circle shapeCopy() throws CloneNotSupportedException {
        Circle circle = (Circle) clone();

        // 복사 후 붙여넣기 시 도형 겹치지 않게 하기
        circle.x += 1;
        circle.y += 1;

        return circle;
    }

}
