import paral.Lambda_Create;

public class Lambda_expression {

    public static void main(String[] args) {
        Lambda_Create as=(a,b)-> System.out.println(a+b);
       // as.add(20, 30);

         Runnable r= ()-> {
             synchronized (as) {

                 as.add(30, 30);
             }
             };

             Thread th = new Thread(r);
             Thread th1 = new Thread(r);
             th.start();
             th1.start();

    }

}
