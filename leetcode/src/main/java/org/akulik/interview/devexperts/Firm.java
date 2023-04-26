package org.akulik.interview.devexperts;

import java.util.List;

public class Firm {
    private final List<Person> employees;

    public Firm(List<Person> employees) {
        this.employees = employees;
    }

    public List<Person> getEmployees() {
        return employees;
    }
}
