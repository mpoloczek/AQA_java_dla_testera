public class Bug {
    //POLA OBIEKTU
    // - opis błędu
    // - adres email osoby zgłaszającej błąd
    // - priorytety błędu (1-5)
    // - Status błędu (otwarty/zamknięty) - domyślnie, podczas tworzenia zawsze otwarty

    String bugDescription;
    String userEmail;
    int bugPriority;
    boolean bugStatus;

    // KONSTRUKTOR
    Bug(String bugDescription, String userEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.userEmail = userEmail;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    // METODY
    // - pokaż wszystkie informacje na temat błędu
    // - pokaż osobę zgłszającą błąd
    // - pokaż status błędu
    // - zwróć priorytet błędu

    void showAllBugInfo() {
        System.out.println(bugDescription + " " + userEmail + " " + bugPriority + " " + bugStatus);
    }

    void showEmail() {
        System.out.println("User email is: " + userEmail);
    }

    int getBugPriority() {
        return bugPriority;
    }

    void showBugStatus() {
        System.out.println("Bug status is: " + bugStatus);
    }

}
