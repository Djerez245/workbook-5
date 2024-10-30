public class Dog extends FarmAnimals{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println( "Im......" + getName() +  " Slurp, Chomp, Slurrrp. !!");
    }
}
