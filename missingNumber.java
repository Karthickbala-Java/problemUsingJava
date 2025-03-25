class MissingNumber {
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
}Output:16 Explanation:

In the
above code, we
have an
array of
numbers from 1 to 15.
We have
to find
the missing
number in
the array.
We have
used the
formula to
find the
sum of
n natural
numbers.We have
calculated the
sum of
the given
array.The missing
number will
be the
difference between
the sum
of n
natural numbers
and the
sum of
the given
array.


Space Complexity:

O(1) 
Also, read: 
Find the missing number in an array of 1 to 100 Find the missing number in an array of 1 to 100 
Leave a Reply  Cancel reply Your email address will not be published. Required fields are marked * Comment * Name *  Email *  Please enable JavaScript to submit this form.