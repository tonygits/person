package com.person.services;
import com.person.entities.Person;

import java.util.List;

public interface PersonService {
    public List<Person> getAll();

    public Person save(Person p);

    public Person findById(Long ids);
}