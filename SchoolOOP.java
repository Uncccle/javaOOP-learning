package firstclass;

public class SchoolOOP {


    public static void main(String[] args) {

        Student XUESHENG = new Student();
        XUESHENG.ShowPersonInfo_St();

        aTeacher LAOSHI = new aTeacher();
        LAOSHI.ShowPersonInfo_Tea();
    }
}
class aTeacher{
    String Tea_name;
    int Tea_age;
    int Tea_classNum;
    String Tea_hobby;

    void ShowPersonInfo_Tea(){
        System.out.println("显示教员个人信息");
    }
}


class Student {

    String St_name;
    int St_age;
    int St_classNum;
    String St_hobby;

    void ShowPersonInfo_St() {
        System.out.println("显示学员个人信息");
    }
}
