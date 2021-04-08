package tw.probability;

import java.util.Objects;

public class Probability {
    public double probabilityOfHead;
    public double probabilityOfTail;

    public Probability(double probabilityOfHead, double probabilityOfTail) {
        this.probabilityOfHead = probabilityOfHead;
        this.probabilityOfTail = probabilityOfTail;
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
