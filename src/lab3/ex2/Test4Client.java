package lab3.ex2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab3/ex2/beans-config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		// 在下面加入程式碼
		List<Product> list = productDao.getProducts();
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
