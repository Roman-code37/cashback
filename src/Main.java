public class Main {
    public static void main(String[] args) {
        int amountInRegular = 100;
        int amountInHigh = 10;
        int amountInSpecial = 10_000;

        int percentInRegular = 1;
        int percentInHigh = 5;
        int percentInSpecial = 30;

        int result = (
                amountInRegular * percentInRegular +
                        amountInHigh * percentInHigh +
                        amountInSpecial * percentInSpecial
                )/ 100;
        System.out.println(result);

        int cashback;
        if (result > 3_000){
            cashback = 3_000;
        }else {
            cashback = result;
        }

        System.out.println(cashback);
    }
}
