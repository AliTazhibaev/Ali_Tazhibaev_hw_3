public class Main {
    public static void main(String[] args) {

        double [] numbers={2.1, -4.2, 3.3,-7.7, -4.6, -5.9, -10.1, 4.5, 51.52,
                -8.7, -9.6, -5.9, -11.1, 9.5, 1.52, };


        int n=0;

        double sum=0;

        boolean firstNegative=false;

        for (double geektech:numbers){
            if (geektech<0){
                firstNegative = true;

            } else if (firstNegative && geektech>0) {
                n++;
                sum +=geektech;
                System.out.println(geektech);
            }

            }
            System.out.println(sum /n);
        System.out.println("Среднее Арифметическое");

        }
}




