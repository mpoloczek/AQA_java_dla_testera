public class MainApp {
    public static void main(String[] args) {

        // CO TO JEST KLASA
        // Z CZEGO SKŁADA SIĘ KLASA

        // Typ nazwa = nowy obiekt;

        User bartek = new User("Bartek", "Testowy", "bartek@testowy.com", 17); // wywołanie konstruktora
        bartek.getAllInfo();

        User tomek = new User("Tomek", "Brown", "tomek@testowy.com", 30); // wywołanie konstrukt
        tomek.getAllInfo();


    }
}
