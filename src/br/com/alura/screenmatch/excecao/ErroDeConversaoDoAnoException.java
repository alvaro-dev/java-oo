package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDoAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDoAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
