package by.academy.it.aop_introducer;

public class ExtendedTaskImpl implements DoExtendedTask {
    @Override
    public void doExtraJob() {
        System.out.println("Класс-аспект ExtendedTaskImpl выполняет дополнительную работу.");
    }
}
