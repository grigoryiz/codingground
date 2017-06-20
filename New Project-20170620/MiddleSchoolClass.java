public class MiddleSchoolClass extends SchoolClass {
    
    private String getType;
    
    public MiddleSchoolClass(int number, String bykva, String getType) {
        super(number, bykva);
        this.getType = getType;
    }
    
    public String getType() {
        return getType;
    }
}