package Person;

import java.util.Scanner;

public abstract class Person {
    protected String name;
    protected String sex;
    protected String birth;
    protected String address;

    //Contructor khong tham so
    public Person(){
    }

    //Contructor day du tham so
    public Person(String name, String sex, String birth, String address) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
    }

    //Getter va Setter
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Nhập thông tin
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tên: ");
        name = input.nextLine();
        System.out.println("Nhap giới tính: ");
        sex = input.nextLine();
        System.out.println("Nhap ngày sinh: ");
        birth = input.nextLine();
        System.out.println("Nhap địa chỉ: ");
        address = input.nextLine();
    }

    //In thông tin
    public void outputData() {
        System.out.println("Tên: " + name);
        System.out.println("Giới tính: " + sex);
        System.out.println("Ngày sinh: " + birth);
        System.out.println("Địa chỉ: " + address);
    }
}
