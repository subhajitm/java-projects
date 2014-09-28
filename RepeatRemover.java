import java.util.*;

class RepeatRemover{
    public Vector<Integer> remover(int[] input) {
        Integer mask = 0;
        Vector<Integer> output = new Vector<Integer>();
        int j = 0;
        for(int i=0; i<input.length; i++) {
            Integer t = 1;
            t = t << input[i];
            if((mask & t) != 0) {
                continue;
            } else {
                output.add(input[i]);
                mask = mask | t;
            }
        }
        return output;
    }

    public static void main(String[] args) {
    //    int[] a = new int[] {4,5,6,7,8,4,5,6,255,105,255,4200,10200,4200,10200, 65538, 65538};
        int[] a = new int[]{10000,10000,10000,10000,10000};
        RepeatRemover rr = new RepeatRemover();
        Vector<Integer> op = rr.remover(a);
        System.out.println("Trimmed array is "+op);
    }
}
