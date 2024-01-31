package class1;

public class ClassStrat1 {
    public static void main(String[] args) {
        String students[] = {"홍길동","지석진","학생3"};

        int studedntsAge[] = {19, 15,15};

        int studentsScore[] = {100, 80,50};


        for(int i =0; i<students.length;i++){
           /* for (int j = 0; j < students.length; j++) {

            }*/
            System.out.println(students[i]+"의 나이는 "+studedntsAge[i]+"이며 성적은 " + studentsScore[i]+"입니다");
        }

    }
}
