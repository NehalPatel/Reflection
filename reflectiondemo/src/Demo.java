import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo {
    public static void main(String args[]){
        Person p = new Person("Nehal");
        Person p2 = new Person("Devashya");

        try {
            //get all fields of Person class
            Field[] fields = p.getClass().getDeclaredFields();
            for(Field field : fields){
                System.out.println(Modifier.toString(field.getModifiers()) + ' ' +field.getName());
            }
            System.out.println("=========================");

            //get all methods of Person and Parents class
            Method[] methods = p.getClass().getDeclaredMethods();
            for(Method method : methods){
                System.out.println(Modifier.toString(method.getModifiers()) + ' ' +method.getName());
            }
            System.out.println("=========================");

            //get all Constructors of Person class
            Constructor[] constructors = p.getClass().getDeclaredConstructors();
            for(Constructor constructor : constructors){
                System.out.println(constructor.getName());
            }
            System.out.println("=========================");

            //Access Private field
            Field f = p.getClass().getDeclaredField("name");
            f.setAccessible(true);
            System.out.println(f.get(p2));

            //Access Private static field
            Field sf = Person.class.getDeclaredField("numPeople");
            sf.setAccessible(true);
            System.out.println(sf.get(null));

            System.out.println(p.getName());

            //Access Public method
            Method m = p.getClass().getDeclaredMethod("getName");
            System.out.println(m.invoke(p));

            Method m2 = p.getClass().getDeclaredMethod("setName", String.class);
            m2.invoke(p, "Rahul");
            System.out.println(p.getName());

            //p.printPerson(); //Error: private method

            //Access Private method
            Method mf = p.getClass().getDeclaredMethod("printPerson", Person.class);
            mf.setAccessible(true);
            mf.invoke(p, p2);

            //Access Private static method
            Method smf = Person.class.getDeclaredMethod("printStaticMember");
            smf.setAccessible(true);
            smf.invoke(null);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
