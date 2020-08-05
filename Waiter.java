package n1;
class Waiter {
    private CakeBuilder cakeBuilder;

    public void setCakeBuilder(CakeBuilder cb) {
        cakeBuilder = cb;
    }

    public Cake getCake() {
        return cakeBuilder.getCake();
    }

    public void constructCake() {
        cakeBuilder.createNewCakeProduct();
        cakeBuilder.buildDough();
        cakeBuilder.buildSauce();
        cakeBuilder.buildTopping();
    }
}
