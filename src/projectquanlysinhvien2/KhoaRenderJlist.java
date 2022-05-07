/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectquanlysinhvien2;

import java.awt.BufferCapabilities;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;



/**
 *
 * @author Admin
 */
public class KhoaRenderJlist extends JLabel implements ListCellRenderer<Object>{

    public KhoaRenderJlist() {
        setOpaque(true);
    }
    
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Object> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value != null){
            //Lấy đôi tượng khoa
            ChuyenKhoa objKhoa = (ChuyenKhoa)value;
            //Hiển thị lại nội dung
            setText(objKhoa.getTenKhoa());
            Color background;
            Color foreground;
         JList.DropLocation dropLocation = list.getDropLocation();
         if (isSelected) {
             background = Color.ORANGE;
             foreground = Color.BLACK;

         // unselected, and not the DnD drop location
         } else {
             background = Color.WHITE;
             foreground = Color.BLACK;
         };

         setBackground(background);
         setForeground(foreground);

    }
        return this;
    }
}

    
    
    

