package model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class ProductBean {

    private String pid, pname, price, qty;
    private double num_price;
    private int num_qty;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
        try {
            num_price=Double.parseDouble(price);
        } catch (Exception e) {
        }
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
        try {
            num_qty=Integer.parseInt(qty);
        } catch (Exception e) {
        }
    }

    public double getNum_price() {
        return num_price;
    }
    public int getNum_qty() {
        return num_qty;
    }
    
    public String doPurchase(){
        FacesContext context=FacesContext.getCurrentInstance();
        if(getPid().equals("")){
            context.addMessage(null, new FacesMessage("Product id is required!"));
        }
        if(getPname().equals("")){
            context.addMessage(null, new FacesMessage("Product Name is required!"));
        }
        if(getNum_price()<=0.10){
            context.addMessage(null, new FacesMessage("Purchase amount must be at least 0.10"));
        }
        if(getNum_qty()<=0){
            context.addMessage(null,new FacesMessage("Product quantity must greater than 0!"));
        }
        if(context.getMessageList().size()>0){
            return (null);
        }else{
            return ("display");
        }
    }
}
