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
        assertEquals("Scott Derrickson", doutroEstraho.getDiretor());
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
        vingadoreGuerraInfinita.setValorFaturamento((double)150000000);
        assertEquals(150000000, vingadoreGuerraInfinita.getValorFaturamento(),0);
    }
    
    @Test
    public void testeDefinirEObterValorOrcamento(){
        FilmesEx1L08 perdidoEmMarte = new FilmesEx1L08();
        perdidoEmMarte.setValorOrcamento(1000000.00);
        assertEquals(1000000.00, perdidoEmMarte.getValorOrcamento(),0);
    }
    
    @Test
    public void testeDefinirEObterEspectadores(){
        FilmesEx1L08 velozesEFuriosos7 = new FilmesEx1L08();
        velozesEFuriosos7.setEspectadores(1516045911);
        assertEquals(1516045911, velozesEFuriosos7.getEspectadores());
    }
    
    @Test
    public void testeDefinirEObterClassificacao(){
        FilmesEx1L08 poderosoChefao2 = new FilmesEx1L08();
        poderosoChefao2.setClassificacao("+18");
        assertEquals("+18", poderosoChefao2.getClassificacao());
    }
    
    @Test
    public void testeDefinirEObterMediaPreco(){
        FilmesEx1L08 besouroVerde = new FilmesEx1L08();
        besouroVerde.setMediaPreco(3745);
        assertEquals(3745, besouroVerde.getMediaPreco(),0);
    }
    
    @Test
    public void testeDefinirEObterDataLancamentoBrasil(){
        //FilmesEx1L08 velozesEFuriosos8 = new FilmesEx1L08();
        //velozesEFuriosos8.setDataLancamentoBrasil(17042017);
        //assertEquals(17042017, velozesEFuriosos8.getDataLancamento());
    }
    
    @Test
    public void testeDefinirEObterIdioma(){
        FilmesEx1L08 asBemArmadas = new FilmesEx1L08();
        asBemArmadas.setIdioma("Idioma");
        assertEquals("Idioma", asBemArmadas.getIdioma());
    }
}