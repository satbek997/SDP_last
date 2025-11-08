package org.example;

public class JuniorDeveloper implements Developer {
    @Override
    public void create (ProjectClass project) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create (Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void create (Test test) {
        System.out.println("Creating not relaible test...");
    }
}
