public class KySu extends CanBo {
    public String trainingIndustry;
    public KySu(String name, int age, String sex, String address, String trainingIndustry){
        super(name, age, sex, address);
        this.trainingIndustry = trainingIndustry;
    }
    public String dataKySu(){
        String data = this.name + "\n" + String.valueOf(this.age) + "\n" + this.sex + "\n" + this.address + "\n" + this.trainingIndustry;
        return data;
    }
    public String getName(){
        return this.name;
    }
}
