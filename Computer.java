public class Computer {
    Person owner;
    String opSystem;
    int storage;

    public Computer() {}
    public Computer(Person computersOwner, String computersOpSystem, int computersStorage) {
        owner = computersOwner;
        opSystem = computersOpSystem;
        storage = computersStorage;
    }
    void stateOfComputer() {
        System.out.println("Computer of " + owner.name + " works pretty good with updated " + opSystem + " operation system.");
    }
}
