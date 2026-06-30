package Day24;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(factorial(9));
    }
    public static int factorial(int num){
        if(num<1) return 1; 
        return num * factorial(num-1);
    }
}
