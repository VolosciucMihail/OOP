public class University {
    String name;
    int fyear;
    Student[] students;

    float findAvg() {
        float avg = 0;
        float sum = 0;

        for(int i = 0; i< students.length; i++){
            sum = sum + students[i].mark;
        }
        avg = sum / students.length;

        return avg;
    }
}
