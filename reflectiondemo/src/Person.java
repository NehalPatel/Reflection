public class Person {
    private String name;

    private static int numPeople=0;

    public Person(String name){
        this.name = name;

        numPeople++;
    }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }

    private void printPerson(Person p){
        System.out.println(p.getName());
    }

    private static void printStaticMember(){
        System.out.println(numPeople);
    }
}
