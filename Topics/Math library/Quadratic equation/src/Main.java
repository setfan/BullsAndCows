import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double root1;
        double root2;

        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {

            root1 = (-b - Math.sqrt(determinant)) / (2 * a);
            root2 = (-b + Math.sqrt(determinant)) / (2 * a);
        } else {
            root1 = root2 = -b / (2 * a);
        }
        System.out.println(root1 < root2 ? root1 + " " + root2 : root2 + " " + root1);
    }
}