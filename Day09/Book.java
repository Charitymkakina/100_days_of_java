package Day09; 

public abstract class Book { // It defines the behaviour that every book must have while allowing subclasses to provide their own implemetation
    abstract void displayBookType();
    abstract void recommendBook();
    abstract void displayDescription();
}

