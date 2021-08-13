/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class Delivery_Company {
    private String companyID, companyName, address, manager, contactNo;
    private Byte logo; 
    private int status;

    public Delivery_Company() {
    }

    public Delivery_Company(String companyID, String companyName, String address, String manager, String contactNo, Byte logo, int status) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.address = address;
        this.manager = manager;
        this.contactNo = contactNo;
        this.logo = logo;
        this.status = status;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Byte getLogo() {
        return logo;
    }

    public void setLogo(Byte logo) {
        this.logo = logo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
