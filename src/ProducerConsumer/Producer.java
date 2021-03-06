package ProducerConsumer;

import java.util.Random;

public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        Random random = new Random();

        int[] numbers = new int[1000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            drop.put(numbers[i]);
            try {
                Thread.sleep(random.nextInt(5));
            } catch (InterruptedException e) {}
        }

        drop.put(0);

//        String[] importantInfo = {
//                "Mares eat oats",
//                "Does eat oats",
//                "Little lambs eat ivy",
//                "A kid will eat ivy too"
//        };

//        for (int i = 0; i < importantInfo.length; i++) {
//            drop.put(importantInfo[i]);
//            try {
//                Thread.sleep(random.nextInt(5000));
//            } catch (InterruptedException e) {}
//        }
    }
}