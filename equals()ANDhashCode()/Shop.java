public class Shop {
	
	public static void main(String[] args) {
		Product product1 = new Product("Milk",2.5);
		Product product2 = new Product("Milk",2.5);
		//product2.setName("Milka");
		System.out.println(product1==product2);
		System.out.println(product1.equals(product2));
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
	}
	
}