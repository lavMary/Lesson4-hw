public class Main {
    public static void main(String[] args) {

        Person jake = new Person("Jake Collins", 44);
        Computer lenovo = new Computer(jake, "Windows", 280);
        Person ann = new Person("Ann Thomson", 26);
        Computer asus = new Computer(ann, "Linux", 320);

        lenovo.stateOfComputer();
        asus.stateOfComputer();

        ComputerOwnersChanger change = new ComputerOwnersChanger();
        change.changeOwner(lenovo, asus);

        lenovo.stateOfComputer();
        asus.stateOfComputer();
    }
}
