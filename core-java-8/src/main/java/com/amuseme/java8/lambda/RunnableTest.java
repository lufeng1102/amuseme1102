package amuseme.java8.lambda;

/**
 * Created by lufeng on 2017/1/18.
 */
public class RunnableTest {
    public static void main(String[] args){
        System.out.println("=== RunnableTest ===");

        // Anonymouse Runnable
        Runnable r1 = new Runnable(){

            @Override
            public void run(){
                System.out.println("Hello world one!");
            }
        };

        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");

        // Run em!
        r1.run();
        r2.run();


    }
}
