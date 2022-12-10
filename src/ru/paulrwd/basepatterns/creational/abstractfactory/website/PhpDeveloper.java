package ru.paulrwd.basepatterns.creational.abstractfactory.website;

import ru.paulrwd.basepatterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes Php code...");
    }
}
