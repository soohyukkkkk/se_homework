
public abstract class HotPotStore {

  
    public void orderHotPot() {
        
        HotPot hotPot = this.createHotPot();
        hotPot.prepare();
        hotPot.display();
    }

 
    public abstract HotPot createHotPot();

}