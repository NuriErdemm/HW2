public class Student {
    private String name;
    private String department;
    private double gano;
    private int entryYear;
    private String stdNo;
    private int departmentCode= 404;
    public Student(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    public String getStdNo() {
        return stdNo;
    }

    public void setStdNo(String stdNo) {
        this.stdNo = stdNo;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Student(String name, String department){
        this.name=name;
        this.department=department;
    }
    public Student(int entryYear, double gano){
        this.entryYear=entryYear;
        if (gano<0 || 4<gano){
            throw new IllegalArgumentException("Öğrenci bulunamadı! ");
        }
        this.gano=gano;
    }
    public Student(String name, String department, double gano, int entryYear){
        this.name=name;
        this.department=department;
        if (gano<0 || 4<gano){
            throw new IllegalArgumentException("Öğrenci bulunamadı! ");
        }
        this.gano=gano;
        this.entryYear=entryYear;
    }
    public double calculateTheFee(int lessonsNum){
        return lessonsNum*80;
    }
    public double calculateTheFee(int lessonsNum, double tuition){
        return lessonsNum*tuition;
    }
    public String studentNo(){
        return this.stdNo=(entryYear+""+departmentCode+""+001);
    }
}
