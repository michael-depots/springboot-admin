package emp.novabeyond.product.domain.shopify;

/**
 * Shopify 产品属性选项
 *
 * @author charles
 */
public class ProductOption {

    private Integer id;

    private Long optionId;

    private Long productId;

    private String name;

    private String values;

    private Integer position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "ShopifyProductOption{" +
                "id=" + id +
                ", optionId=" + optionId +
                ", productId=" + productId +
                ", name='" + name + '\'' +
                ", values='" + values + '\'' +
                ", position=" + position +
                '}';
    }
}
