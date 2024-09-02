package de.ricardo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PersonRepository {
    List<Person> people = new ArrayList<>();

    public PersonRepository(List<Person> people) {
        this.people = people;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    Optional <Person> getPersonById(String id) {
        for (Person person : people) {
            if (person.id().equals(id)) {
                return Optional.ofNullable(person);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonRepository that = (PersonRepository) o;
        return Objects.equals(people, that.people);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(people);
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "people=" + people +
                '}';
    }
}
