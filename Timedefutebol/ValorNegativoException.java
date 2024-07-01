package time;

public class ValorNegativoException extends TimeException {
    public ValorNegativoException(String campo) {
        super("O valor de " + campo + " não pode ser negativo.");
    }
}