package by.academy.it.aspects_xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("work")
public class Work {

    public void beforeWork() {
        System.out.println("Execution before work");
    }

    public void afterWork() {
        System.out.println("Execution after work");
    }

    public void afterWorkProblems() {
        System.out.println("Execution after work problems");
    }

    public void aroundWorkProblems(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Start");
            System.out.println("Begin time : " + System.currentTimeMillis());
            String result = (String) joinPoint.proceed();
            System.out.println("Finish time : " + System.currentTimeMillis());
            System.out.println("Status " + result);
        } catch (Throwable t) {
            System.out.println(t);
        }
    }

    public void interceptWorkName(String twoNames) {
        System.out.println("Intercepted work is " + twoNames);
    }

    public void interceptWorkTwo(String s, Integer integer) {
        System.out.println("Intercepted work is " + s + "; " + integer);
    }

}
