# problem

[geeks for geeks problem link ](https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions)
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
array.The missing number will be the difference between the sum of n natural numbers and the
sum of the given array.

# **Time Complexity:**

### O(n)

# **Space Complexity:**

### O(1)

# solution

```


int n = arr.length+1;
        // to get sum of n numbers so that we can minus to get remain no
        int naturalNoFormula =  n * (n+1)/2;
        // to find sum
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = arr[i]+sum;
        }

    // to store result

        return naturalNoFormula-sum;


```
