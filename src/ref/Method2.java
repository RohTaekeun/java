package ref;


public class Method2 {
    public static void main(String[] args) {
        Student student1 = creatStudent("aaa", 15, 80);
        Student student2 = creatStudent("bb", 18, 78);
       /* student1.name = "학생1";
        student1.age = 16;
        student1.grade = 50;*/

       /* Student student2 = new Student();
        initStudent(student2, "학생2",19,88);*/
     /*   student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;*/

      /*  System.out.println("이름" + student1.name + "나이 "+student1.age + "성적"+student1.grade);
        System.out.println("이름" + student2.name + "나이 "+student2.age + "성적"+student2.grade);
*/
        printStudent(student1);
        printStudent(student2);



    }
    /*객체를 생성하는 메서드*/
    static Student creatStudent(String name,int age,int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;

    }
    /*전달한 학생 개체의 필드값을 설정*/
    static void initStudent(Student student, String name,int age,int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;

    }

    /*전달한 학생 객체의 필드 값을 읽어서 출력한다*/
    static void printStudent(Student student){
        System.out.println("이름" + student.name + "나이 "+student.age + "성적"+student.grade);
    }
}
