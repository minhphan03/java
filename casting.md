It is always possible to cast an instsance of a subclass to a variable of a superclass (known as upcasting), because an instance of a subclass 
is always an instance of its superclass.

```java
public m(Object o) {
  //Do anything here
}

public static void main(String[] args) {
  
  //upcasting (from student object to object object) is possible and can be done implicitly
  m(new Student());
  
  //this is explicit casting of upcasting
  
  Object o = new Student();
  m(o);
}
```
  
Downcasting (casting an instance -- **Declared Type not Object Type** -- of a superclass to the subclass) sometimes is necessary because the declared type decided which method to match at compile time.
Using Object.getGrades() (for example) would cause a compile error because the Object class does not have that method. Therefore, we have to **explicitly** cast the declared type
to tell the compiler that the variable o is also an instance of Student. 

For the casting to be successful, you must make sure that the object to be cast is an instance of the subclass, hence explicit casting. Using *instanceof* operator is a good practice to make sure that the object is an instance of another object before casting.

```java
Object myObject = new Circle();
if (myObject instanceof Circle) {
  System.out.print("The circle diameter is " + ((Circle)myObject).getDiameter());
```

#### Downcasting example:
```java
public class CastingDemo {
  /** Main method */
  public static void main(String[] args) {
    // Create and initialize two objects
    Object object1 = new Circle(1);
    Object object2 = new Rectangle(1, 1);

    // Display circle and rectangle
    displayObject(object1);
    displayObject(object2);
  }

  /** A method for displaying an object */
  public static void displayObject(Object object) {
    if (object instanceof Circle) {
      System.out.println("The circle area is " +
        ((Circle)object).getArea());
      System.out.println("The circle diameter is " +
        ((Circle)object).getDiameter());
    }
    else if (object instanceof Rectangle) {
      System.out.println("The rectangle area is " +
        ((Rectangle)object).getArea());
    }
  }
}
```
