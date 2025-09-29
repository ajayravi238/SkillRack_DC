    private String name;
    private String dept;
    private int salary;
    
    public Professor(String name) {
        this.name = name;
        dept = "N/A";
        salary = 10000;
    }
    
    public Professor(String name, String dept) {
        this.name = name;
        this.dept = dept;
        salary = 15000;
    }
    
    public Professor(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDept() {
        return dept;
    }
    
    public void setDept(String dept) {
        this.name = name;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
