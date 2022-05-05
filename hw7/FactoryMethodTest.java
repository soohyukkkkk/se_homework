public class FactoryMethodTest {

    public static void main (String args[]) {
        HotPotStore hotPotStore = new OneHotPotStore();
        hotPotStore.orderHotPot();
     
    }
}