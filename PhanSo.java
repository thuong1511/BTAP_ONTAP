package pkg1;

import java.util.Scanner;

public class PhanSo {
    private int tu242;
    private int mau242;
    
    public PhanSo(){
        tu242 = 0;
        mau242 = 1;    
    }
    public PhanSo(int tu, int mau){          
        if(mau == 0) mau = 1;     // tránh chia 0
        this.tu242 = tu;
        this.mau242 = mau;
        this.toigianPS();         // tự động rút gọn ngay khi tạo
    }       
    
    public void Nhap(Scanner sc){
        int a242, b242;
        do {
            System.out.print("Nhap tu: ");
            a242 = sc.nextInt();
            
            System.out.print("Nhap mau: ");
            b242 = sc.nextInt();
            
            if( b242==0 ){
                System.out.println("Mau khong the bang 0, vui long nhap lai!");
            } else {
                tu242 = a242;
                mau242 = b242;
                this.toigianPS();
            }
        } while(b242==0);
    }

    public void hienthi(){
        if (mau242 == 1) {
            System.out.println("\t" + tu242);    // nếu mẫu = 1 thì in số nguyên
        } else {
            System.out.println("\t" + tu242 + "/" + mau242);
        }
    }

    public PhanSo congPS(PhanSo ps2){  
        int a242 = this.tu242 * ps2.mau242 + ps2.tu242 * this.mau242;
        int b242 = this.mau242 * ps2.mau242; 
        return new PhanSo(a242, b242);
    }
    public PhanSo truPS(PhanSo ps2){
        int a242 = this.tu242 * ps2.mau242 - ps2.tu242 * this.mau242;
        int b242 = this.mau242 * ps2.mau242; 
        return new PhanSo(a242, b242);
    }
    public PhanSo nhanPS(PhanSo ps2){
        int a242 = this.tu242 * ps2.tu242;
        int b242 = this.mau242 * ps2.mau242;
        return new PhanSo(a242, b242);
    }
    public PhanSo chiaPS(PhanSo ps2){
        int a242 = this.tu242 * ps2.mau242;
        int b242 = this.mau242 * ps2.tu242;
        return new PhanSo(a242, b242);
    }

    private int timUSCLN(int a242, int b242){
        a242 = Math.abs(a242);
        b242 = Math.abs(b242);
        while(b242 != 0){
            int r = a242 % b242;
            a242 = b242;
            b242 = r;
        }
        return a242;
    }

    public void toigianPS(){
        if(mau242 < 0){   // đưa dấu âm về tử
            tu242 = -tu242;
            mau242 = -mau242;
        }
        int uscln = timUSCLN(tu242, mau242);
        tu242 /= uscln;
        mau242 /= uscln;
    }
}
