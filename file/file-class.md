Create a new file object: 
```java
public class TestFileClass {
  public static void main(String[] args) {
    java.io.File file = new java.io.File("image/us.gif");
```
* exists method return boolean whether the file is exist
```java
    System.out.println("Does it exist? " + file.exists());
```
* length method to check the storage data (in bytes) of a file:
```java
    System.out.println("The file has " + file.length() + " bytes");
```
* canRead method to return a boolean whether we can read the file (allow to be read):
```java
    System.out.println("Can it be read? " + file.canRead());
```
* canWrite method to return a boolean whether we can write new info on the file (locked for edit?):
```java
    System.out.println("Can it be written? " + file.canWrite());
```
* isDirectory method to show if the object is a folder/directory:
```java
    System.out.println("Is it a directory? " + file.isDirectory());
```
* isFile method to check if the file object is a file and not a directory:
```java
    System.out.println("Is it a file? " + file.isFile());
```
* isAbsolute points out if the file object created use an absolute file path (absolute path is the complete path from the root directory.)
```java
    System.out.println("Is it absolute? " + file.isAbsolute());
```
* isHidden points out whether the file is hidden or not in the directory:
```java
    System.out.println("Is it hidden? " + file.isHidden());
```
* getAbsolutePath writes down the absolute path:
```java
    System.out.println("Absolute path is " +
      file.getAbsolutePath());
```
* lastModified shows the last date and time modified of a file:
```java
    System.out.println("Last modified on " +
      new java.util.Date(file.lastModified()));
  }
}
```
