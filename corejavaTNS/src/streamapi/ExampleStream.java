package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStream {
	public static void main(String[] args) {
		List<Product> productlist =  new ArrayList<Product>();
		productlist.add(new Product(1,"hp",25000f));
		productlist.add(new Product(2,"SAM",35000f));
		productlist.add(new Product(3,"APPLE",45000f));
		productlist.add(new Product(4,"ASUS",55000f));
		productlist.add(new Product(5,"dell",30000f));
		
		List<Float> pl= productlist.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(pl);
		
		
		
	}

}
