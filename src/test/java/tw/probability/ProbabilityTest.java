package tw.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {
    @Test
    public void testIfProbabilityOfHeadIsEqualToProbabilityOfTailInCoinToss(){
        boolean expectedValue=true;
        Probability cointoss=new Probability(0.5,0.5);

        boolean actualValue=cointoss.equals(cointoss);

        assertEquals(actualValue,expectedValue);
    }

    @Test
    public void testToGetTheProbabilityOfTwoEventsOccuringTogether(){
        Probability probabilityOfEventOne=new Probability(0.6);
        Probability probabilityOfEventTwo=new Probability(0.5);
        double expectedValue=0.3;

        double actualValue=Probability.getProbabilityOfTwoEventsOccuringTogether(probabilityOfEventOne,probabilityOfEventTwo);

        assertEquals(actualValue,expectedValue);
    }
}
