package day33_Statics;

public class CydeoStudent_Test {

    public static void main(String[] args) {

        CydeoStudent student1=new CydeoStudent("Emre",33,'M',4689,'B',12,9);
        CydeoStudent student2=new CydeoStudent("Hülya",33,'F',1234,'B',12,11);

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();





    }
}
