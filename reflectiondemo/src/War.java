public class War {
    public static void main(String args[]){
        Warship ship = new Warship("Ship1");
        ship.makeWar("China");

        //Cannot access private data and method
        // ship.target="Pakistan";
        // ship.setTarget("Pakistan");
        // ship.attack();
    }
}
