import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> set = new HashSet<>();           
            int n = in.nextInt();
            int m = in.nextInt();
            int max = 0;

            for (int i = 0; i < n; i++) {               
                int num = in.nextInt();
                deque.addLast(num);
                set.add(num);
                if(deque.size() == m){                                      
                    if(set.size() > max){
                        max = set.size();
                    }
                    if(max == m){
                        break;
                    }
                    int first = deque.pollFirst();
                    if(!deque.contains(first)){
                        set.remove(first);
                    }
                }
            }
            //System.out.println(deque);
            System.out.println(max);
        }
    }
