public class Main {
    public static void main(String[] args) {


    Address address = new Address("Bagrowa","Krakow","12-345");
        Human adix = new Human("Adix", "Brigidaa", 1998, address);
        Human ewelina = new Human("Ewelina", "Kotowska", 1998, address, "Mgr");

        adix.addHuman(ewelina);
        ewelina.addHuman(adix);

        adix.removeHuman(ewelina);
        System.out.println(adix);
        System.out.println(ewelina);
    }
}
