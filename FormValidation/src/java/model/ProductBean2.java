package model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProductBean2 {
   private String pid,pname;
   private double price;
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
        return ("dispaly2");
    }
}
