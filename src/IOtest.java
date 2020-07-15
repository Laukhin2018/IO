public class IOtest {

    public static void main(String[] args) {

        for(int id = 1; id <= 200; id++){
            double coff = (Math.random() +  Math.random()) * id * 100;
            System.out.println((int)coff);
        }
    }
}
