package javaExam.problem7;

import java.util.Scanner;

class ClassScore {
    private String className;
    private int tugScore;
    private int relayScore;

    ClassScore(String className, int tugScore, int relayScore) {
        this.className = className;
        this.tugScore = tugScore;
        this.relayScore = relayScore;
    }

    int getTotalScore() {
        return tugScore + relayScore;
    }

    String getClassName() {
        return className;
    }

    void showInfo() {
        System.out.println(className + ": " + getTotalScore() + "점");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"1반", "2반", "3반"};
        ClassScore[] classes = new ClassScore[3];

        for (int i = 0; i < classes.length; i++) {
            int tug = input.nextInt();
            int relay = input.nextInt();

            classes[i] = new ClassScore(names[i], tug, relay);
        }

        System.out.println("==체육대회 결과==");

        for (int i = 0; i < classes.length; i++) {
            classes[i].showInfo();
        }

        int maxIndex = 0;

        for (int i = 1; i < classes.length; i++) {
            if (classes[i].getTotalScore() > classes[maxIndex].getTotalScore()) {
                maxIndex = i;
            }
        }

        System.out.println("우승 반: " + classes[maxIndex].getClassName() + " (" + classes[maxIndex].getTotalScore() + "점)");
    }
}
