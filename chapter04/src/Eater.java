// Antarmuka yang tidak melanggar ISP
interface Eater {
    void eat();
}

interface Sleeper {
    void sleep();
}

interface Mooer {
    void moo();
}

// Kelas sapi yang hanya mengimplementasikan antarmuka yang relevan
class Cow implements Eater, Sleeper, Mooer {
    @Override
    public void eat() {
        System.out.println("Cow is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping");
    }

    @Override
    public void moo() {
        System.out.println("Cow says moo");
    }
}

// Contoh kelas lain yang hanya membutuhkan beberapa antarmuka
class bird implements Eater, Sleeper {
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    // Metode fly hanya untuk burung
    public void fly() {
        System.out.println("Bird is flying");
    }
}