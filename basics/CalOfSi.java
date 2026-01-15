// Calculation of simple interest

package basics;

public class CalOfSi {
    public static void main(String[] args){
        float p, r, si;
        int n;
        p = 10000.50f;
        n = 3;
        r = 15.5f;
        si = p * n * r / 100;
        System.out.println(si);
    }
}
