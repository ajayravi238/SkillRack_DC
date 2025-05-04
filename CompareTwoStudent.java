class Student {
    private String name;
    private int age;
    private String country;
    
    public Student(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(!(o instanceof Student)) {
            return false;
        }
        Student s = (Student) o;
        return age == s.age && name.equalsIgnoreCase(s.name) &&
        country.equalsIgnoreCase(s.country);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(), age,
        country.toLowerCase());
    }
}
