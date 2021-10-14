package task_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int secret = rnd.nextInt(101);

        Scanner scan = new Scanner(System.in);

        int choice = 0;
        boolean nailed = false;

        do {
            System.out.print("Your choice: ");
            int player = scan.nextInt();
            if(player == secret) {
                System.out.println("You nailed it!");
                nailed = true;
                break;
            } else if(player < secret) {
                System.out.println("no no... Secret is higher\n");
                choice++;
            } else {
                System.out.println("no no... Secret in lower\n");
                choice++;
            }
        } while(choice < 5);

        if(!nailed) System.out.println("Secret was " + secret);

    }
}

/*

1. rnd 0-100
2. hádej číslo
3. 5 pokusů
4. pokaždé vypíše menší větší

 */