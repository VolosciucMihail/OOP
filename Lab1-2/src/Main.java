public class Main {

    public static void main(String[] args) {
       Student Vasea = new Student();
       Student Petea = new Student();
       Student Vova = new Student();
       Student Grisha = new Student();
       Student Anea = new Student();
       Student Masha = new Student();

       University UTM = new University();
       University ASEM = new University();

       Vasea.age = 18;
       Petea.age = 19;
       Vova.age = 23;
       Grisha.age = 17;
       Anea.age = 21;
       Masha.age= 19;

       Vasea.mark = 8;
       Petea.mark = 9;
       Vova.mark = 10;
       Grisha.mark = 10;
       Anea.mark = 5;
       Masha.mark = 7;

       Student[] UTMStudents = {Vasea, Petea, Masha};
       Student[] ASEMStudents = {Vova, Grisha, Anea};

       UTM.students = UTMStudents;
       UTM.name = "Technical University of Moldova";
       UTM.fyear = 1964;

       ASEM.students = ASEMStudents;
       ASEM.name = "Academy of Economy Studies of Moldova";
       ASEM.fyear = 1991;

       float cmmnAvg = (UTM.findAvg() + ASEM.findAvg()) / 2;

       System.out.println("Common Average = " + cmmnAvg);

    }
}
