package br.com.zup.Modulo5_Investimento;

public enum Risco {
    BAIXO(0.005),
    MEDIO(0.015),
    ALTO(0.025);

    private double taxa;

    Risco(double taxa) {
    }

    public double getTaxa() {
        return taxa;
    }
}
