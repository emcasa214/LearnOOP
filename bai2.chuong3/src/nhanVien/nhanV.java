
package nhanVien;

import address.DiaChi;

/**
 *
 * @author Trang
 */
public class nhanV {
    private String Name;
    private DiaChi dc;        
    private String Dob;
    private char genDer;

    public nhanV() {
    }

    public nhanV(String Name, DiaChi dc, String Dob, char genDer) {
        this.Name = Name;
        this.dc = dc;
        this.Dob = Dob;
        this.genDer = genDer;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public DiaChi getDc() {
        return dc;
    }

    public void setDc(DiaChi dc) {
        this.dc = dc;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public char getGenDer() {
        return genDer;
    }

    public void setGenDer(char genDer) {
        this.genDer = genDer;
    }

    @Override
    public String toString() {
        return "nhanV{" + "Name=" + Name + ", dc=" + dc + ", Dob=" + Dob + ", genDer=" + genDer + '}';
    }
    
    
}
