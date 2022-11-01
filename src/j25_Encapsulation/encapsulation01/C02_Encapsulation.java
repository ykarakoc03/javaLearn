package j25_Encapsulation.encapsulation01;

public class C02_Encapsulation {

    private String name = "Gamze Hanim";
    private int id=1001;


    public C02_Encapsulation() {

    }

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public String isimVer() {//getter
    //    return name;
    //}
//
    //public int idVer() {//getter
    //    return id;
    //}
    //public void isimDegis(String isim){//setter
    //    this.name=isim;
    //}
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", id=" + id;
    }
}
