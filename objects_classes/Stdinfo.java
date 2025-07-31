package objects_classes;

import java.util.Scanner;

public class Stdinfo {
    int stdID;
    String stdName;
    int totalsessionsattend;
    int attendanceCredits;
    int performanceCredits;
    int totalCredits;
    int trainerRating;

    Scanner sc= new Scanner(System.in);

    public void StudentDetails() {
        System.out.print("Enter Student ID: ");
        stdID = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Student Name: ");
        stdName = sc.nextLine();
}
public void studentInfo() {
        System.out.println("====== STUDENT INFO======");
        System.out.println("Student ID: " + stdID);
        System.out.println("Student Name: " + stdName);
    }
 public int sessionsCredits() {
        System.out.print("Enter Total Sessions Attended: ");
        totalsessionsattend = sc.nextInt();
        if (totalsessionsattend >= 30) {
            return attendanceCredits = 5;
        } else if (totalsessionsattend >= 20) {
            return attendanceCredits = 3;
        } else {
            return attendanceCredits = 0;
        }
    }

    // 
    public int scoreCredits() {
        System.out.print("Enter Performance Score: ");
        int score = sc.nextInt();
        if (score >= 85) {
            return performanceCredits = 5;
        } else if (score >= 60) {
            return performanceCredits = 3;
        } else {
            return performanceCredits = 0;
        }
    }

    // calculating achievement status
    public void achievementStatus() {
        int attCredit = sessionsCredits();
        int perfCredit = scoreCredits();
        totalCredits = attCredit + perfCredit;

        System.out.println("Total Credits: " + totalCredits);
        if (totalCredits >= 10) {
            System.out.println("==GOLD==");
        } else if (totalCredits >= 8) {
            System.out.println("==SILVER==");
        } else {
            System.out.println("==NEED IMPROVEMENT==");
        }
    }

   
    public int trainerRatings() {
        System.out.print("Enter Trainer Rating (1-5): ");
        trainerRating = sc.nextInt();
        if (trainerRating == 5) {
            return 5000;
        } else {
            return 0;
        }
    }
}
