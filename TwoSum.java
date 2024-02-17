import java.util.HashSet;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		int[]a= {15, 3, 4, 5, 9, 1, 7};
		int ts=8;
		Set<Integer>hs = new HashSet();
		for(int i=0;i<a.length;i++) {
			if(hs.contains(ts-a[i])) {
				System.out.println(a[i]+"-"+(ts-a[i]));
			}else {
				hs.add(a[i]);
			}
		}
	}

}
