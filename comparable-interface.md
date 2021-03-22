The Comparable interface is a generic interface. The generic type E is replaced by a concrete type when implementing this interface. Many classes in the Java library implement Comparable to define a natural order for objects
Some of these classes are:
* String
* Integer
* Byte
* Short
* BigInteger
* BigDecimal
* Long
* Float
* Calendar
* Date

When you implement the interface and sort lists having objects of these types, it is default and you don't have to do anything:
```java
import java.math.*;

public class SortComparableObjects {
  public static void main(String[] args) {
    String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
    java.util.Arrays.sort(cities);
    for (String city: cities)
      System.out.print(city + " "); 
    System.out.println();
    
    BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),
       new BigInteger("432232323239292"), 
       new BigInteger("54623239292")};    
    java.util.Arrays.sort(hugeNumbers); // Sort hugeNumbers
    for (BigInteger number: hugeNumbers)
      System.out.print(number + " "); 
  }
}
```

The results are:

> Atlanta Boston Savannah Tampa 

> 54623239292 432232323239292 2323231092923992 


However, for handmade classes, you have to configure the comparable interface in a new class so that it works for you:

```java
public class ComparableRectangle extends Rectangle 
    implements Comparable<ComparableRectangle> {
  /** Construct a ComparableRectangle with specified properties */
  public ComparableRectangle(double width, double height) {
    super(width, height);
  }

  @Override // Implement the compareTo method defined in Comparable 
  public int compareTo(ComparableRectangle o) {
    if (getArea() > o.getArea())
      return 1;
    else if (getArea() < o.getArea())
      return -1;
    else
      return 0;
  }
  
  @Override // Implement the toString method in GeometricObject
  public String toString() {
    return "Width: " + getWidth() + " Height: " + getHeight() +
      " Area: " + getArea();
  }
}
```

This is a test file for the above class:

```java
public class SortRectangles {
  public static void main(String[] args) {
    ComparableRectangle[] rectangles = {
      new ComparableRectangle(3.4, 5.4), 
      new ComparableRectangle(13.24, 55.4),
      new ComparableRectangle(7.4, 35.4),
      new ComparableRectangle(1.4, 25.4)};
    java.util.Arrays.sort(rectangles); // Sort rectangles
    for (Rectangle rectangle: rectangles) {
      System.out.println(rectangle); 
    }
  }
}
```
After sorted, the results:
> Width: 3.4 Height: 5.4 Area: 18.36 

> Width: 1.4 Height: 25.4 Area: 35.559999999999995 

> Width: 7.4 Height: 35.4 Area: 261.96 

> Width: 13.24 Height: 55.4 Area: 733.496 
