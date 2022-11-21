import java.util.Scanner;

public class LineComparision {
        public static void main(String[] args) {
            int x1, y1, x2, y2;
            int a1, a2, b1, b2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the co-ordinates of line!!: x1,y1,x2,y2");
            System.out.println("Enter the co-ordinates of line!!: a1,a2,b1,b2");
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            a1 = scanner.nextInt();
            b1 = scanner.nextInt();
            a2 = scanner.nextInt();
            b2 = scanner.nextInt();
            int lineOneLength = lineLenghtCal(x1, y1, x2, y2);
            int lineSecondLength = lineLenghtCal(a1, b1, a2, b2);
            System.out.println("The length of line 1 is: " + lineOneLength);
            System.out.println("The length of line 2 is: " + lineSecondLength);
            if (String.valueOf(lineOneLength).equals(String.valueOf(lineSecondLength))){
                System.out.println("Two lines are equals");
            }else {
                System.out.println("Two lines are not equals");
            }
        }

        static int lineLenghtCal(int x1, int x2, int y1, int y2) {
            int lineLength = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            System.out.println("The length of line is: " + lineLength);
            return lineLength;
        }
    }
