package by.epam.lesson6.hometask;
import java.util.Scanner;

public class Student {
 public String name;
 public int markForFrench;
 public int markForEnglish;
 public int markForRussian;
 private double avgMark;
 
 private static Scanner sc=new Scanner (System.in);
 
 public String getName() {
	 return name;
 }
 public void setName(String name) {
	 this.name=name;
 }
 public int getMarkForFrench() {
	 return markForFrench;
 }
 public void setMarkForFrench(int markForFrench) {
	 this.markForFrench=markForFrench;
 }
 public int getMarkForEnglish() {
	 return markForEnglish;
 }
 public void setMarkForEnglish(int markForEnglish) {
	 this.markForEnglish=markForEnglish;
 } 
 public int getMarkForRussian() {
	 return markForRussian;
 }
 public void setMarkForRussian(int markForRussian) {
	 this.markForRussian=markForRussian;
 }
 public double getAvgMark() {
     return avgMark;
 }
 public void setAvgMark(double avgMark) {
     this.avgMark = avgMark;
 }
 public void typeName () {
     System.out.println();
     System.out.print("Student Name: ");
     String temp = sc.nextLine();
     this.setName(temp);
 }
 public void enterMarkForFrench() {
     System.out.print("French mark: ");
     while(!sc.hasNextInt()) {
         sc.next();
         System.out.print("French mark: ");
     }
     int temp = sc.nextInt();
     if (temp > 0 && temp <= 10) {
         this.setMarkForFrench(temp);
     } else {
         System.out.println("Ivalid mark entered");
         enterMarkForFrench();
     }
 }
 public void enterMarkForEnglish() {
     System.out.print("English mark: ");
     while(!sc.hasNextInt()) {
         sc.next();
         System.out.print("English mark: ");
     }
     int temp = sc.nextInt();
     if (temp > 0 && temp <= 10) {
         this.setMarkForEnglish(temp);
     } else {
         System.out.println("Invalid mark entered");
         enterMarkForEnglish();
     }
 }
 public void enterMarkForRussian() {
     System.out.print("Russian mark: ");
     while(!sc.hasNextInt()) {
         sc.next();
         System.out.print("Russian mark: ");
     }
     int temp = sc.nextInt();
     if (temp > 0 && temp <= 10) {
         this.setMarkForRussian(temp);
     } else {
         System.out.println("Invalid mark entered");
         enterMarkForRussian();
     }
 }
 public double calcAvgMark() {
     double avg = ((double)getMarkForFrench() + (double)getMarkForEnglish() + (double)getMarkForRussian()/3);
     setAvgMark(avg);
     return avg;
 }
 public boolean isOtlichnik() {
     if(calcAvgMark() >= 9) {
         return true;
     } else return false;
 }
 public boolean isDvoechnik() {
     if (getMarkForFrench() == 2 || getMarkForEnglish() == 2 || getMarkForRussian() == 2) {
         return true;
     } else return false;
 }
 public void printStudent() {
     System.out.println();
     System.out.println("Student name: " + getName());
     System.out.println("French mark: " + getMarkForFrench());
     System.out.println("English mark: " + getMarkForEnglish());
     System.out.println("Russian mark: " + getMarkForRussian());
     System.out.println("Average mark: " + getAvgMark());
 }
}
