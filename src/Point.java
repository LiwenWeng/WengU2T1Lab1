public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int point) {
        this.x = point;
        this.y = point;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public int getY() {
        return y;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public String coordinate() {
        return String.format("(%1$d, %2$d)", x, y);
    }

    public String quadrant() {
        if (x == 0 && y ==0) {
            return "origin";
            
        } else if (x == 0 || y == 0) {
            return "on an axis";
            
        } else if (x > 0 && y > 0) {
            return "I";

        } else if (x > 0) {
            return "IV";

        } else if (y > 0) {
            return "II";

        } else {
            return "III";
        }
    }
}
