import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Logan Michel
 */
public class BrinquedosEx2L08JUnitTest {
    
    @Test
    public void testeDefinirEObterNome(){
        BrinquedosEx2L08 hotWheels = new BrinquedosEx2L08();
        hotWheels.setNome("Hot Wheels");
        assertEquals("Hot Wheels", hotWheels.getNome());
    }
    
    @Test
    public void testeDefinirEObterMarca(){
        BrinquedosEx2L08 hotWheels = new BrinquedosEx2L08();
        hotWheels.setMarca("Han Sold");
        assertEquals("Han Sold", hotWheels.getMarca());
    }
    
    @Test
    public void testeDefinirEObterModelo(){
        BrinquedosEx2L08 hotWheels = new BrinquedosEx2L08();
        hotWheels.setModelo("Carros");
        assertEquals("Carros", hotWheels.getModelo());
    }
    
    @Test
    public void testeDefinirEObterPreco(){
        BrinquedosEx2L08 hotWheels = new BrinquedosEx2L08();
        hotWheels.setPreco(15);
        assertEquals(15, hotWheels.setPreco());
    }
    
    
}
