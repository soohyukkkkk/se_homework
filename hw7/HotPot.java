


public abstract class HotPot {

    protected String meat;

    protected String greens;

    protected String material;

    public abstract String prepare();

    public void display() {
        System.out.println(this.meat + this.greens + this.material);
    }
}
