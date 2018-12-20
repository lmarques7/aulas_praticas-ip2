package br.ufrpe.concurrency_class.executors_lambdas;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorFutureTimeout {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<Integer> future = executor.submit(() -> {
            try {
                System.out.println("Before waiting 2 seconds");
                TimeUnit.SECONDS.sleep(2);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        });

        try {
            future.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Aconteceu uma exceção do tipo " + e.getClass());
        }

    }

}
