package lesson_66.atomic_integer;

import java.util.concurrent.atomic.AtomicInteger;

public class OurAtomicInteger {

    public static void main(String[] args) throws InterruptedException {

        // sozdania
        AtomicInteger atomicInteger = new AtomicInteger();
        System.out.println(atomicInteger);


        AtomicInteger atomicInteger1 = new AtomicInteger(123);
        System.out.println(atomicInteger1);


        // kak poluchit znachenya iz etogo klassa
        int value = atomicInteger1.get();
        System.out.println(value);


        // kak ustonovit znachenya
        atomicInteger1.set(456);


        // kak dobavit znachenya
        AtomicInteger atomicInteger2 = new AtomicInteger();
        System.out.println(atomicInteger2.getAndAdd(10));

        System.out.println(atomicInteger.addAndGet(10));


        atomicInteger.incrementAndGet(); // uvelichit i poluchit znachenya  ++i
        atomicInteger.getAndDecrement(); // puluchit i uvilichivaet  i++

        System.out.println("========================");


        final Counter counter = new Counter();

        for (int i = 0; i < 1000; i++) {

            new Thread(counter::increment).start();

        }

        Thread.sleep(3000);

        System.out.println("Final number(should be 1000): " + counter.value());


    }
}
