// Superclass
class Bird {
    String name;

    public Bird(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(name + " is flying");
    }
}

// Subclass Duck
class Duck extends Bird {
    public Duck(String name) {
        super(name);
    }

    // Ducks can also swim, so we add a swim method
    public void swim() {
        System.out.println(name + " is swimming");
    }

    // Ducks override fly method to quack while flying
    @Override
    public void fly() {
        System.out.println(name + " is flying and quacking");
    }
}

// Subclass Ostrich
class Ostrich extends Bird {
    public Ostrich(String name) {
        super(name);
    }

    // Ostriches cannot fly, so we do not override fly method
}

