package br.ufrpe.concurrency_class.executors_lambdas;

import java.util.concurrent.TimeUnit;

public class SingleThreadWait {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }

}
