public class Main {
    public static void add(int n) {
        if (n == 10) 
            return;
        add(n+1);
        System.out.println(n);
        
    }

    public static void main(String[] args) {
        Main m=new Main();
        add(1);
    }
}
