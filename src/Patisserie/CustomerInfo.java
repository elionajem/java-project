/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patisserie;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Elio-PC
 */
@Entity
@Table(name = "customer_info", catalog = "pattiserie", schema = "")
@NamedQueries({
    @NamedQuery(name = "CustomerInfo.findAll", query = "SELECT c FROM CustomerInfo c"),
    @NamedQuery(name = "CustomerInfo.findByIdcustomerInfo", query = "SELECT c FROM CustomerInfo c WHERE c.idcustomerInfo = :idcustomerInfo"),
    @NamedQuery(name = "CustomerInfo.findByCustomerName", query = "SELECT c FROM CustomerInfo c WHERE c.customerName = :customerName"),
    @NamedQuery(name = "CustomerInfo.findByCustomerAdress", query = "SELECT c FROM CustomerInfo c WHERE c.customerAdress = :customerAdress"),
    @NamedQuery(name = "CustomerInfo.findByCustomerTel", query = "SELECT c FROM CustomerInfo c WHERE c.customerTel = :customerTel"),
    @NamedQuery(name = "CustomerInfo.findByDate", query = "SELECT c FROM CustomerInfo c WHERE c.date = :date"),
    @NamedQuery(name = "CustomerInfo.findByDateOfOrder", query = "SELECT c FROM CustomerInfo c WHERE c.dateOfOrder = :dateOfOrder"),
    @NamedQuery(name = "CustomerInfo.findByProduct", query = "SELECT c FROM CustomerInfo c WHERE c.product = :product"),
    @NamedQuery(name = "CustomerInfo.findByPrice", query = "SELECT c FROM CustomerInfo c WHERE c.price = :price")})
public class CustomerInfo implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcustomer_info")
    private Integer idcustomerInfo;
    @Basic(optional = false)
    @Column(name = "customer_name")
    private String customerName;
    @Basic(optional = false)
    @Column(name = "customer_adress")
    private String customerAdress;
    @Basic(optional = false)
    @Column(name = "customer_tel")
    private String customerTel;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @Column(name = "date_of_order")
    @Temporal(TemporalType.DATE)
    private Date dateOfOrder;
    @Basic(optional = false)
    @Column(name = "product")
    private String product;
    @Basic(optional = false)
    @Column(name = "price")
    private String price;

    public CustomerInfo() {
    }

    public CustomerInfo(Integer idcustomerInfo) {
        this.idcustomerInfo = idcustomerInfo;
    }

    public CustomerInfo(Integer idcustomerInfo, String customerName, String customerAdress, String customerTel, Date date, Date dateOfOrder, String product, String price) {
        this.idcustomerInfo = idcustomerInfo;
        this.customerName = customerName;
        this.customerAdress = customerAdress;
        this.customerTel = customerTel;
        this.date = date;
        this.dateOfOrder = dateOfOrder;
        this.product = product;
        this.price = price;
    }

    public Integer getIdcustomerInfo() {
        return idcustomerInfo;
    }

    public void setIdcustomerInfo(Integer idcustomerInfo) {
        Integer oldIdcustomerInfo = this.idcustomerInfo;
        this.idcustomerInfo = idcustomerInfo;
        changeSupport.firePropertyChange("idcustomerInfo", oldIdcustomerInfo, idcustomerInfo);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        String oldCustomerName = this.customerName;
        this.customerName = customerName;
        changeSupport.firePropertyChange("customerName", oldCustomerName, customerName);
    }

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        String oldCustomerAdress = this.customerAdress;
        this.customerAdress = customerAdress;
        changeSupport.firePropertyChange("customerAdress", oldCustomerAdress, customerAdress);
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        String oldCustomerTel = this.customerTel;
        this.customerTel = customerTel;
        changeSupport.firePropertyChange("customerTel", oldCustomerTel, customerTel);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        Date oldDateOfOrder = this.dateOfOrder;
        this.dateOfOrder = dateOfOrder;
        changeSupport.firePropertyChange("dateOfOrder", oldDateOfOrder, dateOfOrder);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        String oldProduct = this.product;
        this.product = product;
        changeSupport.firePropertyChange("product", oldProduct, product);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        String oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcustomerInfo != null ? idcustomerInfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerInfo)) {
            return false;
        }
        CustomerInfo other = (CustomerInfo) object;
        if ((this.idcustomerInfo == null && other.idcustomerInfo != null) || (this.idcustomerInfo != null && !this.idcustomerInfo.equals(other.idcustomerInfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patisserie.CustomerInfo[ idcustomerInfo=" + idcustomerInfo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
