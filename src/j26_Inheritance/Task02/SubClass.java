package j26_Inheritance.Task02;

public class SubClass extends SuperClass{
    int num= 10;
    public void goster(){
        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");
    }

    public void my_method(){
        goster();
        super.goster();
        System.out.println("Sub classtaki eleman : " + this.num);
        System.out.println("süperClasstaki eleman  :" + super.num);

    }

}
