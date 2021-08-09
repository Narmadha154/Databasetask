package dbtask;
public class CustomerInfo {
    private static int cusId;
    private String name;
    private String mobile;
    private int age;

    public static int getCusId() {
        return cusId;
    }
    public void setCusId(int cusId) {
        this.cusId = cusId;
    }
    public String getName() {
        return name;
    }
    public void  setName(String name) {
        this.name = name;

    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return cusId+" "+name+" "+mobile+" "+age;
    }
}

