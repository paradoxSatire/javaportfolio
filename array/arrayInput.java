import java.util.*;

class arrayInput {
    public static void main(String[] args) {
        array();
    }
    public static void array(){
        List<Integer> a = new ArrayList<Integer>();
        a.add(-1);
        for(int l = 0; a.get(l) != 0; l = l){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number: ");
            a.add(scan.nextInt());
            l++;
            if ((a.get(l) == (a.get(l-1) + 1)) && (a.get(l) != 0)){
                System.out.println(a.get(l-1));
            }
        }
    }
}