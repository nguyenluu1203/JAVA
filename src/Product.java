public class Product {
    private String maSP;
    private String tenSP;
    private double giaTien;
    private int soLuong;
    private String donVi;

    // Constructor
    public Product(String maSP, String tenSP, double giaTien, int soLuong, String donVi) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.donVi = donVi;
    }

    // Phương thức tăng số lượng
    public void tangSoLuong(int soLuongTang) {
        this.soLuong += soLuongTang;
    }

    // Phương thức giảm số lượng
    public void giamSoLuong(int soLuongGiam) {
        if (this.soLuong >= soLuongGiam) {
            this.soLuong -= soLuongGiam;
        } else {
            System.out.println("Số lượng giảm lớn hơn số lượng hiện có.");
        }
    }

    // Phương thức thay đổi giá tiền
    public void thayDoiGiaTien(double giaTienMoi) {
        this.giaTien = giaTienMoi;
    }

    // Phương thức kiểm tra hàng
    public String kiemTraHang() {
        return (this.soLuong > 0) ? "Còn hàng" : "Hết hàng";
    }

    // Phương thức in thông tin sản phẩm
    public void inThongTinSanPham() {
        System.out.println("Mã sản phẩm: " + this.maSP);
        System.out.println("Tên sản phẩm: " + this.tenSP);
        System.out.println("Giá tiền: " + this.giaTien);
        System.out.println("Số lượng: " + this.soLuong);
        System.out.println("Đơn vị: " + this.donVi);
        System.out.println("Tình trạng hàng: " + this.kiemTraHang());
        System.out.println();
    }

    public static void main(String[] args) {
        // Tạo 3 sản phẩm
        Product sanPham1 = new Product("SP001", "Sản phẩm 1", 100000, 0, "Cái");
        Product sanPham2 = new Product("SP002", "Sản phẩm 2", 150000, 35, "Chiếc");
        Product sanPham3 = new Product("SP003", "Sản phẩm 3", 200000, 10, "Hộp");

        // In thông tin sản phẩm
        System.out.println("Thông tin sản phẩm 1:");
        sanPham1.inThongTinSanPham();

        System.out.println("Thông tin sản phẩm 2:");
        sanPham2.inThongTinSanPham();

        System.out.println("Thông tin sản phẩm 3:");
        sanPham3.inThongTinSanPham();
    }
}
