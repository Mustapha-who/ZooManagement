import java.util.*;

public class ZooManagement {
    private int nbrCages = 20;
    private String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the zoo name: ");
        zoo.zooName = scanner.nextLine();

        System.out.print("Enter the number of cages: ");
        zoo.nbrCages = scanner.nextInt();

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");

    }
}


