package by.academy.it.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.academy.it.aspects.TaskService;

public class AspectLoader {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml");
        TaskService bean = (TaskService) context.getBean("taskService");
        bean.performJob("Spring");
        bean.performJob();
        bean.performJobAround();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
