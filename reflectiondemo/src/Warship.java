class Warship {

    private String name;
    private String target;

    public Warship(String name) { this.name = name; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    private void setTarget(String target) { this.target = target; }
    public void getTarget(){ System.out.println(target); }

    private void attack() {
        System.out.println("Attacking " + target);
    }

    public void makeWar(String target) {
        setTarget(target);

        // add logic here, so that the Warship can attack the target
        // only after valid order from authority
        attack();
    }

}