public class OneHotPot extends HotPot {
    public OneHotPot() {
        this.meat = "ÑòÈâ";
        this.greens = "Çà²Ë";
        this.material = "À±¹ø";
    }
    public String prepare() {
        return this.getClass() + "prepare----------";
    }
}