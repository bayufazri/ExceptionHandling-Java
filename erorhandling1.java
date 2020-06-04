/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
public class erorhandling1 {
    
    public static void main(String [] args){
        int n=0;
        try{
            System.out.println("Masukan :");
            n = System.in.read();
            System.out.println("Hasil : " +(char)n);
    }
    catch(Throwable e){
        System.err.println(e);
}
}
}
