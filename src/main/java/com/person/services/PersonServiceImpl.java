package com.person.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.person.entities.Person;
import com.person.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getAll() {
        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(personList::add);
        return personList;
    }

    @Override
    public Person save(Person p) {
        return personRepository.save(p);
    }

    @Override
    public Person findById(Long id) {
        Optional<Person> dbPerson = personRepository.findById(id);
        return dbPerson.orElse(null);
    }
}