package n1;
class StrawberryCakeBuilder extends CakeBuilder {
    public void buildDough() {
        cake.setDough("Soft Cake");
    }

    public void buildSauce() {
        cake.setSauce("Vanila");
    }

    public void buildTopping() {
        cake.setTopping("Strawberry");
    }
}
