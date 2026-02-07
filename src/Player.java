public class Player {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int score;
    private Boolean isSpecialist;

    public Player(String name, String surname, int yearOfBirth, int score) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.score = score;
    }

    public Player(String name, String surname, int yearOfBirth, int score, Boolean isSpecialist) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.score = score;
        this.isSpecialist = isSpecialist;
    }
    public int getAge() {
        return 2026 - yearOfBirth;
    }

    public int getScore() {
        return score;
    }
    public String toString() {
        if (isSpecialist == null) {
            return name + " " + surname;
        } else {
            return "Specjalista " + name + " " + surname;
        }

    }
}




