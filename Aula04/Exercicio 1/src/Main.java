import java.util.Scanner;
/**
 * @author Yago
 * @version 1.0
 * @since 04/03/21 - 07:13 PM
 * @category View
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Client client = new Client();

        System.out.println("Type your name:");
        client.setName(scanner.nextLine());

        System.out.println("Type your age:");
        client.setAge(scanner.nextInt());

        System.out.println("Type your salary:");
        client.setSalary(scanner.nextDouble());

        System.out.println(client);
    }
}
