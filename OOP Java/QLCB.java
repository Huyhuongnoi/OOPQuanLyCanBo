import java.util.ArrayList;
import java.util.Scanner;
public class QLCB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrData = new ArrayList<String>();
        ArrayList<String> arrName = new ArrayList<String>();
        boolean flag = true;
        while(flag){
            System.out.println("Chon mot trong cac chuc nang sau");
            System.out.println("1: Them Moi Can Bo.\n2: Tim Kiem Theo Ten.\n3: Tim Kiem Theo Ki Tu Cua Ten.\n4: Hien Thi Thong Tin Ve Danh Sach Cac Can Bo. \n5: Thoat");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    addData(arrData, arrName);
                    break;
                case 2:
                    findData(arrData);
                    break;
                case 3:
                    findChar(arrName, arrData);
                    break;
                case 4:
                    printData(arrData);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Vui Long Chon Lai!: ");
            }
        }
    }
    public static void addData(ArrayList<String> arr, ArrayList<String> arrName){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Ban muon them can bo nao?\n1. Ky su\n2. Cong nhan\n3. Nhan vien");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                System.out.println("Ban dang them ky su: ");
                System.out.print("Nhap nganh dao tao: ");
                String trainingIndustry = scanner.nextLine();
                KySu kySu = new KySu(name, age, sex, address, trainingIndustry);
                arr.add(kySu.dataKySu());
                arrName.add(kySu.getName());
                break;
            case 2:
                System.out.println("Ban dang them cong nhan: ");
                System.out.print("Nhap cap bac 1-10: ");
                int rank = scanner.nextInt();
                CongNhan congNhan = new CongNhan(name, age, sex, address, rank);
                arr.add(congNhan.dataCongNhan());
                arrName.add(congNhan.getName());
                break;
            case 3:
                System.out.println("Ban dang them nhan vien: ");
                System.out.print("Nhap cong viec: ");
                String job = scanner.nextLine();
                NhanVien nhanVien = new NhanVien(name, age, sex, address, job);
                arr.add(nhanVien.dataNhanVien());
                arrName.add(nhanVien.getName());
                break;
            default:
                System.out.println("Loi!");
                break;
        }
    }
    public static void findData(ArrayList<String> arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten ban muon tim kiem: ");
        String name = scanner.nextLine();
        boolean flag = false;
        for(String val : arr){
            int index = val.indexOf(name);
            if(index != -1){
                System.out.println(val);
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Khong tim thay!");
        }
    }
    public static void findChar(ArrayList<String> arrName, ArrayList<String> arr){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ky tu ten muon tim kiem: ");
        String charName = scanner.next();
        int count = -1;
        for(String val : arrName){
            int index = val.indexOf(charName);
            count += 1;
            if(index != -1){
                System.out.println(arr.get(count));
            }
        }
    }
    public static void printData(ArrayList<String> arr){
        for(String val : arr){
            System.out.println(val);
        }
    }
}
