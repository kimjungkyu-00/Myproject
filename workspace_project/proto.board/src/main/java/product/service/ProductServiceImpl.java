package product.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import product.dao.ProductDAO;
import product.dto.ProductVO;

@Service //service bean으로 등록
public class ProductServiceImpl implements ProductService {
	
	@Inject
	ProductDAO productDao; //dao 객체 주입
	
	@Override
	public List<ProductVO> listProduct() {
		return productDao.listProduct();
	}

	@Override
	public ProductVO detailProduct(int product_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(ProductVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(int product_id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertProduct(ProductVO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public String fileInfo(int product_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
