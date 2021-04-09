package tw.probability;

import java.util.Objects;

public class Probability {
    public double probabilityOfHead;
    public double probabilityOfTail;
    public double probabilityOfEvent;
    public Probability(double probabilityOfHead, double probabilityOfTail) {
        this.probabilityOfHead = probabilityOfHead;
        this.probabilityOfTail = probabilityOfTail;
    }

    public Probability(double probabilityOfEvent) {
        this.probabilityOfEvent = probabilityOfEvent;
    }

    public static double getProbabilityOfTwoEventsOccuringTogether(Probability probabilityOfEventOne, Probability probabilityOfEventTwo) {
        if (probabilityOfEventOne.probabilityOfEvent>1 || probabilityOfEventTwo.probabilityOfEvent>1 ){
            throw new IllegalArgumentException("Probabilty cannot be zero or greater than one");
        }
        return probabilityOfEventOne.probabilityOfEvent*probabilityOfEventTwo.probabilityOfEvent;
    }

    @Override
    public boolean equals(Object o) {
        Probability cointoss=(Probability) o;
        return  (this.probabilityOfHead==cointoss.probabilityOfTail) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(probabilityOfHead, probabilityOfTail);
    }
}
