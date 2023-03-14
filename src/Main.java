import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кайсы форманы эсептегиңиз келет?");
        System.out.println("1. Parallelepiped");
        System.out.println("2. Cylinder");
        int choice = scanner.nextInt();

        try {
            switch (choice) {
                case 1:
                    System.out.println("Enter length, width, and height:");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                    System.out.println("Area: " + parallelepiped.getArea());
                    System.out.println("Volume: " + parallelepiped.getVolume());
                    break;

                case 2:
                    System.out.println("Enter radius and height:");
                    double radius = scanner.nextDouble();
                     height = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(radius, height);
                    System.out.println("Area: " + cylinder.getArea());
                    System.out.println("Volume: " + cylinder.getVolume());
                    break;

                default:
                    System.out.println("Жараксыз тандоо");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}