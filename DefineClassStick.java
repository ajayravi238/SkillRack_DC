class Stick {
    private int stickLen;
    
    public Stick(int stickLen) {
        this.stickLen = stickLen;
    }
    
    public void combineStick(Stick Q1) {
        if(Q1.stickLen == 0) {
            System.out.println("Length of the stick cannot be zero");
            return;
        }
        this.stickLen += Q1.stickLen;
    }
    
    public void breakStick() {
        if(stickLen%2 != 0) {
            System.out.println("Length of the stick cannot be odd");
            return;
        }
        stickLen = stickLen / 2;
    }
    
    public int getLength() {
        return stickLen;
    }
}
