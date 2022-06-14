
class MythicalAnimal {

    public void hello() {
        System.out.println("Hello, I'm an unknown animal");
    }
}

class Chimera extends MythicalAnimal {
    @Override
    public void hello() {
        System.out.println("Hello! Hello!");
    }
}

class Dragon extends MythicalAnimal {
    @Override
    public void hello() {
        System.out.println("Rrrr...");
    }
}

public class Task {
    public static void main(String[] args) {

        MythicalAnimal chimera = new Chimera();
        MythicalAnimal dragon = new Dragon();
        MythicalAnimal animal = new MythicalAnimal();

        chimera.hello();
        dragon.hello();
        animal.hello();
    }
}
