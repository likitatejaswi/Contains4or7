import java.util.Scanner;
public class Ex78 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the elements");
        int[] array = new int[2];
        array[0] = s.nextInt();
        array[1] = s.nextInt();

        System.out.printf("Entered elements are [%d, %d] %n",array[0], array[1]);

        Contains c = new Contains();
        boolean result = c.contains(array);
        System.out.println("Final result :"+result);


    }
}
