public class MainApp {
    public static void main(String[] args) {

        // CO TO JEST KLASA
        // Z CZEGO SKŁADA SIĘ KLASA

        // Typ nazwa = nowy obiekt;

        User bartek = new User();
        bartek.firstName = "Bartek";
        bartek.lastName = "Testowy";
        bartek.email = "bartek@testowy.com";
        bartek.age = 17;
        bartek.isAdult = false;
        bartek.getFullName();
        bartek.getAllInfo();
        System.out.println(bartek.getUserAge());
        int userAge = bartek.getUserAge();
        System.out.println(userAge);

        boolean userAdult = bartek.isUserAdult();
        System.out.println("Czy Bartek jest dorosły : " + userAdult);

        bartek.greetings("Bartek");

        User tomek = new User();
        tomek.firstName = "Tomek";
        tomek.lastName = "Brown";
        tomek.email = "tomek@brown.com";
        tomek.age = 30;
        tomek.isAdult = true;
        tomek.getFullName();
        tomek.getAllInfo();

        boolean isTomekAdult = tomek.isUserAdult();
        System.out.println(isTomekAdult);

    }
}
