package ru.paulrwd.basepatterns.creational.abstractfactory.website;

import ru.paulrwd.basepatterns.creational.abstractfactory.Developer;
import ru.paulrwd.basepatterns.creational.abstractfactory.ProjectManager;
import ru.paulrwd.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import ru.paulrwd.basepatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {


    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
