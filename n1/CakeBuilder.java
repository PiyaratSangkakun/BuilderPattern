package n1;
abstract class CakeBuilder {
    protected Cake cake;

    public Cake getCake() {
        return cake;
    }

    public void createNewCakeProduct() {
        cake = new Cake();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
