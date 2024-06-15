package Jour04.Job08;

import java.util.concurrent.atomic.AtomicLong;

public class Job08 implements Runnable {
    private static final int MAX_NUM = 10_000_000;
    private static final int NUM_THREADS = 4; // Nombre de threads à utiliser

    private final int start;
    private final int end;
    private final AtomicLong sum; // Utilisation d'AtomicLong pour la somme

    public Job08(int start, int end, AtomicLong sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }

    @Override
    public void run() {
        long localSum = 0;
        for (int i = start; i <= end; i++) {
            localSum += i;
        }
        sum.addAndGet(localSum);
    }

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        AtomicLong totalSum = new AtomicLong(0);
        Thread[] threads = new Thread[NUM_THREADS];
        int increment = MAX_NUM / NUM_THREADS;

        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * increment + 1;
            int end = (i + 1) * increment;
            if (i == NUM_THREADS - 1) {
                end = MAX_NUM; // Assure que le dernier thread traite jusqu'à MAX_NUM
            }
            threads[i] = new Thread(new Job08(start, end, totalSum));
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join(); // Attend la fin de tous les threads
        }

        long endTime = System.currentTimeMillis();

        long durationInMs = endTime - startTime;

        System.out.println("La somme des entiers de 1 à " + MAX_NUM + " est: " + totalSum.get());
        System.out.println("Temps d'exécution : " + durationInMs + " millisecondes");
    }
}
