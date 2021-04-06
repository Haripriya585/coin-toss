package tw.probability;

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
        return  (this.probabilityOfHead+cointoss.probabilityOfTail==1);
    }
}
