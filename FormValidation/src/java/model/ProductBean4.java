package model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class ProductBean4 {
   private String pid,pname;
   private double price,sell;

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }
   private int qty;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
   //Action Controller
    public String doPurchase(){
        return ("display4");
    }
    double pp;
    public void validatePurchasePrice(FacesContext context, UIComponent
             componentToVablidate, Object value) throws ValidatorException{
        pp=((Double) value).doubleValue();
    }
    //Custom validation method
    public void validateSalePrice(FacesContext context,
             UIComponent componentToValidate, Object value) throws ValidatorException{
        double sp=((Double) value).doubleValue();
        System.out.println(sp +""+pp);
        if(sp<=pp){
            FacesMessage message=new FacesMessage("Sale Price must be higer"
                    + " than Purchase Price");
            
            throw new ValidatorException(message);
        }
    }
}
