import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Logan Michel
 */
public class FilmesEx1L08JUnitTest {
    
    @Test
    public void testeDefinirEObterTitulo(){
        FilmesEx1L08 avatar = new FilmesEx1L08();
        avatar.setTitulo("Avatar");
        assertEquals("Avatar", avatar.getTitulo());
    }
    
    @Test
    public void testeDefinirEObterTiruloOriginal(){
        FilmesEx1L08 homemDeFerro = new FilmesEx1L08();
        homemDeFerro.setTituloOriginal("Iron Main");
        assertEquals("Iron Main", homemDeFerro.getTituloOriginal());
    }
    
    @Test
    public void testeDefinirEObterGenero(){
        FilmesEx1L08 jurassicWorld = new FilmesEx1L08();
        jurassicWorld.setGenero("Ação");
        assertEquals("Ação", jurassicWorld.getGenero());
    }
    
    @Test
    public void testeDefinirEObterDiretor(){
        FilmesEx1L08 doutroEstraho = new FilmesEx1L08();
        doutroEstraho.setDiretor("Scott Derrickson");
        assertEquals("Scott Derrickson", doutroEstraho.getGenero());
    }
    
    @Test
    public void testeDefinirEObterAnoLancamento(){
        FilmesEx1L08 guardioesDaGalaxia = new FilmesEx1L08();
        guardioesDaGalaxia.setAnoLancamento((short) 2014);
        assertEquals(2014, guardioesDaGalaxia.getAnoLancamento());
    }
    
    @Test
    public void testeDefinirEObterValorFaturamento(){
        FilmesEx1L08 vingadoreGuerraInfinita = new FilmesEx1L08();
        vingadoreGuerraInfinita.setValorFaturamento(1000000000);
        assertEquals(1000000000, vingadoreGuerraInfinita.getValorFaturamento());
    }
    
    @Test
    public void testeDefinirEObterValorOrcamento(){
        FilmesEx1L08 perdidoEmMarte = new FilmesEx1L08();
        perdidoEmMarte.setValorOrcamento(1000000);
        assertEquals(1000000, perdidoEmMarte.getValorOrcamento());
    }
    
    @Test
    public void testeDefinirEObterEspectadores(){
        FilmesEx1L08 velozesEFuriosos7 = new FilmesEx1L08();
        velozesEFuriosos7.setEspectadores(1516045911);
        assertEquals(1516045911, velozesEFuriosos7.getEspectadores());
    }
    
    @Test
    public void testeDefinirEObterClassificacao(){
        
    }
}