package firstclass;

import java.util.Scanner;

/*
*
* 属性：
*       速度、体积、颜色
*
* 方法：
*       移动、设置速度、加速、减速
*
* */
public class Vehicle {

     int speed;
     int size;

    public static void main(String[] args) {

        Vehicle Benchi = new Vehicle();


        Benchi.Speed_Car();
        Benchi.setSpeed(-300);

    }

    public void Speed_Car(){

        this.speed=10;
        System.out.println("当前初始速度为:"+speed);

    }

    public void Speed_Size(){

        this.size=100;
        System.out.println("当前Size为："+this.size);

    }

    public  void setSpeed(int speed){

        System.out.println("速度已设定...");

        if(speed < 0){

            this.speed+=speed;
            speed_down();
            System.out.println("当前速度为："+this.speed);

        }else if(speed > 0){

            this.speed+=speed;
            speed_up();
            System.out.println("当前速度为："+this.speed);

        }else if(speed == 0){

            System.out.println("不加速！！");
            System.out.println("当前速度为："+this.speed);

        }

    }

    public static void speed_up() {

        System.out.println("车辆前进！");



    }

    public static void speed_down() {

        System.out.println("车辆后退！");

    }
}
