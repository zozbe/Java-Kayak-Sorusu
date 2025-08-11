public class KayakTest {
    public static void main(String[] args) {
        double m = 70; // kg
        double alpha = 30; // derece

        double kuvvet = Kayak.TOPRAK.hesapla(m, alpha);
        System.out.println("Toprak yüzeyinde inme kuvveti: " + kuvvet + " N");
    }
}
