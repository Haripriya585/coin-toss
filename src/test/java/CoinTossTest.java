import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CoinTossTest {
    @Test
    public void testIfProbabilityOfHeadIsEqualToProbabilityOfTailInCoinToss(){
        boolean expectedValue=true;
        CoinToss coin=new CoinToss();

        boolean actualValue=coin.toCompareProbabilityOfHeadIsEqualToProbabilityOfTail();

        assertEquals(actualValue,expectedValue);
    }
}
