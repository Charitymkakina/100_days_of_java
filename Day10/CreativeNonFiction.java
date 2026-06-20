package Day10;

public class CreativeNonFiction implements Fiction, NonFiction{
    @Override
    public void Fantasy(){
        System.out.println(" * The Fairy Tellers * Reading this book gives a fantasy feel");
    }
    @Override
    public void Encourage(){
        System.out.println(" * The Fairy Tellers * gives a vibe of a non-fiction book ");
    }
}
