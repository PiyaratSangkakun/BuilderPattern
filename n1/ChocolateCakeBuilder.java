package n1;
class ChocolateCakeBuilder extends CakeBuilder {
    public void buildDough() {
        cake.setDough("pan baked");
    }

    public void buildSauce() {
        cake.setSauce("Chocolate");
    }

    public void buildTopping() {
        cake.setTopping("Chocolateship");
    }
}
