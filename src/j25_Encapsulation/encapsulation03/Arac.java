package j25_Encapsulation.encapsulation03;

public class Arac {
    /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
  olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- ArabaMain isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
     */
    private String model;
    private String renk;
    private int motor;
    private int yil;
    public Arac() {
    }
    public Arac(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        setMotor(motor);// motor datasini 1001 den kucuk olmasini koruduk
        setYil(yil);
    }
    public void setMotor(int motor) {
        if (motor<=1000){
            System.out.println("1000 cc  ve altinda olamaz 1001 olarak default arama yapildi");
            this.motor =1001;
        }else this.motor = motor;
    }
    public int getYil() {
        return yil;
    }
    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
            System.out.println("milattan once araba vardida biz mi binemedik");
        }else this.yil = yil;

    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                        ", renk='" + renk + '\'' +
                        ", motor=" + motor +
                        ", yil=" + yil ;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }


}
