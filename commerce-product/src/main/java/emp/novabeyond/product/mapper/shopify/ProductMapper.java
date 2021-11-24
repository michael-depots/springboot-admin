package emp.novabeyond.product.mapper.shopify;

import emp.novabeyond.product.domain.shopify.Product;

import java.util.List;

/**
 * @author charles
 */
public interface ProductMapper {

    /**
     * 查询 shopify 产品集合
     *
     * @return
     */
    public List<Product> selectSfProductList(Product product);
}
