package firstclass;

/*
* 构造方法：
*   创建对象的时候默认会调用构造方法来创建对象，(在堆中开辟空间)可以完成成员变量的某些初始化操作
*
*   构造方法的语法：
*       方法名称：构造方法的方法名称必须跟类的名称保持一致
*       访问修饰符： ...
*       形参： 可以用户自定义添加，跟方法的普通参数一样
*       方法体： 完成对象的初始化功能
*       返回值: 没有返回值
*
*   注意：
*       1.创建完类之后，如果没有手动调用构造方法，会有一个默认的无参的构造方法供调用
*       2.当用户自定义了构造方法之后，默认的无参构造方法就不能够使用了，必须要手动定义无参构造方法
*       3.同一个类中可以包含多个同名的构造方法
*
*
*   重载： 在一个类中可以包含多个重名的方法，但是注意方法的参数列表不能相同
*       三个方面的不同：
*           参数的个数不同
*           参数的类型不同
*           参数的顺序不同
*
*       注意：
*           一般构造方法都会进行重载(一个类中可以包含多个属性值，当只需要给部分属性初始化的时候需要调用不同的构造方法 )
*
* */

public class Teacher {

    String name;
    int age;
    String sex;

    public  Teacher(){

    }

    public Teacher(String xname, int xage, String xsex){

        name = xname;
        age = xage;
        sex = xsex;



    }

   public Teacher(String xname){

       System.out.println("One Argument");
       name = xname;

   }

   //构造方法
   public Teacher(String xname, int xage){

       System.out.println("Two Argument");
       System.out.println("new......");
       name = xname;
       age = xage;
   }

    public void teach(String a, int b){

        System.out.println("上课");

    }

    public void teach(int a, String b){

        System.out.println("上课");

    }

    public static void main(String[] args) {

        Teacher teach = new Teacher();
        teach.name="ZHOU";
        teach.age=22;
        System.out.println(teach.age);
        System.out.println(teach.name);
        Teacher teacher2 = new Teacher( "YONG", 18);
        System.out.println(teacher2.name);
        System.out.println(teacher2.age);
        Teacher t3 = new Teacher("WANG");
        System.out.println(t3.name);

        Teacher x = new Teacher("hh", 11, "s");
        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.sex);



    }

}
