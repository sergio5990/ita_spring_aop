package by.academy.it.aspects_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.academy.it.aspects_xml.TaskService;

public class AspectXmlLoader {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aspects_xml.xml");
        TaskService bean = (TaskService) context.getBean("taskService");
        bean.performJob();
//        bean.performJob("Spring");
        bean.performJob("Spring", 1000000);
        /*try {
            bean.performExceptionJob();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        ((ClassPathXmlApplicationContext) context).close();
    }
}
