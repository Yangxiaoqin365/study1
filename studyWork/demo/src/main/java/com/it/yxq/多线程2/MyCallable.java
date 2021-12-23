package com.it.yxq.多线程2;

import java.util.concurrent.*;

public class MyCallable {


    public static void main(String[] args) {
        MyCallableDemo my=new MyCallableDemo();
        /*FutureTask<Integer> futureTask = new FutureTask<Integer>(my);
        //new Thread(futureTask).start();

        try {
            Object o = futureTask.get();
            System.out.println("sum:"+o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
*/
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Future<Integer> submit = pool.submit(new MyCallableDemo());
        Integer integer = null;
        try {
            integer = submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("00000----"+integer);
        pool.shutdown();
    }
}


class MyCallableDemo implements Callable<Integer>{

    @Override
    public Integer call() {

        int sum =0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum+=i;
                System.out.println(i);
            }
        }
        return sum;
    }
}
