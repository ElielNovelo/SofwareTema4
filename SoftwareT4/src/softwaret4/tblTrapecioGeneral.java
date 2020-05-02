/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaret4;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eliel Novelo
 */
public class tblTrapecioGeneral extends AbstractTableModel {
    private String[] columnas = {"H","F(a)","F(b)","Sumatoria","Resultado"};
     private ArrayList<csTrapecioG> lista =null;

    public tblTrapecioGeneral(ArrayList<csTrapecioG> Resultaoo) {
        this.lista = Resultaoo;
    }

    @Override
    public int getRowCount() {
        return this.lista.size();  
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int i, int columnas) {
       csTrapecioG fila = this.lista.get(i);
        switch(columnas){
            case 0:
                return fila.getH();
            case 1: 
                return fila.getFa();
            case 2:
                return fila.getFb();
            case 3:
                return fila.getSumatoria();
            case 4:
                return fila.getResultado();
        }
        return null;
    }
   
        @Override
    public boolean isCellEditable(int i, int i1) {
        return true;
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
    
}
