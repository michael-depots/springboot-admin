package emp.novabeyond.product.domain.shopify;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Shopify 产品信息
 *
 * @author charles
 */
public class Product implements Serializable {

    private Integer id;

    private Long productId;

    private String title;

    private String sku;

    private String productType;

    private String vendor;

    private String handle;

    private String status;

    private String src;

    private Float price;

    private Float compareAtPrice;

    private Integer virtualInventory;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date publishedAt;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date updatedAt;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getCompareAtPrice() {
        return compareAtPrice;
    }

    public void setCompareAtPrice(Float compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
    }

    public Integer getVirtualInventory() {
        return virtualInventory;
    }

    public void setVirtualInventory(Integer virtualInventory) {
        this.virtualInventory = virtualInventory;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ShopifyProduct{" +
                "id=" + id +
                ", productId=" + productId +
                ", title='" + title + '\'' +
                ", sku='" + sku + '\'' +
                ", productType='" + productType + '\'' +
                ", vendor='" + vendor + '\'' +
                ", handle='" + handle + '\'' +
                ", status='" + status + '\'' +
                ", src='" + src + '\'' +
                ", price=" + price +
                ", compareAtPrice=" + compareAtPrice +
                ", virtualInventory=" + virtualInventory +
                ", publishedAt=" + publishedAt +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
