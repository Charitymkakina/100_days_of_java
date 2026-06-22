package Day12;

public enum Book {
   ROMANCE(1), FANTASY(2), SCIFI(3), SELFHELP(4), TRUECRIME(5);
   
private final int bookNumber;
Book(int bookNumber){
    this.bookNumber = bookNumber;
}
public int GetBookNumber(){
    return this.bookNumber;
}
}
