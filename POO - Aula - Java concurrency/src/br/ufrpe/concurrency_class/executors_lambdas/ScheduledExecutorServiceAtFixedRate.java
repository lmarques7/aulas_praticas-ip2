package br.ufrpe.concurrency_class.executors_lambdas;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceAtFixedRate {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());

        int initialDelay = 0;
        int period = 1;
        
        // Não considera o término da tarefa já iniciada para calcular o delay
        executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);
    }
}
