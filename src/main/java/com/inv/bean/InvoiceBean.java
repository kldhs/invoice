package com.inv.bean;

import javax.xml.bind.annotation.*;
import javafx.scene.control.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"id","getInvoiceDate","company","invoiceWord","invoiceNum","invoiceDate",
        "money","tax","totalTax","makeSure","makeSureTime","entryNum","paymentDetails","remarkF","remarkS","remarkT"})
public class InvoiceBean {


    @XmlElement(name="Id")
    private  String id;
    @XmlElement(name="GetInvoiceDate")
    private  String getInvoiceDate;
    @XmlElement(name="Company")
    private String  company;
    @XmlElement(name="InvoiceWord")
    private  String invoiceWord;
    @XmlElement(name="InvoiceNum")
    private  String invoiceNum;
    @XmlElement(name="InvoiceDate")
    private String  invoiceDate;
    @XmlElement(name="Money")
    private String  money;
    @XmlElement(name="Tax")
    private  String tax;
    @XmlElement(name="TotalTax")
    private String  totalTax;
    @XmlElement(name="MakeSure")
    private  String makeSure;
    @XmlElement(name="MakeSuerTime")
    private  String makeSureTime;
    @XmlElement(name="EntryNum")
    private  String entryNum;
    @XmlElement(name="paymentDetails")
    private String  paymentDetails;
    @XmlElement(name="RemarkF")
    private String  remarkF;
    @XmlElement(name="RemarkS")
    private  String remarkS;
    @XmlElement(name="RemarkT")
    private String remarkT;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGetInvoiceDate() {
        return getInvoiceDate;
    }

    public void setGetInvoiceDate(String getInvoiceDate) {
        this.getInvoiceDate = getInvoiceDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getInvoiceWord() {
        return invoiceWord;
    }

    public void setInvoiceWord(String invoiceWord) {
        this.invoiceWord = invoiceWord;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public String getMakeSure() {
        return makeSure;
    }

    public void setMakeSure(String makeSure) {
        this.makeSure = makeSure;
    }

    public String getMakeSureTime() {
        return makeSureTime;
    }

    public void setMakeSureTime(String makeSureTime) {
        this.makeSureTime = makeSureTime;
    }

    public String getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(String entryNum) {
        this.entryNum = entryNum;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public String getRemarkF() {
        return remarkF;
    }

    public void setRemarkF(String remarkF) {
        this.remarkF = remarkF;
    }

    public String getRemarkS() {
        return remarkS;
    }

    public void setRemarkS(String remarkS) {
        this.remarkS = remarkS;
    }

    public String getRemarkT() {
        return remarkT;
    }

    public void setRemarkT(String remarkT) {
        this.remarkT = remarkT;
    }
}
