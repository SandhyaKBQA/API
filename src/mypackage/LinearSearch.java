package mypackage;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {10,20,90,80,70,50};
		int find=50;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find) {
				flag=true;		
			}
			else {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("Value present");	
		}
		else {
			System.out.println("Value not present");
		}
		

	}

}
