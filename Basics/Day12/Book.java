package Day12;

public enum Book { //To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
   ROMANCE(1), FANTASY(2), SCIFI(3), SELFHELP(4), TRUECRIME(5); // Constants should all be in uppercase.

// An enum can also have a constructor just like a class
private final int bookNumber;
Book(int bookNumber){
    this.bookNumber = bookNumber;
}
public int GetBookNumber(){
    return this.bookNumber;
}
}
