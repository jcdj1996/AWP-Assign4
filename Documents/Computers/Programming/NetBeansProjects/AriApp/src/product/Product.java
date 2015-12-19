package product;

import java.util.HashMap;
import javax.swing.JComboBox;
import util.Validation;
import util.DB;

/**
 * Manages products
 */
public class Product {

    Validation v = new Validation();
    
    DB db = new DB();

    // database queries
    public static final String Q_PROD_ID_NAME = "SELECT prodID, proName FROM java_product",
            Q_ONE_PROD = "SELECT * FROM java_product WHERE prodID = :id",
            PROD_ID_NAMES_NAME = "Product names";

    // holds details                // names component
    private String prodID,
            prodName,
            colour,
            weight,
            manuName,
            phone,
            email;

    private boolean quantity,
            tax,
            shipping;

    private int salesRepID;

    public static final String PRODNAME_NAME = "Product Name",
            COLOUR_NAME = "Colour",
            WEIGHT_NAME = "Weight",
            MANUNAME_NAME = "Manufacturer Name",
            MANUPHONE_NAME = "Phone Number",
            MANUEMAIL_NAME = "Email",
            SALESREP_NAME = "Sales Rep",
            QUANTITY_NAME = "Quantity",
            TAX_NAME = "Tax",
            SHIPPING_NAME = "Shipping";

    // set what validation to perform on each input
    public static final String[] v_Common = new String[]{"nonBlank"};
    public static final HashMap<String, String[]> validations = new HashMap<String, String[]>() {
        {
            put("COMMON", new String[]{"nonBlank"});
            put(PRODNAME_NAME, new String[]{"char", "space", "num"});
            put(COLOUR_NAME, new String[]{"char"});
            put(WEIGHT_NAME, new String[]{"decimal"});
            put(MANUNAME_NAME, new String[]{"char", "space", "num"});
            put(MANUPHONE_NAME, new String[]{"num"});
            put(MANUEMAIL_NAME, new String[]{"email"});
            put(SALESREP_NAME, new String[]{"char"});
            put(QUANTITY_NAME, new String[]{"num"});
        }
    };

    public Product() {
    }

    public Product(String prodID, String prodName,
            String colour, String weight,
            String manuName, String phone,
            String email, boolean quantity,
            boolean tax, boolean shipping) {
        this.prodID = prodID;
        setProdName(prodName);
        setProdColour(colour);
        setProdWeight(weight);
        setProdManuName(manuName);
        setProdPhone(phone);
        setProdEmail(email);
        setProdQuantity(quantity);
        setProdTax(tax);
        setProdShipping(shipping);
    }
    //METHODS  
    //SET 
    private void setProdName(String prodName) {
        this.prodName = prodName;
    }

    private void setProdColour(String colour) {
        this.colour = colour;
    }

    private void setProdWeight(String weight) {
        this.weight = weight;
    }

    private void setProdManuName(String manuName) {
        this.manuName = manuName;
    }

    private void setProdPhone(String phone) {
        this.phone = phone;
    }

    private void setProdEmail(String email) {
        this.email = email;
    }

    private void setProdQuantity(boolean quantity) {
        this.quantity = quantity;
    }

    private void setProdTax(boolean tax) {
        this.tax = tax;
    }

    private void setProdShipping(boolean shipping) {
        this.shipping = shipping;
    }
//----------------------------------------------------------------------------//
    //GET 
    //name

    public String getProdName() {
        return prodName;
    }

    //colour
    public String getProdColour() {
        return colour;
    }

    //weight
    public String getProdWeight() {
        return weight;
    }

    //manufacturer name
    public String getProdManuName() {
        return manuName;
    }

    //phone
    public String getProdPhone() {
        return phone;
    }

    //email
    public String getProdEmail() {
        return email;
    }

    //quantity
    public boolean getProdQuantity() {
        return quantity;
    }

    //tax
    public boolean getProdTax() {
        return tax;
    }

    //shipping
    public boolean getProdShipping() {
        return shipping;
    }

//----------------------------------------------------------------------------//
    
    public static JComboBox getProductList()
    {
        DB localDB = new DB();

        // return empty if result set cannot be loaded
        if (!localDB.loadResultSet(Q_PROD_ID_NAME)) {
            return new JComboBox();
        } else {
            return new JComboBox();
        }
    }
}
