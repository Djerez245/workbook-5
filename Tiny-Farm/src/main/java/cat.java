public class cat extends FarmAnimals{

    public cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Im....." + getName() + " nibble, nibble, yum, yum. !!");

    }
}
