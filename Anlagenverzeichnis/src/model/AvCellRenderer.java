/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import data.AvBL;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class AvCellRenderer  implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        label.setOpaque(true);
        AvModel model = (AvModel) table.getModel();
        AvBL a = model.getRow(row);
        AvEnum enumIndex = AvEnum.values()[column];
       
        switch (enumIndex) {
            case BEZEICHNUNG:
                label.setText(a.getBezeichnung());
                break;
            case AK:
                label.setText(Double.parseDouble(a.getAK()));
                break;
            case ND:
                label.setText(Double.parseDouble(a.getND()));
                break;
            case BISHND:
                label.setText(Double.parseDouble(a.getBish_ND()));
                break;
            case AFABISHER:
                label.setText(Double.parseDouble(a.getAfa_bisher()));
                break;
            case ND:
                label.setText(Double.parseDouble(a.getND()));
                break;
             case ND:
                label.setText(Double.parseDouble(a.getND()));
                break;
           
        }

        return label;

    }
}

