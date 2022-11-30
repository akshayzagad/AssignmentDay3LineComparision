import java.util.Objects;

public class Line {
    Point point1 = new Point();
    Point point2 = new Point();

    public static void compareTheLines(Line line1, Line line2) {
        int Lenght1= line1.calculationForLines();
        int Lenght2= line2.calculationForLines();
        if(Double.compare(Lenght1,Lenght2)==0){
            System.out.println("equals");}
        else if (Double.compare(Lenght1,Lenght2)>0){
            System.out.println("line 1 Greater then line 2");}
        else{
            System.out.println("line 1 lesser then line 2");}
    }

    public void getThePointForLine() {
        point1.setPointValues();
        point2.setPointValues();
    }

    public int calculationForLines() {
        int lineLength = (int) Math.sqrt(Math.pow((point2.getX() - point1.getX()), 2) + Math.pow((point2.getY() - point1.getY()), 2));
        return lineLength;
    }

    public static void checkEqualityOfLines(Line line1, Line line2) {
        double length1 = line1.calculationForLines();
        double length2 = line2.calculationForLines();
        if (Objects.equals(length1,length2))
        System.out.println("Both lines are equals");
        else
        System.out.println("Lines are not equals");

        }

    }
