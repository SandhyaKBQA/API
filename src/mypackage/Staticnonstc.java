package mypackage;

 class Staticnonstc {
	static int a;
	static void count(){
		
		a++;
	}
	
	public static void main(String[] args) {
		Staticnonstc s1=new Staticnonstc();
		Staticnonstc s2=new Staticnonstc();
		System.out.println(s1.a);
		System.out.println(s2.a);
	}

}
 

