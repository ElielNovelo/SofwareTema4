
package softwaret4;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eliel Novelo
 */
public class tblTrapecioParticular extends AbstractTableModel {
     private String[] columnas = {"h","f(a)","f(b)","Resultado"};
     private ArrayList<csTrapecio> lista =null;

    public tblTrapecioParticular(ArrayList<csTrapecio> resultados) {
        this.lista = resultados;
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
       csTrapecio fila = this.lista.get(i);
        switch(columnas){
            case 0:
                return fila.getH();
            case 1: 
                return fila.getFa();
            case 2:
                return fila.getFb();
            case 3:
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
