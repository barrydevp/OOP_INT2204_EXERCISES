public class Week4 {
    /**
     * 
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * 
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        if(arr.lenth > 0) {
            int min = arr[0];
            int length = arr.length;

            for(int i = 0; i < length; i++) {
                if(min > arr[i]) min = arr[i];
            }

            return min;
        }

        return 0;
    }

    /**
     * 
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = Math.round(weight / (height * height) * 10) / 10;

        if(BMI < 18.5) return "Thiếu cân";
        if(BMI < 23) return "Bình thường";
        if(BMI < 25) return "Thừa cân";

        return "Béo phì";
    }
}