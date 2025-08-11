public enum Kayak {
    KAR(0.21),
    TASLIK(0.34),
    TOPRAK(0.47);

    private final double fs;

    Kayak(double fs) { // Constructor doğru tanımlandı
        this.fs = fs;
    }

    public double hesapla(double m, double alpha) {
        double g = 9.81; // Yerçekimi ivmesi
        double sinAlpha = Math.sin(Math.toRadians(alpha)); // Açıyı radyana çevirerek hesaplama

        double N = m * g * sinAlpha; // Normal kuvvet
        double F_surtunme = this.fs * N; // Sürtünme kuvveti
        double F_inme = N - F_surtunme; // Net kuvvet

        return F_inme;
    }
}
