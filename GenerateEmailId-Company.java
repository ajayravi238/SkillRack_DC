class Company {
    private String domainName;
    
    public Company(String domainName) {
        this.domainName = domainName;
    }
    public String generateEmailId(String n, String d) {
        String name = n.toLowerCase();
        String designation = d.toLowerCase();
        String dn = domainName.toLowerCase();
        return name + "." + designation + "@" + dn;
    }
}
