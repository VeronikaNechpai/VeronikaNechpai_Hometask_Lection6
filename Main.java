package by.epam.lesson6.hometask;

public class Main {
	public static void main(String[] args) {
        Group group = new Group();

        int countOfStudents = group.enterCountOfStudents();
        group.enterGroup(countOfStudents);
        group.calcAvgMark();
        group.calcAvgGroupMark();
        group.calcOtlichnik();
        group.calcDvoechnik();
        group.printGroup();
    }
}
