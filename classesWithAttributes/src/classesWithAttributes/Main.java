package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("asdfg");
		product.setId(1);
		product.setDescription("asddad");
		product.setPrice(25000);
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
