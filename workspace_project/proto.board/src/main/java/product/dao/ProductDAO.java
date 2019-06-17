package product.dao;

import java.util.List;

import product.dto.ProductVO;

public interface ProductDAO {
	List<ProductVO> listProduct();
	ProductVO detailProduct(int product_id);
	void updateProduct(ProductVO vo);
	void deleteProduct(int product_id);
	void insertProduct(ProductVO dto);
	String fileInfo(int product_id);
	
}
