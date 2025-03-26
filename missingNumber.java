class missingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        // if array has only one element we return next value using +!

        // getting the length becuz it obviously the largest no in simple largest no =
        // arr.length
        int n = arr.length + 1;
        // to get sum of n numbers so that we can minus to get remain no
        int naturalNoFormula = n * (n + 1) / 2;
        // to find sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }

        // to store result

        System.out.print(naturalNoFormula - sum);
    }
}