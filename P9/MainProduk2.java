public class MainProduk2 {
    public static void main(String[] args) {

        Komik komik = new Komik("Doraemon", "Nobita", 1300);
        Games games = new Games("Valorant", "Riot", "5 jam");

        System.out.println(komik.getInfoProduk());
        System.out.println(games.getInfoProduk());
    }
}
