package n1;
public class CakeBuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        CakeBuilder strawberryCakeBuilder = new StrawberryCakeBuilder();
        CakeBuilder chocolateCakeBuilder = new ChocolateCakeBuilder();

        waiter.setCakeBuilder( strawberryCakeBuilder );
        waiter.constructCake();

        Cake cake = waiter.getCake();
    }
}
