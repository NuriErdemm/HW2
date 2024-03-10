public class Main {
    public static void main(String[] args) {
        Student student1=new Student( 1973,0.0);
        Student student2=new Student("Gökhan ","Bilgisayar Müh. ",0.0,1985);
        Student student3=new Student("Ayşe ", "Makine Müh. ", 0.0, 1985);
        Student student4=new Student("Elif ", "Elektrik-Elektronik Müh. ", 1.98, 2020);
        System.out.println("Öğrenci Bilgileri ");
        System.out.println("OGR-1 "+student1.getName()+" "+student1.getDepartment()+" "+student1.studentNo()+" "+student1.getGano());
        System.out.println("OGR-2 "+student2.getName()+student2.getDepartment()+student2.studentNo()+student2.getGano());
        System.out.println("OGR-3 "+student3.getName()+student3.getDepartment()+student3.studentNo()+student3.getGano());
        System.out.println("OGR-4 "+student4.getName()+student4.getDepartment()+student4.studentNo()+student4.getGano());
        System.out.println("3. öğrencinin ödeyeceği harç: "+student3.calculateTheFee(6,80));
        System.out.println("4. öğrencinin ödeyeceği harç: "+student4.calculateTheFee(12));
    }
}
