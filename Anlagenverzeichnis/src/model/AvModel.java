package model;

import data.AvBL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Rucki
 */
public class AvModel extends AbstractTableModel {

    private List<AvBL> liste;

    public AvModel() {
        liste = new LinkedList<>();
    }
    
    
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public int getColumnCount() {

        return AvEnum.values().length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AvBL a = this.liste.get(rowIndex);

        AvEnum enumIndex = AvEnum.values()[columnIndex];
        switch (enumIndex) {
            case BEZEICHNUNG:
                return a.getBezeichnung();
            case AK:
                return a.getAK();
            case INBETRIEBNAHME:
                return a.getInbetriebnahme();
            case ND:
                return a.getND();
//            case BISHND:
//                return a.getBish_ND();
//            case AFABISHER:
//                return a.getAfa_bisher();
//            case WERTVORAFA:
//                return a.getWert_vor_Afa();
//            case AFADJ:
//                return a.getAfA_d_J();
//            case BW:
//                return a.getBW_31_12();
            default:
                return "?";
        }
    }

    @Override
    public String getColumnName(int column) {
        return AvEnum.values()[column].getName();
    }

    public AvBL getRow(int index) {
        return this.liste.get(index);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    public void load(File f) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(fr = new FileReader(f));
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                AvBL a = new AvBL(line);
                liste.add(a);
            }
        } catch (FileNotFoundException e) {

        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

}
