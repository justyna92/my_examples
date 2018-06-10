public class Product {
	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	//nadpisanie equals z klasy Object, aby porównać zawartość, a nie tylko referencje (jak robi to ona bez przesłonięcia)
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Product other = (Product)obj;
		if(this.name==null){
			if(other.name!=null)
				return false;
		}else if(!name.equals(other.name))
			return false;
		if(Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null)?0:name.hashCode());
		long tmp;
		tmp = Double.doubleToLongBits(price);
		result = prime * result + (int)(tmp^(tmp>>>32));
		return result;
	}
	
	/* Pierwszym pytaniem jakie musimy sobie zadać, to gdzie właściwie metoda hashCode 
	jest wykorzystywana? Otóż przede wszystkim we wszystkich strukturach danych, 
	które opierają się na tablicach mieszających (hashtable), np. zbiorach (HashSet), 
	czy mapach (HashMap). W przypadku błędnej implementacji, czyli sytuacji, gdzie dla dwóch
	różnych obiektów otrzymalibyśmy tę samą wartość zwróconą przez metodę hashCode, 
	wymienione struktury danych nie będą działały poprawnie, np. w przypadku zbiorów nie będzie
	można dodać obiektu, bo zostanie on potraktowany jako duplikat.  */
}