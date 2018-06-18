package by.epam.lesson6.hometask;
import java.util.Scanner;

public class Group {
    private static Student[] studentsArray;
    private static int countOfStudents;
    private static double avgGroupMark;
    private static int countOtlichnik = 0;
    private static int countDvoechnik = 0;
    private static Scanner sc = new Scanner(System.in);
    public int getCountOfStudents() {
        return countOfStudents;
    }
    public void setCountOfStudents(int countOfStudents) {
        Group.countOfStudents = countOfStudents;
    }
    public Student[] getStudentsArray() {
        return studentsArray;
    }
    public void setStudentsArray(Student[] studentsArray) {
        Group.studentsArray = studentsArray;
    }
    public double getAvgGroupMark() {
        return avgGroupMark;
    }
    public void setAvgGroupMark(double avgGroupMark) {
        Group.avgGroupMark = avgGroupMark;
    }
    public int getCountOtlichnik() {
        return countOtlichnik;
    }

    public void setCountOtlichnik(int countOtlichnik) {
        Group.countOtlichnik = countOtlichnik;
    }

    public int getCountDvoechnik() {
        return countDvoechnik;
    }

    public void setCountDvoechnik(int countDvoechnik) {
        Group.countDvoechnik = countDvoechnik;
    }
    public int enterCountOfStudents() {
        System.out.print("Count of Students: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Count of Students: ");
        }
        countOfStudents = sc.nextInt();
        return countOfStudents;
    }

    public void enterGroup(int countOfStudents) {
        Group.studentsArray = new Student[countOfStudents];
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            Student student = new Student();
            student.typeName();
            student.enterMarkForFrench();
            student.enterMarkForEnglish();
            student.enterMarkForRussian();
            this.getStudentsArray()[i] = student;
        }
    }
    public void calcAvgMark() {
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            studentsArray[i].calcAvgMark();
        }
    }
    public void calcAvgGroupMark() {
        double temp = this.getAvgGroupMark();
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            temp += this.getStudentsArray()[i].getMarkForFrench();
            temp += this.getStudentsArray()[i].getMarkForEnglish();
            temp += this.getStudentsArray()[i].getMarkForRussian();
            this.setAvgGroupMark(temp);
        }
        this.setAvgGroupMark(this.getAvgGroupMark()/(this.getCountOfStudents()*3));
    }
    public void calcOtlichnik() {
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            if(this.getStudentsArray()[i].isOtlichnik()) {
                this.setCountOtlichnik(this.getCountOtlichnik() + 1);
            }
        }
    }

    public void calcDvoechnik() {
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            if(this.getStudentsArray()[i].isDvoechnik()) {
                this.setCountDvoechnik(this.getCountDvoechnik() + 1);
            }
        }
    }
    public void printGroup() {
        System.out.println();
        System.out.println("Count of Students: " + getCountOfStudents());
        Student[] studentsArray = this.getStudentsArray();
        for (int i = 0; i < this.getStudentsArray().length; i++) {
            studentsArray[i].printStudent();
        }
        System.out.println();
        System.out.println("Average Group Mark: " + getAvgGroupMark());
        System.out.println("Count of Top Perfromers: " + getCountOtlichnik());
        System.out.println("Count of Down Performers: " + getCountDvoechnik());
    }
}
