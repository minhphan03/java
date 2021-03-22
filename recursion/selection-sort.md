```java
public class RecursiveSelectionSort {
  public static void sort(double[] list) {
    sort(list, 0, list.length - 1); // Sort the entire list
  }

  private static void sort(double[] list, int low, int high) {
    if (low < high) {
      // Find the smallest number and its index in list(low .. high)
      int indexOfMin = low;
      double min = list[low];
```
For this one, search through the list from the position of the low end (the start position) to the end of the list
```java
for (int i = low + 1; i <= high; i++) {
        if (list[i] < min) {
          min = list[i];
          indexOfMin = i;
        }
      }
```
When you have found the smallest of the remaining, swap the smallest in list(low .. high) with list(low)
```java
      list[indexOfMin] = list[low];
      list[low] = min;
```
Recursively sort the remaining by advancing the low position
```java
      // Sort the remaining list(low+1 .. high)
      sort(list, low + 1, high);
    }
  }
}
```
