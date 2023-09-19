
public class NhanVien extends CanBo {
    public String job;
    public NhanVien(String name, int age, String sex, String address, String job){
        super(name, age, sex, address);
        this.job = job;
    }
    public String dataNhanVien(){
        String data = this.name + "\n" + String.valueOf(this.age) + "\n" + this.sex + "\n" + this.address + "\n" + this.job;
        return data;
    }
    public String getName(){
        return this.name;
    }
}
