
public static int product(int m, int k) {
    if (k == 0) {
        return 0;
    } else {
        return m + product(m, k-1);
    }
}


public static int quotient(int x, int y) {
  if (y > x)
    return 0;
  else
    return 1 + quotient(x - y, y);
}
