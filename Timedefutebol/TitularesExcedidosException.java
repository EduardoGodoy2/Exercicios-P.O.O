package time;

public class TitularesExcedidosException extends TimeException {
    public TitularesExcedidosException() {
        super("O time já possui 5 titulares.");
    }
}