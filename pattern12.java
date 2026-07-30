
public class pattern12 {
 public static void main(String[] args) {
    
    for(int i=1;i<=5;i++){
        char start=(char)('A'+5-i);
        for(char ch=start;ch<='E';ch++){
            System.out.print(ch);
        }
        System.out.println();
    }
 }
    
}