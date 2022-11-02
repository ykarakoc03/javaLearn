package j25_Encapsulation.Task03;

/*
 Bmı classfields -> name, age, weight,height: encapsulated
getBMI() method -> bmi=weight/(height*height) returb type olmalı
 getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
 runner class obj ile dataları print eden code create ediniz
  */
public class BMI {
    String name;
    int age;
    double weight;
    double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {

        double bmi=weight/(height*height);
        return bmi;
    }
   public String getStatus(double bmi){
       String sonuc= bmi < 18.5 ? "zayif": bmi<25 ? "normal" : bmi<30 ?"kilolu": "obez";
       return sonuc;
   }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height ;
    }
}
class Runner{
    public static void main(String[] args) {
        BMI obj1 = new BMI("yakup",37,72,1.72);
        System.out.println(obj1);
        System.out.println("Bmi sonucunuz :" +obj1.getStatus(obj1.getBMI()));
    }
}