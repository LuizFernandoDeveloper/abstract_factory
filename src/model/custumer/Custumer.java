package model.custumer;

public class Custumer {
    private  String gradeRequest;
    private boolean hasCompanyContract;

    public Custumer(String gradeRequest, boolean hasCompanyContract){
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public boolean HasCompanyContract(){
        return  hasCompanyContract;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }
}
