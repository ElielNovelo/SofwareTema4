
package softwaret4;

import java.util.ArrayList;
/**
 *
 * @author Eliel Novelo
 */
public class ctrlMetodos { 
    public tblTrapecioParticular TrapecioP(double h, int a, int b)
    {
    ArrayList<csTrapecio> lista = null;
    tblTrapecioParticular tabla;
    
    lista = new ArrayList<csTrapecio> ();
    csTrapecio fila =  new csTrapecio();
    fila.setH(h);
    fila.setFa(fx(a));
    fila.setFb(fx(b));
    fila.setResultado(fila.getH() * (fila.getFa()+fila.getFb()));
    lista.add(fila);
    tabla = new tblTrapecioParticular(lista);
    return tabla;
    } 
    
    
    public tblTrapecioGeneral TrapecioG(int a, int b, int n)
    {
    ArrayList<csTrapecioG> lista = null;
    tblTrapecioGeneral tabla;
    double h = (b-a);
    lista = new ArrayList<csTrapecioG>();
    csTrapecioG fila =  new csTrapecioG();
    fila.setN(h/n);
    double hf = fila.getN();
    fila.setH((h/n)/2);
    fila.setFa(fx(a));
    fila.setFb(fx(b));
    fila.setSumatoria(Sumatoriaf(hf, a , n));
    fila.setResultado(fila.getH()*(fila.getFa()+ fila.getSumatoria() +fila.fb));
    lista.add(fila);
    tabla = new tblTrapecioGeneral(lista);
    return tabla;
    } 
    
    
    public tblSimpsonGeneral Simpson(int a, int b, int n)
    {
    ArrayList<csSimpson> lista = null;
    tblSimpsonGeneral tabla;
    double h = (b-a);
    lista = new ArrayList<csSimpson>();
    csSimpson fila =  new csSimpson();
    fila.setN(h/n);
    double hf = fila.getN();
    fila.setH((h/n));
    fila.setFa(fxSimpson(a));
    double fa = fila.getFa();
    fila.setFb(fxSimpson(b));
    double fb = fila.getFb();
    double prin = (hf/3) * (fa+fb);
    fila.setSumaimpar(Sumatorimpar(hf, a , n));
    double h4 = (hf*4)/3;
    fila.setSumaPar(Sumatoriapar(hf, a, n));
    double h2 = (hf*2)/3;
    fila.setResultado(prin+(fila.getSumaimpar() * h4) + (fila.getSumaPar() * h2));
    lista.add(fila);
    tabla = new tblSimpsonGeneral(lista);
    return tabla;
    } 
   
    
    double fxSimpson (double n){
        return 1 / (1 + (n*n));
    }
    
    int fx (int a){
        return 3*(a*a);
    }
    
     double Sumatoriapar (double h,int a, int n){
        double j, par = 0;
        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                j = (a + i * h);
                par += (1 /  (1 + (j*j)));
             }
        }
        return par;
    }
    
    double Sumatorimpar (double h,int a, int n){
        double j, impar = 0;
        for(int i = 1; i < n; i++){
            if(i % 2 != 0){
                j  = (a + i * h);
                impar += (1 / ( 1 + (j*j)));
             }
        }
        return impar;
    }
    
   
    
    double Sumatoriaf (double h,int a, int n){
        double j, sum = 0;
        for(int i = 1; i < n; i++){
            j  = (a + i * h);
            sum+= 3*(j*j);
        }
        return 2*sum;
    }
}
