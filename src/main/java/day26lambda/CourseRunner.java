package day26lambda;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {

    Course courseTurkishDay = new Course("Summer","Turkish Day", 97,128);
    Course courseTurkishNight = new Course("Winter","Turkish Night", 98,154);
    Course courseEnglishhDay = new Course("Spring","English Day", 95,132);
    Course courseEnglishNight = new Course("Winter","English Night", 93,144);

    List<Course> coursesList = new ArrayList<>();   // Data type Course oldu çünkü classlar da data type'dır.
coursesList.add(courseTurkishDay);
coursesList.add(courseTurkishNight);
coursesList.add(courseEnglishhDay);
coursesList.add(courseEnglishNight);

        System.out.println(coursesList);
//[Course{season='Summer', courseName='Turkish Day', avarageScore=97, numberOfStudents=128},
// Course{season='Winter', courseName='Turkish Night', avarageScore=98, numberOfStudents=154},
// Course{season='Spring', courseName='English Day', avarageScore=95, numberOfStudents=132},
// Course{season='Winter', courseName='English Night', avarageScore=93, numberOfStudents=144}]

//1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz
        boolean result1 = coursesList.stream().allMatch(t->t.getAvarageScore()>91);
        System.out.println(result1);

// ==> allMatch() verilen şarta göre bir stream içerisindeki TÜM elemanların - objeler vs verilen şartı sağlaması durumunda true verir (boolean).
// 1 tanesi bile uymazsa false verir.

//2)Tum kurslardaki ögrenci sayilarinin larin 100 den buyuk olup olmadigini kontrol kodu yaziniz
boolean result2=  coursesList.stream().allMatch(t->t.getNumberOfStudents()>100);
        System.out.println(result2);


//3)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        boolean result3= coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(result3);

// ==> anyMatch() methodu, method parentezi içerisinde HERHANGİ bir elemanın - objeler vs verilen şartı sağlaması durumunda true verir (boolean).
// 1 tanesi bile uysa yeterlidir. && ve || gibi.

//4) sezon isimlerinden en az birinin "Summer" kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        boolean result4 =  coursesList.stream().anyMatch(t-> t.getSeason().contains("Summer"));
        System.out.println(result4);
// 5) Kurs dönemlier içinde "Fall" döneminin hiç bulunmadığını kontrol eden kodu yazınız.
        boolean result5= coursesList.stream().noneMatch(t->t.getSeason().contains("Fall"));
        System.out.println(result5);
// ==> noneMatch methodu method parentezi içerisinde HİÇ BİR bir elemanın - objeler vs verilen şartı sağlamaması durumunda true verir (boolean).

        boolean result6= coursesList.stream().noneMatch(t->t.getCourseName().contains("German"));
        System.out.println(result6);





    }
}
