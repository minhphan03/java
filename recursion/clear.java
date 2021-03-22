//This method will fill the whole list with zeros recursively

public static void clear(int[] a, int n) {
  if (n > 0) {
    a[n - 1] = 0;
    clear(a, n - 1);
  }
}

