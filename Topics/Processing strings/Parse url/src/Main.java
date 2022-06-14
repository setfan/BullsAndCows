import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String resources = input.split("\\?")[1];

        String[] separatedResources = resources.split("&");
        String password = "password : ";
        boolean isPassPresent = false;

        for (String elem : separatedResources) {

            String[] elements = elem.split("=");

            if (elements.length > 1) {
                if ("pass".equals(elements[0])) {
                    password = password + elements[1];
                    isPassPresent = true;
                }
                System.out.println(elements[0] + " : " + elements[1]);
            } else {
                System.out.println(elements[0] + " : " + "not found");

            }
        }

        if (isPassPresent) {
            System.out.println(password);
        }

    }
}