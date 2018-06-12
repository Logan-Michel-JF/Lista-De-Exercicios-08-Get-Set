
import java.time.LocalDate;

/**
 * @author Logan Michel
 */
public class FilmesEx1L08 {
    private String titulo, tituloOriginal, genero, diretor;
    private short anoLancamento;
    private double valorFaturamento, valorOrcamento;
    private int espectadores;
    private String classificacao;
    private double mediaPreco;
    private LocalDate dataLancamentoBrasil;
    private String idioma;
    
    public void setTitulo(String Titulo){
        
        this.titulo = Titulo;
        
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTituloOriginal(String TituloOriginal){
        this.tituloOriginal = TituloOriginal;
    }
    
    public String getTituloOriginal(){
        return tituloOriginal;
    }
    
    public void setGenero(String Genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setDiretor(String Diretor){
        this.diretor = diretor;
    }
    
    public String getDiretor(){
        return diretor;
    }
    
    public void setAnoLancamento(short AnoLancamento){
        this.anoLancamento = anoLancamento;
    }
    
    public short getAnoLancamento(){
        return anoLancamento;
    }
    
    public void setValorFaturamento(double ValorFaturamento){
        this.valorFaturamento = valorFaturamento;
    }
    
    public double getValorFaturamento(){
        return valorFaturamento;
    }
    
    public void setValorOrcamento(double ValorOrcamento){
        this.valorFaturamento = valorFaturamento;
    }
    
    public double getValorOrcamento(){
        return valorOrcamento;
    }
    
    public void setEspectadores(int Espectadores){
        this.espectadores = espectadores;
    }
    
    public int getEspectadores(){
        return espectadores;
    }
    
    public void setClassificacao(String Classificacao){
        this.classificacao = classificacao;
    }
    
    public String getClassificacao(){
        return classificacao;
    }
    
    public void setMediaPreco(double MediaPreco){
        this.mediaPreco = mediaPreco;
    }
    
    public double getMediaPreco(){
        return mediaPreco;
    }
    
    public void setDataLancamentoBrasil(LocalDate DataLancamentoBrail){
        this.dataLancamentoBrasil = dataLancamentoBrasil;
    }
    
    public LocalDate getDataLancamento(){
        return dataLancamentoBrasil;
    }
    
    public void setIdioma(String Idioma){
        this.idioma = idioma;
    }
    
    public String getIdioma(){
        return idioma;
    }
    
}
