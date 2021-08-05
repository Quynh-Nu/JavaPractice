public class BT7 {
    public static void main(String[] args) {
        int Toan = 10;
        int heSoToan = 5;
        int Ly = 7;
        int heSoLy = 3;
        int Hoa = 8;
        int heSoHoa = 2;
        double heSoTong = heSoHoa + heSoLy + heSoToan;
        double diemTB = (Toan * heSoToan + Ly * heSoLy + Hoa * heSoHoa)/heSoTong;
        System.out.println("diemTB = " + diemTB);
    }
}
