package time;

public class JogadorNaoEncontradoException extends TimeException {
    public JogadorNaoEncontradoException() {
        super("Jogador não encontrado.");
    }
}