package gitUse;

import java.util.Scanner;

public class IOtest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num_1 = in.nextInt();
        int num_2 = in.nextInt();

        int result = additionTwoIntNumbers(num_1, num_2);
        System.out.println(result + "\n\n");

        System.out.println("Hello");

    }

    // новый метод для складывания чисел
    private static int additionTwoIntNumbers(int number_1, int number_2){
        return number_1 + number_2;
    }

    private static void ganarRandomNumbers(){
        for(int id = 1; id <= 200; id++){
            double coff = (Math.random() +  Math.random()) * id * 100;
            System.out.println((int)coff);
        }
    }


}
