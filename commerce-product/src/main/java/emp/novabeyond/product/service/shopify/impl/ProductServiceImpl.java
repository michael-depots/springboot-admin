package emp.novabeyond.product.service.shopify.impl;

import emp.novabeyond.product.domain.shopify.Product;
import emp.novabeyond.product.mapper.shopify.ProductMapper;
import emp.novabeyond.product.service.shopify.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author charles
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product selectProductById(Long productId) {
        return null;
    }

    @Override
    public List<Product> selectProductList(Product product) {
        return productMapper.selectSfProductList(product);
    }
}
