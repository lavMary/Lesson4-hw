public class Person {
    String name;
    int age;

    public Person() {}
    public Person(String personsName, int personsAge) {
        name = personsName;
        age = personsAge;
    }
    void introducing() {
        System.out.println(" Hello! Nice to meet you. My name is " + name +  " and I am " + age + " years old.");
    }

}
