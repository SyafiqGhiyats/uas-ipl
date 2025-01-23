public class BangunRuangApps {
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();

        // Set values for Balok
        bangunRuang.setPanjang(5);
        bangunRuang.setLebar(3);
        bangunRuang.setTinggi(4);

        // Display results for Balok
        System.out.println("Luas Permukaan Balok: " + bangunRuang.luasBalok());
        System.out.println("Volume Balok: " + bangunRuang.volumeBalok());

        // Set value for Bola
        bangunRuang.setDiameter(7);

        // Display results for Bola
        System.out.println("Luas Permukaan Bola: " + bangunRuang.luasBola());
        System.out.println("Volume Bola: " + bangunRuang.volumeBola());
    }
}
