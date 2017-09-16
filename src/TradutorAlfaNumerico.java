
import java.util.HashMap;
import java.util.Map;


public class TradutorAlfaNumerico {
    
    String mensagem = "";
    String resultado = "";
    
    Map<String, String> mapeamento;
    CharSequence seqNumerica;
    
    public TradutorAlfaNumerico(){
        mapeamento = new HashMap<>();
        inicializarHash();
        
    }
    
    
    public boolean mensagemVazia() {
        return mensagem.isEmpty();
    }

    public String digitar(String texto) {
        
        if(texto.length() > 255)
            throw new MensagemMaiorQuePermitidoException("Tamanho da mensagem > 255 caracteres");
        
        
        else{
            this.mensagem = texto;
            this.mensagem = this.mensagem.toUpperCase();
            
 
            
            for(int i = 0; i < this.mensagem.length(); i++){
                
                this.resultado += mapeamento.get(String.valueOf(mensagem.charAt(i)));
                
            }
        }
        
        return resultado;
        
       
    }

    private void inicializarHash() {
        
        mapeamento.put("A", "2");
        mapeamento.put("B", "22");
        mapeamento.put("C", "222");
        mapeamento.put("D", "3");
        mapeamento.put("E", "33");
        mapeamento.put("F", "333");
        mapeamento.put("G", "4");
        mapeamento.put("H", "44");
        mapeamento.put("I", "444");
        mapeamento.put("J", "5");
        mapeamento.put("K", "55");
        mapeamento.put("L", "555");
        mapeamento.put("M", "6");
        mapeamento.put("N", "66");
        mapeamento.put("O", "666");
        mapeamento.put("P", "7");
        mapeamento.put("Q", "77");
        mapeamento.put("R", "777");
        mapeamento.put("S", "7777");
        mapeamento.put("T", "8");
        mapeamento.put("U", "88");
        mapeamento.put("V", "888");
        mapeamento.put("W", "9");
        mapeamento.put("X", "99");
        mapeamento.put("Y", "999");
        mapeamento.put("Z", "9999");
        mapeamento.put(" ", "0");
    }
    
}
