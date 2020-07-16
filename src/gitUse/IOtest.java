package gitUse;

public class IOtest {

    public static void main(String[] args) {

        ganarRandomNumbers();

        int result = additionTwoIntNumbers(4, 3);
        System.out.println("\n\n" + result);

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
