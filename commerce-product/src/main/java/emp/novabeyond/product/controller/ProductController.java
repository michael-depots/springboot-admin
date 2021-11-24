package emp.novabeyond.product.controller;

import emp.novabeyond.common.core.controller.BaseController;
import emp.novabeyond.common.core.page.TableDataInfo;
import emp.novabeyond.product.domain.shopify.Product;
import emp.novabeyond.product.service.shopify.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 产品信息操作处理
 *
 * @author charles
 */
@RestController
@RequestMapping("/product/online")
public class ProductController extends BaseController {

    @Autowired
    private IProductService iProductService;

    /**
     * 获取产品列表
     *
     * @param product
     * @return
     */
    @PreAuthorize("@ss.hasPermi('product:online:index')")
    @GetMapping("/list")
    public TableDataInfo list(Product product) {
        startPage();
        List<Product> list = iProductService.selectProductList(product);

        return getDataTable(list);
    }
}
