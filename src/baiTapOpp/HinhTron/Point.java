package baiTapOpp.HinhTron;

public abstract class  Point {
    int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public Point(){
        this.x = 0;
        this.y = 0;


    }

    public void move(int dx, int dy){
        this.y += dy;
        this.x += dx;
    }
    public abstract void draw();

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
