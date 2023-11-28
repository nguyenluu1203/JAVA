package Person;

import java.util.Scanner;

class  Student extends Person{
    private String id;
    private double score;
    private String email;

    //Constructor không tham số
    public Student(){
    }

    //Constructor đầy đủ tham số
    public Student(String name, String sex, String birth, String address, String id, double score, String email){
        super(name, sex, birth, address);
        this.id = id;
        this.score = score;
        this.email = email;
    }

    // Ghi đè phương thức nhập thông tin từ lớp Person
    @Override
    public void inputData(){
        super.inputData();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        id = input.nextLine();
        System.out.println("Nhập điểm thi: ");
        score = input.nextDouble();
        System.out.println("Nhập email: ");
        email = input.nextLine();
    }

    // Ghi đè phương thức in thông tin từ lớp Person
    @Override
    public void outputData(){
        super.outputData();
        System.out.println("Mã sinh viên: " + id);
        System.out.println("Điểm thi: "+ score);
        System.out.println("Email: "+ email);
    }

    //Kiểm tra có được học bổng không
    public boolean coHocbong(){
        return score > 8.0;
    }

}
