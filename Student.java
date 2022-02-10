package classes;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.name = name;
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int sozluNotu1, int note2, int sozluNotu2, int note3, int sozluNotu3) {

        double sozluOran1 = 0.40;
        double sozluOran2 = 0.30;
        double sozluOran3 = 0.20;

        if (note1 <= 100 && note1 >= 0) {
            this.c1.note = (note1 * (1 - sozluOran1)) + (sozluNotu1 * sozluOran1);
        }
        if (note2 <= 100 && note2 >= 0) {
            this.c2.note = (note2 * (1 - sozluOran2)) + (sozluNotu2 * sozluOran2);
        }
        if (note3 <= 100 && note3 >= 0) {
            this.c3.note = (note3 * (1 - sozluOran3)) + (sozluNotu3 * sozluOran3);
        }
    }

    void isPass() {
        System.out.println("====================================================");
        this.avarage = (c1.note + c2.note + c3.note) / 3;
        if (this.avarage >= 55) {
            System.out.println("Hababam sınıfı uyanıyor!");
            this.isPass = true;
        } else {
            System.out.println("Hababam sınıfı sınıfta kaldı!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " notu\t\t:" + this.c1.note);
        System.out.println(this.c2.name + " notu\t\t:" + this.c2.note);
        System.out.println(this.c3.name + " notu\t:" + this.c3.note);
        System.out.println("Ortalama\t\t:" + this.avarage);
    }
}
