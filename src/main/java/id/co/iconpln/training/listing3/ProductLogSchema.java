package id.co.iconpln.training.listing3;


import java.io.Serializable;

/**
 * @author krissadewo
 * @date 12/21/20 1:25 PM
 */
public class ProductLogSchema implements Serializable {

    private String transactionCategory;

    private String productName;

    private int qty;

    public ProductLogSchema() {
    }

    public ProductLogSchema(String transactionCategory, String productName, int qty) {
        this.transactionCategory = transactionCategory;
        this.productName = productName;
        this.qty = qty;
    }

    public String getTransactionCategory() {
        return transactionCategory;
    }

    public void setTransactionCategory(String transactionCategory) {
        this.transactionCategory = transactionCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "LogSchema{" +
                "transactionCategory='" + transactionCategory + '\'' +
                ", productName='" + productName + '\'' +
                ", qty=" + qty +
                '}';
    }
}
