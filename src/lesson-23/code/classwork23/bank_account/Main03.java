package classwork23.bank_account;
// написать метод который найдет максимальное значение в массиве double
public class Main03 {

    public static double findMax(double[] array) {
        double maxValue = Double.MIN_VALUE; // Установка начального значения на минимальное число типа double
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        double[] array = {4.45, 32.1, 78, 11.3, 12, 8};
        double max = findMax(array);
        System.out.println("Max: " + max);
    }
}
