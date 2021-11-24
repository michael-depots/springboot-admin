package emp.novabeyond.product.service.shopify;

import emp.novabeyond.product.domain.shopify.Product;

import java.util.List;

/**
 * @author charles
 */
public interface IProductService {

    /**
     * 查询产品信息
     *
     * @param productId 产品ID
     * @return 产品信息
     */
    public Product selectProductById(Long productId);

    /**
     * 查询产品列表
     *
     * @return 参数产品集合
     */
    public List<Product> selectProductList(Product product);
}
