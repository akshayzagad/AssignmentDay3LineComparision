public class Main {
    public static void main(String[] args) {
        Line line1=new Line();
        System.out.println("Get the Points for Line 1: ");
        line1.getThePointForLine();
        System.out.println("Get the Points for Line 2: ");
        Line line2=new Line();
        line2.getThePointForLine();
        System.out.println("Length1 "+line1.calculationForLines());
        System.out.println("Length2 "+line2.calculationForLines());
        Line.checkEqualityOfLines(line1,line2);
        Line.compareTheLines(line1,line2);
    }
}