public class MainApp {
    public static void main(String[] args) {

        // CO TO JEST KLASA
        // Z CZEGO SKŁADA SIĘ KLASA

        // Typ nazwa = nowy obiekt;

        User bartek = new User("Bartek", "Testowy", "bartek@testowy.com", 17); // wywołanie konstruktora
        bartek.getAllInfo();

        User tomek = new User("Tomek", "Brown", "tomek@testowy.com", 30); // wywołanie konstruktora
        tomek.getAllInfo();

        Bug bug1 = new Bug("Bug1", "tomek@bug.com", 1); // wywołanie konstruktora
        bug1.showAllBugInfo();
        bug1.showEmail();
        bug1.showBugStatus();
        int bugPriority = bug1.getBugPriority();
        System.out.println(bugPriority);


        bug1.bugStatus = true;
        bug1.showBugStatus();







    }
}
