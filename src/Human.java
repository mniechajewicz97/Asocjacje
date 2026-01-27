import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private String surname;
    private int yearOfBirth;
    private Address address; // adres jest asocjacja/ osoba posiada Adres
    private String title;
    private List<Human> humans = new ArrayList<>(); // atrubut powtarzalny, osoba moze miec wiele osob, nie dodajemy do konstruktora, zeby nie tworzyc zawsze nowej listy

    public Human(String name, String surname, int yearOfBirth, Address address, String title) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.title = title;
    }

    public Human(String name, String surname, int yearOfBirth, Address address) { // overloading uzywa sie w takim przypadku, gdy metoda jest opcjonalna (atrybut opcjonalny)
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge() {
        return 2026 - yearOfBirth; // atrybut wyliczalny
    }

    public Address getAddress() {
        return address;
    }

    public String getTitle() {
        return title;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void removeHuman(Human human) {
        this.humans.remove(human);
    }

    public void addHuman(Human human) {
        this.humans.add(human);
    }


    @Override
    public String toString() {
        if (title == null) {
            return name + " " + surname + " " + yearOfBirth + " " + address;
        } else {
            return title + " " + name + " " + surname + " " + yearOfBirth + " " + address;


            // zaimplementuj tostring do tej klasy, zeby wypisywalo osobe,a le pamietaj, ze niekotr maja tytul naukowy a niektore nie
            // sygnatury metod- przypomniec sobie
        }
    }
}
