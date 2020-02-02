package com.pravin.example.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitCoreDemo {
    public static void main(String[] args) {
        /* Result result = JUnitCore.runClasses(AppTest.class);

         for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
         }
         */

        JUnitCore runner = new JUnitCore();
        runner.addListener(new JunitListenerDemo());
        runner.run(AppTest.class, AppTestSupplier.class);
    }
}
