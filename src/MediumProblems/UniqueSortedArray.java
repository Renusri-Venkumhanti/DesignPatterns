package MediumProblems;

import java.util.Arrays;

public class UniqueSortedArray {

	public static void main(String[] args) {

		int[] arr= {2,3,8,5,3,8,2,5,8,2};
		int[] unique= new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				continue;
			}
				unique[count]=arr[i];count++;
			
		}
		unique[count]=arr[arr.length-1];
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<=count;i++)
		System.out.print(unique[i]+" ");
		
	}

}
