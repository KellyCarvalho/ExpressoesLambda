package entities;

public class Produto {
private String name;
private double price;
public Produto() {
	
	
}


public Produto(String name, double price) {
	
	this.name = name;
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
public static boolean staticProdutoPredicate(Produto p) {
	return p.getPrice()>=100.00;
}

@Override
public String toString() {
	return "Produto [name=" + name + ", price=" + price + "]";
}


}
