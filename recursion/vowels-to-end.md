helper
```java
public static String vowelsToEnd(String s) {
	int pos = 0;
    return vowelsToEnd(s, pos);
}
```
main recursive method:
```java
public static String vowelsToEnd(String s, int i) {
    if (s.length() == 0) {
        return "";
    }
    
    if (i == s.length()) {
        return "";
    }
    //if the character at that position is a vowel, bring it to the end
    if ((s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'e')
        || (s.charAt(i) == 'a') || (s.charAt(i) == 'u')) {
        return vowelsToEnd(s, i+1) + s.charAt(i);
    }
    
    //if the character at that position is not a vowel, continue to proceed.
    return s.charAt(i) + vowelsToEnd(s, i+1);
}
```
