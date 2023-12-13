
package address;

/**
 *
 * @author Trang
 */
public class DiaChi {
    private String Thon;
    private String Xa;
    private String Huyen;
    private String Tinh;

    public DiaChi() {
    }

    public DiaChi(String Thon, String Xa, String Huyen, String Tinh) {
        this.Thon = Thon;
        this.Xa = Xa;
        this.Huyen = Huyen;
        this.Tinh = Tinh;
    }

    public String getThon() {
        return Thon;
    }

    public void setThon(String Thon) {
        this.Thon = Thon;
    }

    public String getXa() {
        return Xa;
    }

    public void setXa(String Xa) {
        this.Xa = Xa;
    }

    public String getHuyen() {
        return Huyen;
    }

    public void setHuyen(String Huyen) {
        this.Huyen = Huyen;
    }

    public String getTinh() {
        return Tinh;
    }

    public void setTinh(String Tinh) {
        this.Tinh = Tinh;
    }

    @Override
    public String toString() {
        return "DiaChi{" + "Thon=" + Thon + ", Xa=" + Xa + ", Huyen=" + Huyen + ", Tinh=" + Tinh + '}';
    }
    
    
}
