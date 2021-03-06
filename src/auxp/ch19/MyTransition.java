package auxp.ch19;

public class MyTransition<E, F, G> extends MyAssociation<E, F> {

    G third;

    public MyTransition(E first, F second, G third) {
        super(first, second);
        this.third = third;
    }

    public static double sum(
        MyTransition<? extends Number, ? extends Number, ? extends Number> transition) {
        return transition.first.doubleValue()
            + transition.second.doubleValue()
            + transition.third.doubleValue();
    }

    public G getThird() {
        return third;
    }

    public void setThird(G third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "MyTransition{" + "first=" + first + ", second=" + second + ", third=" + third + '}';
    }
}
