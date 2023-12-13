
package nhanVien;

import address.DiaChi;

/**
 *
 * @author Trang
 */
public class check {
    public static void main(String[] args) {
        nhanV nv = new nhanV();
        DiaChi dc = new DiaChi ("Loc Ha","Mai Lam","Dong Anh","Ha Noi");
        nv.setName("Trang Xinh");
        nv.setDc(dc);
        nv.setDob("21/04/2004");
        nv.setGenDer('F');
        
        System.out.println(nv.toString());
    }
}
