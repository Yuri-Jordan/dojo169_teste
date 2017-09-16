
public class TradutorAlfaNumerico {
    
    String mensagem = "";
    String seqNumerica = "";
    
    public boolean mensagemVazia() {
        return mensagem.isEmpty();
    }

    public boolean mensagemMaiorQuePermitido() throws MensagemMaiorQuePermitido{
        
        if(mensagem.length() > 255)
            throw new MensagemMaiorQuePermitido("Tamanho da mensagem > 255 caracteres");
        
        return mensagem.length() > 255;
    }

    public void digitar(String texto) {
        mensagem = texto;
    }
    
}
