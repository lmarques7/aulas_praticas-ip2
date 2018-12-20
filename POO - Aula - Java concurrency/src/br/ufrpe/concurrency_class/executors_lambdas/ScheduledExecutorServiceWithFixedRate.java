package br.ufrpe.concurrency_class.executors_lambdas;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceWithFixedRate {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Scheduling: " + System.nanoTime());
            }
            catch (InterruptedException e) {
                System.err.println("task interrupted");
            }
        };

        // Aplica o delay após o término da tarefa
        executor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);

    }

}
