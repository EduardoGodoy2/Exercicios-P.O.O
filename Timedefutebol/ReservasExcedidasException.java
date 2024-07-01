package time;

public class ReservasExcedidasException extends TimeException {
    public ReservasExcedidasException() {
        super("O time já possui 5 reservas.");
    }
}