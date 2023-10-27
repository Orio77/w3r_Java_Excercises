public class Main {
    public static void main(String[] args) {

        Personn person1 = new Personn("Josh", 30);
        Personn person2 = new Personn("Patrick", 27);

        System.out.println("First person is this years old: ");
        System.out.print(person1.getAge());
        System.out.println();
        System.out.println("Person 2 is named: ");
        System.out.print(person2.getName());


    }
}
