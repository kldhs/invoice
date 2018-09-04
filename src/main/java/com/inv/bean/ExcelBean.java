package com.inv.bean;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Root")
@XmlType(propOrder = {"mainTitle","secondTitle","sheetName","invoiceBean"})
public class ExcelBean {
    @XmlElement(name="MainTitle")
    private String mainTitle;
    @XmlElement(name="SecondTitle")
    private String secondTitle;
    @XmlElement(name="SheetName")
    private String sheetName;
    @XmlElementWrapper(name="ROWS")
    @XmlElement(name="LIST",required=true)
    private List<InvoiceBean> invoiceBean;

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getSecondTitle() {
        return secondTitle;
    }

    public void setSecondTitle(String secondTitle) {
        this.secondTitle = secondTitle;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public List<InvoiceBean> getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(List<InvoiceBean> invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
}
