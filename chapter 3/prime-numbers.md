This program will print out a list of perfect numbers (which the number itself equals the sum of its divisors) that are smaller than a number input

```java
public static void perfectNumbers(int n) { 
	System.out.print("Perfect numbers up to " + n + ": ");
    
    for (int i = 1; i<=n; i++) {
        int sum = 0;
        for (int j = 1; j < i; j++) {
            
            if (i % j == 0) {
                sum += j;
    
            }
        }
        if (sum == i) {
        System.out.print(sum + " ");
        }
    }
}
```
