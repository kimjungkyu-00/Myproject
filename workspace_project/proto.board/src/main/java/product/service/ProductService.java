package product.service;

import java.util.List;

import product.dto.ProductVO;

public interface ProductService {
	List<ProductVO> listProduct();
	ProductVO detailProduct(int product_id);
	void updateProduct(ProductVO vo);
	void deleteProduct(int product_id);
	void insertProduct(ProductVO dto);
	String fileInfo(int product_id);
	
}
