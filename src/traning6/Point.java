package traning6;

public class Point {


    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }




    public void setY(int y) {
        this.y = y;
    }
}

     class Test {

    public static void tricky(Point arg1, Point arg2)
    {
        // ar1 = pnt1, arg2 = pnt2
        arg1.setX(100);
        arg1.setY(100);

        Point temp = arg1;
        arg1 = arg2;
        arg2 = temp;
    }

    public static void main(String[] args) {
        Point pnt1 = new Point(0,0);
        Point pnt2 = new Point(0,0);
        System.out.println("X: " + pnt1.getX() + " Y: " +pnt1.getY());
        System.out.println("X: " + pnt2.getX() + " Y: " +pnt2.getY());
        System.out.println(" ");
        tricky(pnt1,pnt2);
        System.out.println("X: " + pnt1.getX() + " Y:" + pnt1.getY());
        System.out.println("X: " + pnt2.getX() + " Y: " +pnt2.getY());

    }
}

