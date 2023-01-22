package jp.ac.uryukyu.ie.e225746;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;

public class SecretaryTest {
    
    @Test
    void secretarySettingTest(){
        Secretary se = new Secretary();
        int numPeople = 100;
        se.secretarySetting(numPeople);

        se.getBestPersonIndex();

        int max = Collections.max(se.getSecretaries());
        assertEquals(max,numPeople);
        //1~入力された数までリストにあるのかの境界線テスト
    }
}
