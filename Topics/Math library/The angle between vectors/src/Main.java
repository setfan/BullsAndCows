import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vx = scanner.nextInt();
        int vy = scanner.nextInt();

        int ux = scanner.nextInt();
        int uy = scanner.nextInt();

        double result = (vx * ux + vy * uy) / (Math.sqrt(vx * vx + vy * vy) * Math.sqrt(ux * ux + uy * uy));
        double angle = Math.toDegrees(Math.acos(result));
        System.out.println(Math.round(angle));
    }
}