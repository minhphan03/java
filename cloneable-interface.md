Often it is desirable to create a copy of an object. To do this, you need to use the clone method and understand the __Cloneable__ interface.

Many classes in the Java library (e.g., Date, Calendar, and ArrayList) implement Cloneable. Thus, the instances of these classes can be cloned. For example, the following code clones Calendar objects.

```java
import java.util.*;

public class TestCloneCalendar {
  public static void main(String[] args) {
    Calendar calendar = new GregorianCalendar(2013, 2, 1);
    Calendar calendar1 = calendar;
    // calendar2 is a clone of calendar
    Calendar calendar2 = (Calendar)calendar.clone();
    System.out.println("calendar == calendar1 is " 
      + (calendar == calendar1));
    System.out.println("calendar == calendar2 is " 
      + (calendar == calendar2));
    System.out.println("calendar.equals(calendar2) is "
      + calendar.equals(calendar2));
  }
}
```
* The results:
> calendar == calendar1 is true

It is true because calendar 1 is just a name pointing to the same object like calendar

> calendar == calendar2 is false

It is false because calendar 2 is another object, unrelated to calendar

> calendar.equals(calendar2) is true

It is true because they have the same content


------------------------
To define a custom class that implements the Cloneable interface, the class must override the clone() method in the Object class.


```java
public class House implements Cloneable, Comparable<House> {
  private int id;
  private double area;
  private java.util.Date whenBuilt;
  
  public House(int id, double area) {
    this.id = id;
    this.area = area;
    whenBuilt = new java.util.Date();
  }
  
  public int getId() {
    return id;
  }
  
  public double getArea() {
    return area;
  }

  public java.util.Date getWhenBuilt() {
    return whenBuilt;
  }

  @Override /** Override the protected clone method defined in 
    the Object class, and strengthen its accessibility */
  public Object clone() throws CloneNotSupportedException {
   // Perform a shallow copy
   House houseClone = (House)super.clone();
   // Deep copy on whenBuilt
   houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
   return houseClone;
}

  @Override // Implement the compareTo method defined in Comparable
  public int compareTo(House o) {
    if (area > o.area)
      return 1;
    else if (area < o.area)
      return -1;
    else
      return 0;
  }  
}
```

We can see that we have to throw a CloneNotSupportedException because sometimes the clone type is unsupported. (Hence the protected method clone)
Furthermore, for shallow copy, the clone method will clone primitive types only, so that's why for dates when you clone the Date, it will still copy the references of the original to the copy. For example:
> house1.whenBuilt == house2.whenBuilt is true

> house1 == house2 is false

That's why we should configure the overridden clone method to perform deep copy, like the example above.

