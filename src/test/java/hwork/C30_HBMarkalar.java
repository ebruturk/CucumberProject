package hwork;

import org.junit.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C30_HBMarkalar {
    /*
    Given
        Go to https://www.hepsiburada.com/bilgisayarlar-c-2147483646
    When
        Click all marks and print their names
         (Soldaki markaların hepsine tıklayıp adlarını yazdırınız)

*/
    @Test
    public void test1(){
        Driver.getDriver().get(ConfigReader.getProperty("hb_markalar"));

    }
}
