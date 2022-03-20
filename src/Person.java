import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {

        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public static void main(String[] args) {
        Person misha = new Person(22, "Misha");
        Person misha2 = new Person(25, "Misha");
        Map<String, String> map = new HashMap<>();
        map.put("12", "maks");
        map.put("123", "kirill");

    }
}


