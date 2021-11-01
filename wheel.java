import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class wheel {
        public static void main(String[] args) {
            //HashMap testing :)
            HashMap<Integer, String> wheel = new HashMap<Integer, String>();
            Scanner scan = new Scanner(System.in);
            Random random = new Random();
            System.out.println("How many spokes would you like?");
            int spokes = Integer.valueOf(scan.nextLine());

            for(int x = 0; x<spokes; x++){
                System.out.println("Spoke " + (x+1) + ": ");
                String value = scan.nextLine();
                wheel.put(x, value);
            }
            System.out.println("Randomizing...");
            int selection = random.nextInt(spokes);
            System.out.println("The spoke that you rolled was: " + (selection+1) + " - " + wheel.get(selection));
        }
    }
