package time;
import java.util.ArrayList;
import java.util.List;
public class Time {
	//LISTA DE JOGADORES TITULARES E RESERVAS
    private List<Jogador> titulares;
    private List<Jogador> reservas;

    //CONSTRUTOR PADRAO
    public Time() {
    	//ATRIBUINDO DADOS DOS JOGADORES NAS LISTAS, RESERVAS E TITULARES
        this.titulares = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }
    // MÉTODO PARA ADICIONAR JOGADORES NAS LISTAS, RESERVAS E TITULARES NO QUAL O VALOR NAO PODE SER NEGATIVO
    public void incluirJogador(Jogador jogador, boolean titular) throws TimeException {
        validarValorNegativo(jogador.getAltura(), "altura");
        validarValorNegativo(jogador.getPeso(), "peso");
        validarValorNegativo(jogador.getIdade(), "idade");
        validarValorNegativo(jogador.getValorMercado(), "valor de mercado");

        if (titular) {
            if (titulares.size() < 5) {
                titulares.add(jogador);
            } else {
                throw new TitularesExcedidosException();
            }
        } else {
            if (reservas.size() < 5) {
                reservas.add(jogador);
            } else {
                throw new ReservasExcedidasException();
            }
        }
    }

    //MÉTODO PARA VERIFICAR SE O VALOR INSERIDO É NEGATIVO
    private void validarValorNegativo(double valor, String campo) throws ValorNegativoException {
        if (valor <= 0) {
            throw new ValorNegativoException(campo);
        }
    }
    //MÉTODO PARA ALTERAR A POSIÇÃO DOS JOGADORES, ENTRE RESERVA E TITULAR
    public void alterarPosicaoJogador(String nomeJogador) throws TimeException {
        Jogador jogador = buscarJogador(nomeJogador);

        if (jogador != null) {
            if (titulares.contains(jogador)) {
                titulares.remove(jogador);
                reservas.add(jogador);
            } else if (reservas.contains(jogador)) {
                reservas.remove(jogador);
                titulares.add(jogador);
            }
        } else {
            throw new JogadorNaoEncontradoException();
        }
    }
    //MÉTODO QUE BUSCA JOGADOR E EXCLUI O MESMO DA LISTA
    public void excluirJogador(String nomeJogador) throws TimeException {
        Jogador jogador = buscarJogador(nomeJogador);

        if (jogador != null) {
            titulares.remove(jogador);
            reservas.remove(jogador);
            System.out.println("Jogador removido com sucesso.");
        } else {
            throw new JogadorNaoEncontradoException();
        }
    }
    //MÉTODO QUE LISTA OS JOGADORES TITULARES
    public void listarDados() {
        System.out.println("Titulares:");
        for (Jogador jogador : titulares) {
            jogador.exibirDados();
            System.out.println("-----------------------");
        }
        //MÉTODO QUE LISTA OS JOGADORES RESERVAS
        System.out.println("Reservas:");
        for (Jogador jogador : reservas) {
            jogador.exibirDados();
            System.out.println("-----------------------");
        }
    }
    //MÉTODO PARA BUSCAR OS JOGADORES NA LISTA DE TITULARES E RESERVAS
    private Jogador buscarJogador(String nomeJogador) {
        for (Jogador jogador : titulares) {
            if (jogador.getNome().equals(nomeJogador)) {
                return jogador;
            }
        }
        for (Jogador jogador : reservas) {
            if (jogador.getNome().equals(nomeJogador)) {
                return jogador;
            }
        }
        return null;
    }
}
