package br.ufrpe.concurrency_class.executors_lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorInvokeAllComStream {

    public static void main(String[] args) throws InterruptedException {
        // newWorkStealingPool usa capacidade coerente da máquina de acordo
        // com o número de CPUs disponíveis
        ExecutorService executor = Executors.newWorkStealingPool();

        List<Callable<String>> callables = Arrays.asList(
                () -> "task1",
                () -> "task2",
                () -> "task3");

        executor.invokeAll(callables)
            .stream()
            .map(future -> {
                try {
                    return future.get();
                }
                catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            })
            .forEach(System.out::println);

    }

}