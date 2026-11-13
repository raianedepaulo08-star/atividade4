public class Conversor {

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double kmParaMilhas(double km) {
        return km * 0.621371;
    }

    public static double realParaDolar(double reais) {
        return reais / COTACAO_DOLAR;
    }

    public static final double COTACAO_DOLAR = 5.40;


}



