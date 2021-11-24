package emp.novabeyond.product.domain.shopify;

/**
 * Shopify 产品属性信息
 *
 * @author charles
 */
public class ProductVariant {

    private Integer id;

    private Long productId;

    private Long variantId;

    private String title;

    private Float price;
    
    private String sku;

    private String option1;

    private String option2;

    private String option3;

    private Integer position;

    private Float compareAtPrice;

    private Long imageId;

    private Integer inventoryQuantity;

    private Integer stockQty;

    private Integer salesQty;

    private Integer stockpileQty;

    private Integer stockpileInboundQty;

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

    public Long getVariantId() {
        return variantId;
    }

    public void setVariantId(Long variantId) {
        this.variantId = variantId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Float getCompareAtPrice() {
        return compareAtPrice;
    }

    public void setCompareAtPrice(Float compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public Integer getStockQty() {
        return stockQty;
    }

    public void setStockQty(Integer stockQty) {
        this.stockQty = stockQty;
    }

    public Integer getSalesQty() {
        return salesQty;
    }

    public void setSalesQty(Integer salesQty) {
        this.salesQty = salesQty;
    }

    public Integer getStockpileQty() {
        return stockpileQty;
    }

    public void setStockpileQty(Integer stockpileQty) {
        this.stockpileQty = stockpileQty;
    }

    public Integer getStockpileInboundQty() {
        return stockpileInboundQty;
    }

    public void setStockpileInboundQty(Integer stockpileInboundQty) {
        this.stockpileInboundQty = stockpileInboundQty;
    }

    @Override
    public String toString() {
        return "ShopifyProductVariant{" +
                "id=" + id +
                ", productId=" + productId +
                ", variantId=" + variantId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", sku='" + sku + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", position=" + position +
                ", compareAtPrice=" + compareAtPrice +
                ", imageId=" + imageId +
                ", inventoryQuantity=" + inventoryQuantity +
                ", stockQty=" + stockQty +
                ", salesQty=" + salesQty +
                ", stockpileQty=" + stockpileQty +
                ", stockpileInboundQty=" + stockpileInboundQty +
                '}';
    }
}
