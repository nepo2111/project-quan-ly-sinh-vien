/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author Admin
 */
public class PhongHocRender extends BasicComboBoxRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value != null) {
            //Lấy đôi tượng khoa
            PhongHoc objPhongHoc = (PhongHoc) value;
            //Hiển thị lại nội dung
            setText(objPhongHoc.getTenPhong());
        }
        return this;
    }

}
