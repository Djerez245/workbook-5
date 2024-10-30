public class Main {

    public static void main(String[] args) {
        Farm f = new Farm();
        f.add(new Dog("Bernie"));
        f.add(new Dog("Doggy"));
        f.add(new cat("Kitty"));
        f.add(new Dog("Barky"));
        f.feedAnimals();
    }
}
