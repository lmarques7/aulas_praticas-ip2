package br.ufrpe.concurrency_class;
class SampleThreadJoinExample extends Thread {
    public int processingCount = 0;
 
    SampleThreadJoinExample(int processingCount) {
        this.processingCount = processingCount;
        System.out.println("Thread Created");
    }
 
    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " started");
        while (processingCount > 0) {
            try {
                System.out.println("Before waiting 1s");                
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + this.getName() + " interrupted");
            }
            processingCount--;
        }
        System.out.println("Thread " + this.getName() + " exiting");
    }
    
    public static void main(String[] args) throws InterruptedException {
            Thread t1 = new SampleThreadJoinExample(10);
            Thread t2 = new SampleThreadJoinExample(5);
            t2.start();
            t1.start();
            System.out.println("Invoking join");
            t2.join(2000);
            System.out.println("Returned from join de t2 " + Thread.currentThread().getName());
            t1.join();
            System.out.println("Returned from join de t1" + Thread.currentThread().getName());
            System.out.println("Is t2 alive: " + t2.isAlive());
    }
}