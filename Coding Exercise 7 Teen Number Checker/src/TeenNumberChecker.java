public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        if (TeenNumberChecker.isTeen(num1) || TeenNumberChecker.isTeen(num2) || TeenNumberChecker.isTeen(num3)){
            return true;
        }

        return false;

    }

    public static boolean isTeen(int age) {
        if (age < 13 || age > 19){
            return false;
        }

        return true;
    }
}
