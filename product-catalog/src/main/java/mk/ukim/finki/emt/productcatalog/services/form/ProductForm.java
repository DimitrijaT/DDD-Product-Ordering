package mk.ukim.finki.emt.productcatalog.services.form;

import lombok.Data;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

@Data
public class ProductForm {
    public String productName;
    private Money price;
    private int sales;
}
