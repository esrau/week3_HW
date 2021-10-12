package week3;

public class person {
    String name;
    String surname;
    int age;
    String gender;
    int year;

    public person()
    {
        this.name = null;
        this.surname = null;
        this.age = age;
        this.gender = null;
    }

    person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    person(String name, String surname, int age, String gender, int year){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.year = year;
    }

}
