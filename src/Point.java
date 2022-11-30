import java.util.Scanner;

public class Point {
    private int x;
    private int y;

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
    public void setPointValues(){
        Scanner scanner=new Scanner(System.in);
        setX(scanner.nextInt());
        setY(scanner.nextInt());
    }
}
