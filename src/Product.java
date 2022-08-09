class Product implements Comparable<Product>,Cloneable {
	private String name;
	private int price;
	private String maker;
	

	Object copy(){			//복제 메소드는 항상 인터페이스 Cloneable 의 자식 클래스
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("이 객체는 복제를 지원하지 않습니다.");
		}
		return obj;
	}
		
	public Product(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return String.format("Product [name=%s, price=%s, maker=%s]", name, price, maker);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	@Override
	public int compareTo(Product obj) {		//항상 Comparable인터페이스의 자식 클래스
		// TODO Auto-generated method stub
		return this.name.compareTo(obj.name); // 앞에 객체 - 뒤의 객체 : 오름차순 내부적인 시스템으로 인해 obj가 j , this가 i로 생각하면 됌
												// 뒤의 객체 - 앞의 객체 : 내림차순
	}
}
