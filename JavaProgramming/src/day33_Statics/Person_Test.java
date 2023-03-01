package day33_Statics;

public class Person_Test {

    public static void main(String[] args) {


        Person person1=new Person("Emre",33,'M');
        Person person2=new Person("Hülya",33,'F');

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);

        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);

        person1.eat("Hamburger");
        person2.eat("Fajita");

        person1.drink("Ice Tea");
        person2.drink("Cola");

        

    }
}
