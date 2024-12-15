import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    Point2D point1 = new Point2D();
    Point2D point2 = new Point2D();   
    System.out.println("Enter two numbers: ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    point1.setX(x);
    point1.setY(y);
    point2.setX(4);
    point2.setY(6);
    System.out.println(point1.toString());
    System.out.println(point1.equals(point2));

    Dog dog1 = new Dog();
    System.out.println("Enter a name: ");
    sc.nextLine();
    dog1.setName(sc.nextLine());
    System.out.println("Enter a breed: ");
    dog1.setBreed(sc.nextLine());
    System.out.println("Enter a fur color");
    dog1.setFurColor(sc.nextLine());
    System.out.println("Enter a size: ");
    dog1.setSize(sc.nextDouble());
    System.out.println("Your dog: " + dog1.getName() + "\n\t" + dog1.getBreed() + "\n\t" + dog1.getSize() + "\n\t" + dog1.getFurColor());

    Person person1 = new Person();
    System.out.println("Enter the person's first name: ");
    sc.nextLine();
    person1.setFirstName(sc.nextLine());
    System.out.println("Enter the person's last name: ");
    person1.setLastName(sc.nextLine());
    System.out.println("Enter the person's age: ");
    person1.setAge(sc.nextInt());
    System.out.println("Enter the person's social security number: ");
    person1.setSSN(sc.nextInt());
    System.out.println(person1.toString());

    Oven oven1 = new Oven();
    System.out.println("Maximum oven temperature: ");
    oven1.setMaxTemp(sc.nextInt());
    System.out.println("Starting temperature of the oven: ");
    oven1.preheat(sc.nextInt());
    System.out.println(oven1.toString());
    sc.nextLine();
    String input = "";
    while (!(input.equals("q"))) {
      System.out.println("To preheat the oven enter \"p\", to turn the oven off enter \"o\", to restart enter \"r\", to quit enter \"q\"");
      input = sc.nextLine();
      if (input.equals("p")) {
        System.out.println("Enter the temperature to preheat the oven to: ");
        oven1.preheat(sc.nextInt());
        sc.nextLine();
        System.out.println("Current temperature of the oven is now " + oven1.getCurrentTemp() + " degrees");
      }
      if (input.equals("o")) {
        System.out.println("Turning the oven off.");
        oven1.turnOff();
      }

      if (input.equals("r")) {
        System.out.println("Restarting the oven.");
      }
    }

    sc.close();
  }
}
