import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class War {
    public static void main(String args[]){
        Warship ship = new Warship("Ship1");
        ship.makeWar("Earth");

        try {
            //Access Private field
            Field target = ship.getClass().getDeclaredField("target");
            target.setAccessible(true);
            target.set(ship, "Pakistan");

            ship.getTarget();

            //Access private function
            Method method = ship.getClass().getDeclaredMethod("attack");
            method.setAccessible(true);
            method.invoke(ship);

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
