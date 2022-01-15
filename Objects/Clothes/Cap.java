package Objects.Clothes;

import Persons.Person;

public class Cap extends Clothes implements Wearable{

    @Override
    public void see(Person person) {
        System.out.println(person.getName() + " увидел колпак");
    }
    @Override
    public void take(Person person) {
        System.out.println(person.getName() + " взял колпак");
    }
    @Override
    public void wear(Person person) {
        System.out.println(person.getName() + " напялил колпак");
    }
}
