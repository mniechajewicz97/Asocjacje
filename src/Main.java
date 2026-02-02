import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Address address = new Address("Bagrowa", "Krakow", "12-345");
        Human adix = new Human("Adix", "Brigidaa", 1998, address);
        Human ewelina = new Human("Ewelina", "Kotowska", 1998, address, "Mgr");

        adix.addHuman(ewelina);
        ewelina.addHuman(adix);

        adix.removeHuman(ewelina);
        System.out.println(adix);
        System.out.println(ewelina);
        System.out.println();
        System.out.println("Zadanie 1");

        //Zamodeluj drużynę sportową oraz zawodników.
        //	•	Drużyna przechowuje listę zawodników.
        //	•	Zawodnik ma jeden atrybut opcjonalny, obsłużony przez przeciążenie konstruktora.
        //	•	Wiek zawodnika ma być wyliczany, nie przechowywany.
        //	•	Drużyna powinna udostępniać metody liczące dane na podstawie listy zawodników (np. suma, średnia, najlepszy).
        //	•	W main pokaż operacje dodawania, usuwania i odczytu danych wyliczalnych.


        Player lawendowski = new Player("Roman", "Lawendowski", 1988, 50, true);
        Player szczesniak = new Player("Witold", "Szczęśniak", 1990, 35, true);
        Player gzik = new Player("Mateusz", "Gzik", 1990, 20);
        Team team = new Team(); // nie potrzbujemy tworzy pol konstruktora
        team.addPlayer(lawendowski);
        team.addPlayer(szczesniak);
        team.addPlayer(gzik);
        System.out.println("Wynik całej drużyny to " + team.sumScore());
        team.removePlayer(lawendowski);
        System.out.println("Drużyna składa się z: " + team.getTeam());
        System.out.println("Punkty całej drużyny wynoszą " + team.sumScore());
        team.addPlayer(lawendowski);
        System.out.println("Najwyższy wynik to " + team.theBestScore() + " zdobyty przez " + team.getBestPlayer());
        System.out.println("0000000000");
        System.out.println(team.getTeam());
//        team.getTeam().removeFirst(); nie uda sie bo teraz jest niemutowalna
        System.out.println(team.getTeam());
        System.out.println("0000000000");

        System.out.println();
        System.out.println("Zadanie 2");
        //Adrian
        //Zamodeluj zamówienie zawierające produkty.
        //	•	Zamówienie przechowuje produkty nie bezpośrednio, ale przez obiekt pośredni (relacja ma własne dane).
        //	•	Klient zamówienia jest opcjonalny i obsłużony przez przeciążenie konstruktora.
        //	•	Wszystkie wartości finansowe mają być wyliczane, nie przechowywane.
        //	•	Logika dodawania produktu powinna uwzględniać przypadek ponownego dodania tego samego produktu.
        //	•	W main zaprezentuj działanie zamówienia i danych wyliczalnych.

        Product pencil = new Product("Pencil", 5);
        OrderProduct op = new OrderProduct(pencil, 50, 0.2);
        Order order = new Order();
        order.addOrderProduct(op);
        System.out.println(op);
        op.setHowMany(10);
        System.out.println(op);

        Test test = new Test();
        //tralalala test
    }
}
