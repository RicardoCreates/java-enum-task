package de.ricardo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.SUNDAY;
        switch (day) {
            case MONDAY:
                case TUESDAY:
                    case WEDNESDAY:
                        case THURSDAY:
                            case FRIDAY:
                                System.out.println("Weekday");
                                break;
                                case SATURDAY:
                                    case SUNDAY:
                                        System.out.println("Weekend");
                                        break;
                                        default:
                                            System.out.println("Invalid day");
                                            break;
        }
        PersonRepository personRepository = new PersonRepository(new ArrayList<>());
        personRepository.addPerson(new Person("1", "Franz", DaysOfWeek.MONDAY));
        personRepository.addPerson(new Person("2", "Anna", DaysOfWeek.TUESDAY));
        System.out.println(personRepository.getPersonById("1"));
        System.out.println(personRepository.getPersonById("3"));
    }
}