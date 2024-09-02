package de.ricardo;

public record Person(
        String id, String name, Enum<DaysOfWeek> favoriteDay
) {

    public Person(String id, String name, Enum<DaysOfWeek> favoriteDay) {
        this.id = id;
        this.name = name;
        this.favoriteDay = favoriteDay;
    }
}
