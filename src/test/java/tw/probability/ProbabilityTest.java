package tw.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testToGetTheProbabilityOfTwoEventsOccuringTogetherWhenProbabilityOfEventOnegreaterThanOne(){
        Probability probabilityOfEventOne=new Probability(1.5);
        Probability probabilityOfEventTwo=new Probability(0.5);

        assertThrows(RuntimeException.class, () -> {Probability.getProbabilityOfTwoEventsOccuringTogether(probabilityOfEventOne,probabilityOfEventOne);});
    }

    @Test
    public void testToGetTheProbabilityOfTwoEventsOccuringTogetherWhenProbabilityOfEventTwoGreaterThanOne(){
        Probability probabilityOfEventOne=new Probability(0.5);
        Probability probabilityOfEventTwo=new Probability(1.5);

        assertThrows(RuntimeException.class, () -> {Probability.getProbabilityOfTwoEventsOccuringTogether(probabilityOfEventOne,probabilityOfEventTwo);});
    }

    @Test
    public void testToGetTheProbabilityOfTwoEventsOccuringTogetherWhenProbabilityOfBothEventsAreGreaterThanOne(){
        Probability probabilityOfEventOne=new Probability(1.5);
        Probability probabilityOfEventTwo=new Probability(1.5);

        assertThrows(RuntimeException.class, () -> {Probability.getProbabilityOfTwoEventsOccuringTogether(probabilityOfEventOne,probabilityOfEventTwo);});
    }

    @Test
    public void testToGetTheProbabilityOfAnEventNotOccuring(){
        Probability probabilityOfAnEventToOccur=new Probability(0.2);
        double expectedValue=0.8;

        double actualValue=Probability.getProbabilityOfAnEventsNotOccuringr(probabilityOfAnEventToOccur);

        assertEquals(actualValue,expectedValue);
    }

    @Test
    public void testToGetTheProbabilityOfEitherOfTheEventsOccuring(){
        Probability probabilityOfEventOne=new Probability(0.6);
        Probability probabilityOfEventTwo=new Probability(0.5);
        double expectedValue=0.8;

        double actualValue=Probability.getTheProbabilityOfEitherOfTheEventsOccuring(probabilityOfEventOne,probabilityOfEventTwo);

        assertEquals(actualValue,expectedValue);
    }
}
