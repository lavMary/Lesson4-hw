public class ComputerOwnersChanger {
    void changeOwner(Computer computer1, Computer computer2) {
        Person owner1 = computer1.owner;
        computer1.owner = computer2.owner;
        computer2.owner = owner1;
        System.out.println("Changing is done.");
    }
}
