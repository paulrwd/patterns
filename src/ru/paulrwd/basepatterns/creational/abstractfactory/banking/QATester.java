package ru.paulrwd.basepatterns.creational.abstractfactory.banking;

import ru.paulrwd.basepatterns.creational.abstractfactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking code...");
    }
}
