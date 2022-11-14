interface A{
	void m1();
}
class Hey{
	public static void main(String[] arhs){
		A a=new A(){
			public void m1(){
				System.out.println("annu inner class se aya");
			}	
		};
		a.m1();
		
		
	}
}