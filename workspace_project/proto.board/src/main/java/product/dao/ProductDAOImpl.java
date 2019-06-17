package product.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import product.dto.ProductVO;

@Repository //dao bean으로 선언
public class ProductDAOImpl implements ProductDAO {
	
	@Inject // SqlSession 객체가 주입됨
	SqlSession sqlSession;
	
	@Override
	public List<ProductVO> listProduct() {
		
		return sqlSession.selectList(
				"product.list_product");
		
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
