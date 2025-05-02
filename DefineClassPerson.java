class Person {
    private int age;
    private String name;
    
    public Person() {
        this.name = "person";
        this.age = 0;
    }
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override 
    public String toString() {
        return name + ":" + age;
    }
}
