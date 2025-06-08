class City implements Comparable<City> {
    private String city;
    private int men;
    private int women;
    
    public City(String city, int men, int women) {
        this.city = city;
        this.men = men; 
        this.women = women;
    }
    
    public int getTotalPopu() {
        return men + women;
    }
    
        @Override
        public int compareTo(City o) {
            int totalCompare = Integer.compare(o.getTotalPopu(), this.getTotalPopu());
            if(totalCompare != 0) {
                return totalCompare;
            }
            int menCompare = Integer.compare(o.men, this.men);
            if(menCompare != 0) {
                return menCompare;
            }
            return this.city.compareTo(o.city);
        }
    @Override
    public String toString() {
        return city + " " + men + " " + women;
    }
}
