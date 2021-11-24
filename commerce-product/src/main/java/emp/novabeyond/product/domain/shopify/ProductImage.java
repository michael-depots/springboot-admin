package emp.novabeyond.product.domain.shopify;

/**
 * Shopify 产品图片
 *
 * @author charles
 */
public class ProductImage {

    private Integer id;

    private Long productId;

    private Long imageId;

    private Integer position;

    private String src;

    private Integer width;

    private Integer height;

    private String alt;

    private String variantIds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getVariantIds() {
        return variantIds;
    }

    public void setVariantIds(String variantIds) {
        this.variantIds = variantIds;
    }

    @Override
    public String toString() {
        return "ShopifyProductImage{" +
                "id=" + id +
                ", productId=" + productId +
                ", imageId=" + imageId +
                ", position=" + position +
                ", src='" + src + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", alt='" + alt + '\'' +
                ", variantIds='" + variantIds + '\'' +
                '}';
    }
}
