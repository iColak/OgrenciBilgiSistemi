package classes;

public class MainOgrenciBilgiSistemi {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "500");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "1000");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100, 100, 78, 78, 50, 50);
        s1.isPass();
        Student s2 = new Student("Güdük", "124", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(30, 40, 50, 70, 40, 60);
        s2.isPass();


    }
}
