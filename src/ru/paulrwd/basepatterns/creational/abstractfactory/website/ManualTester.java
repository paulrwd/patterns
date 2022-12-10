package ru.paulrwd.basepatterns.creational.abstractfactory.website;

import ru.paulrwd.basepatterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
