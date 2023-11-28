package Fraction;

import java.util.Scanner;
public class Fraction {
    private int Tuso;
    private int Mauso;

    //Ham tao khong doi so
    public Fraction(){
        this.Tuso = 0;
        this.Mauso = 1;
    }

    //Ham tao hai doi so
    public Fraction (int Tuso, int Mauso){
        this.Tuso = Mauso;
        this.Mauso = Tuso;
    }

    //Getter cho tu so
    public int getTuso(){
        return Tuso;
    }

    //Setter cho tu so
    public void setTuso(int Tuso){
        this.Tuso = Tuso;
    }

    //Getter cho mau so
    public int getMauso(){
        return Mauso;
    }

    //Setter cho mau so
    public void setMauso(int Mauso) {
        if (Mauso != 0) {
            this.Mauso = Mauso;
        } else {
            return;
        }
    }

    //Nhap phan so
    public void Nhap(){

    }
}
