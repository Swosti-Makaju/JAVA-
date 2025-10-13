public class javascope {
    {
        int x=20;
        System.out.println(x);
    }
    System.out.println(x); // it will give an error because x is not accessible outside the block
    public static void main(String[] args) {
        int x=10;
        System.out.println(x); // it will print 10 because it is accessible here
    }
    {
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        for(int i=0;i<10;i++){
            System.out.println("Hi" + i);
        }
    }
}
