public class ConsumoEnergia {
    public static void main(String[] args) {

        int[][] consumo = {
                {100, 120, 90, 80, 110, 100, 80, 150, 130, 110, 100, 120}, //2010
                {110, 130, 100, 90, 120, 110, 90, 160, 140, 120, 110, 130},//2011
                {120, 140, 110, 100, 130, 120, 100, 170, 150, 130, 120, 140},//2012
                {130, 150, 120, 110, 140, 130, 110, 180, 160, 140, 130, 150},//2013
                {140, 160, 130, 120, 150, 140, 120, 190, 170, 150, 140, 160},//2014
                {150, 170, 140, 130, 160, 150, 130, 200, 180, 160, 150, 170},//2015
                {160, 180, 150, 140, 170, 160, 140, 210, 190, 170, 160, 180},//2016
                {170, 190, 160, 150, 180, 170, 150, 220, 200, 180, 170, 190},//2017
                {180, 200, 170, 160, 190, 180, 160, 230, 210, 190, 180, 200},//2018
                {190, 210, 180, 170, 200, 190, 170, 240, 220, 200, 190, 210}//2019
        };

        double[] consumoMedioMes = new double[12];
        for (int mes = 0; mes < 12; mes++) {
            int soma = 0;
            for (int ano = 0; ano < 10; ano++) {
                soma += consumo[ano][mes];
            }
            consumoMedioMes[mes] = soma / 10.0;
            System.out.println("Mês " + (mes+1) + ": consumo médio = " + consumoMedioMes[mes]);
        }

        int maiorConsumo = 0;
        int anoMaiorConsumo = 0;
        int mesMaiorConsumo = 0;
        for (int ano = 0; ano < 10; ano++) {
            for (int mes = 0; mes < 12; mes++) {
                if (consumo[ano][mes] > maiorConsumo) {
                    maiorConsumo = consumo[ano][mes];
                    anoMaiorConsumo = ano + 2010;
                    mesMaiorConsumo = mes + 1;
                }
            }
        }
        System.out.println("Mês/ano de maior consumo: " + mesMaiorConsumo + "/" + anoMaiorConsumo);
    }
}
