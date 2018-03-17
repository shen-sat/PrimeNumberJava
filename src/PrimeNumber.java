public class PrimeNumber {
    public void generate(int number) {
        boolean firstInList = true;
        for (int index=1; index<(number+1); index++) {
            if (number % index == 0) {
                int num = index;
                boolean prime = true;
                for (int i = 1; i < (num + 1); i++) {

                    if (num == 1) {
                        prime = false;
                        break;
                    } else if (num % i == 0 && (i != 1 && i != num)) {
                        prime = false;
                        //System.out.println(num + ": This is NOT a prime");
                        break;
                    } else if (i == num && prime == true) {

                        if (firstInList == true)  {
                            System.out.print(num);
                            firstInList = false;
                        } else  {
                            System.out.print(", " + num);
                        }

                    }
                }
            }
        }
        System.out.print(".");
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.generate(11);


    }
}
