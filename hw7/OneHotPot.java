public class OneHotPot extends HotPot {
    public OneHotPot() {
        this.meat = "����";
        this.greens = "���";
        this.material = "����";
    }
    public String prepare() {
        return this.getClass() + "prepare----------";
    }
}