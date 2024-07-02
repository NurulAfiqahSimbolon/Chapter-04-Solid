// Tidak melanggar OCP karena setiap jenis kucing ditangani dengan polimorfisme.

public abstract class Kucing {
    public abstract void bersuara();
}

class KucingAnggora extends Kucing {
    @Override
    public void bersuara() {
        System.out.println("Meow");
    }
}

class KucingPersia extends Kucing {
    @Override
    public void bersuara() {
        System.out.println("Meong");
    }
}
