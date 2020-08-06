import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int nop = scan.nextInt();
        BitSet bit1 = new BitSet(len);
        BitSet bit2 = new BitSet(len);
        BitSet[] bitset = new BitSet[3];
        bitset[1] = bit1;
        bitset[2] = bit2;

        for(int i=0; i<nop; i++){           
            String oper = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            switch(oper){
            case "AND":           
                bitset[x].and(bitset[y]);
                System.out.printf("%d %d \n",
                     bitset[1].cardinality(), bitset[2].cardinality());
                break;
            case "OR":           
                bitset[x].or(bitset[y]);
                System.out.printf("%d %d \n",
                     bitset[1].cardinality(), bitset[2].cardinality());
                break;
            case "XOR":           
                bitset[x].xor(bitset[y]);
                System.out.printf("%d %d \n",
                     bitset[1].cardinality(), bitset[2].cardinality());
                break;
            case "SET":           
                bitset[x].set(y);
                System.out.printf("%d %d \n",
                    bitset[1].cardinality(), bitset[2].cardinality());
                break;
            case "FLIP":           
                bitset[x].flip(y);
                System.out.printf("%d %d \n",
                    bitset[1].cardinality(), bitset[2].cardinality());
                break;    
            }
        }
    }
}
