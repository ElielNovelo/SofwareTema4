
package softwaret4;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eliel Novelo
 */
public class tblSimpsonGeneral extends AbstractTableModel {
     private String[] columnas = {"H","F(a)","F(b)","Sumatoria Impar", "Sumatoria par" ,"Resultado"};
     private ArrayList<csSimpson> lista =null;

    public tblSimpsonGeneral(ArrayList<csSimpson> Resultado) {
        this.lista = Resultado;
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
       csSimpson fila = this.lista.get(i);
        switch(columnas){
            case 0:
                return fila.getH();
            case 1: 
                return fila.getFa();
            case 2:
                return fila.getFb();
            case 3:
                return fila.getSumaimpar();
            case 4:
                return fila.getSumaPar();
            case 5:
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
