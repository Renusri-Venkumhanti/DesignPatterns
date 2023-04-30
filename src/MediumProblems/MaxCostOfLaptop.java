package MediumProblems;

import java.util.ArrayList;
import java.util.List;

public class MaxCostOfLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> cost = new ArrayList<>();
		cost.add(0);cost.add(3);cost.add(2);cost.add(3);cost.add(4);
		List<String> labels = new ArrayList<>();
		labels.add("legal");labels.add("legal");labels.add("illegal");labels.add("legal");labels.add("legal");
		System.out.println(maxCost(cost,labels,1));
		
	}
	 public static int maxCost(List<Integer> cost, List<String> labels, int dailyCount) {
		    // Write your code here
		    int maxCost = 0;
		    int c_count = cost.size();
		    int counting = 0;
		    int comp = 0;
		    for (int i = 0; i < c_count; i++) {
		        if (labels.get(i)== "legal") {
		            counting++;
		            comp += cost.get(i);
		        } else
		            comp += cost.get(i);
		        if (counting == dailyCount) {
		            counting = 0;
		            if (comp > maxCost)
		                maxCost = comp;
		            comp = 0;
		        }
		    }
		    return maxCost;
		    }

}
