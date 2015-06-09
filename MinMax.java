import java.util.*;
public class MinMax{

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();//n amout of numbers
      int k = scan.nextInt();//groups of k
      ArrayList<Integer> aray = new ArrayList<Integer>();
      for(int i=0;i<n;i++){
      	aray.add(scan.nextInt());
      }
      Collections.sort(aray);
      ArrayList<Integer> araynums = new ArrayList<Integer>();
      int a =0;
        k--;
      for(int j=0;j<aray.size();j++){
	      araynums.add(aray.get(k)-aray.get(a));//getting the difference between min and max of each consequtive group
	      k++;
	      a++;
	      if(k>=aray.size()){
	      	k=0;
	      }
          if(a>=aray.size()){
              break;
          }
	  }
        Collections.sort(araynums);
        while(araynums.get(0)<0){//some numbers will be negative theyre invalid
            araynums.remove(0);
        }
        System.out.print(araynums.get(0));//smallest difference
    }
}