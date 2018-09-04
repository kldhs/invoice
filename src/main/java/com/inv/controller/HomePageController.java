package com.inv.controller;

import com.inv.bean.DataBean;
import com.inv.bean.ExcelBean;
import com.inv.bean.InvoiceBean;
import com.inv.utils.JaxbUtil;
import com.sun.javafx.collections.ObservableListWrapper;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xs
 */
public class HomePageController {

    @FXML
    private TableColumn<DataBean, String> id;
    @FXML
    private TableColumn<DataBean, String> getInvoiceDate;
    @FXML
    private TableColumn<DataBean, String> company;
    @FXML
    private TableColumn<DataBean, String> invoiceWord;
    @FXML
    private TableColumn<DataBean, String> invoiceNum;
    @FXML
    private TableColumn<DataBean, String> invoiceDate;
    @FXML
    private TableColumn<DataBean, String> money;
    @FXML
    private TableColumn<DataBean, String> tax;
    @FXML
    private TableColumn<DataBean, String> totalTax;
    @FXML
    private TableColumn<DataBean, String> makeSure;
    @FXML
    private TableColumn<DataBean, String> makeSureTime;
    @FXML
    private TableColumn<DataBean, String> entryNum;
    @FXML
    private TableColumn<DataBean, String> paymentDetails;
    @FXML
    private TableColumn<DataBean, String> remarkF;
    @FXML
    private TableColumn<DataBean, String> remarkS;
    @FXML
    private TableColumn<DataBean, String> remarkT;
    @FXML
    private TableColumn<DataBean, java.awt.Button> edit;
    @FXML
    private TableColumn<DataBean, CheckBox> select;
    //tableView
    @FXML
    private TableView<InvoiceBean> dataTable;

    String pathname = "C:\\Users\\xs\\Desktop\\versions.txt";

    public void init(){
        List<DataBean> dataBeans=getDataBeansFromXml();
        showTable(dataBeans);
    }

    @FXML
    private void add() {
        addAbDic().showAndWait();
    }

    private Dialog<Pair<String, String>> addAbDic() {
        Dialog<Pair<String, String>> dialog = new Dialog<>();
        dialog.setResizable(false);
        dialog.setTitle("新增进票明细");
        ButtonType addButtonType = new ButtonType("新增", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(addButtonType, ButtonType.CANCEL);
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 100, 10, 10));
        DatePicker getInvoiceDateAdd = new DatePicker();
        TextField companyAdd  = new TextField();
        TextField invoiceWordAdd  = new TextField();
        TextField invoiceNumAdd  = new TextField();
        DatePicker invoiceDateAdd  = new DatePicker();
        TextField moneyAdd  = new TextField();
        TextField taxAdd  = new TextField();
        TextField totalTaxAdd  = new TextField();
        TextField makeSureAdd  = new TextField();
        DatePicker makeSureTimeAdd  = new DatePicker();
        TextField entryNumAdd  = new TextField();
        TextField paymentDetailsAdd  = new TextField();
        TextField remarkFAdd  = new TextField();
        TextField remarkSAdd  = new TextField();
        TextField remarkTAdd  = new TextField();
        grid.add(new Label("收票日期："), 0, 0);
        grid.add(getInvoiceDateAdd , 1, 0);
        grid.add(new Label("开票单位:"), 2, 0);
        grid.add(companyAdd , 3, 0);
        grid.add(new Label("发票代码："), 0, 1);
        grid.add(invoiceWordAdd , 1, 1);
        grid.add(new Label("发票号码:"), 2, 1);
        grid.add(invoiceNumAdd , 3, 1);
        grid.add(new Label("开票日期："), 0, 2);
        grid.add(invoiceDateAdd , 1, 2);
        grid.add(new Label("金额:"), 2, 2);
        grid.add(moneyAdd , 3, 2);
        grid.add(new Label("税额："), 0, 3);
        grid.add(taxAdd , 1, 3);
        grid.add(new Label("价税合计:"), 2, 3);
        grid.add(totalTaxAdd , 3, 3);
        grid.add(new Label("签收确认："), 0, 4);
        grid.add(makeSureAdd , 1, 4);
        grid.add(new Label("确认时间:"), 2, 4);
        grid.add(makeSureTimeAdd , 3, 4);
        grid.add(new Label("挂单账号："), 0, 5);
        grid.add(entryNumAdd , 1, 5);
        grid.add(new Label("付款详情:"), 2, 5);
        grid.add(paymentDetailsAdd , 3, 5);
        grid.add(new Label("备注1："), 0, 6);
        grid.add(remarkFAdd , 1, 6);
        grid.add(new Label("备注2:"), 2, 6);
        grid.add(remarkSAdd , 3, 6);
        grid.add(new Label("备注3:"), 0, 7);
        grid.add(remarkTAdd , 1, 7);
        dialog.getDialogPane().setContent(grid);
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == addButtonType) {
                InvoiceBean invoiceBean = new InvoiceBean();
                ExcelBean excelBean = new ExcelBean();

                List<InvoiceBean> invoiceBeans = JaxbUtil.getJavaBeanFromXmlFile(pathname,ExcelBean.class).getInvoiceBean();

                invoiceBean.setId("1");
                invoiceBean.setGetInvoiceDate(getInvoiceDateAdd.getValue().toString());
                invoiceBean.setCompany(companyAdd.getText());
                invoiceBean.setInvoiceWord(invoiceWordAdd.getText());
                invoiceBean.setInvoiceNum(invoiceNumAdd.getText());
                invoiceBean.setInvoiceDate(invoiceDateAdd.getValue().toString());
                invoiceBean.setMoney(moneyAdd.getText());
                invoiceBean.setTax(taxAdd.getText());
                invoiceBean.setTotalTax(totalTaxAdd.getText());
                invoiceBean.setMakeSure(makeSureAdd.getText());
                invoiceBean.setMakeSureTime(makeSureTimeAdd.getValue().toString());
                invoiceBean.setEntryNum(entryNumAdd.getText());
                invoiceBean.setPaymentDetails(paymentDetailsAdd.getText());
                invoiceBean.setRemarkF(remarkFAdd.getText());
                invoiceBean.setRemarkS(remarkSAdd.getText());
                invoiceBean.setRemarkT(remarkTAdd.getText());
                excelBean.setMainTitle("1");
                invoiceBeans.add(invoiceBean);
                excelBean.setInvoiceBean(invoiceBeans);
                excelBean.setSecondTitle("2");
                excelBean.setSheetName("3");
                JaxbUtil.getXmlFileFromJavaBean(excelBean,pathname);

            }
            return null;
        });
        return dialog;
    }

    private List getDataBeansFromXml(){
        List<InvoiceBean> invoiceBeans = JaxbUtil.getJavaBeanFromXmlFile(pathname,ExcelBean.class).getInvoiceBean();
        List<DataBean> dataBeans = new ArrayList<>();
        for (int i = 0; i <invoiceBeans.size() ; i++) {
            InvoiceBean invoiceBean = invoiceBeans.get(i);
            DataBean dataBean = new DataBean();
            Button editButton = new Button("编辑");
            editButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("111111");
                }
            });
            CheckBox checkbox = new CheckBox();
            checkbox.setId(invoiceBean.getId());
            dataBean.setSlect(checkbox);
            dataBean.setId(invoiceBean.getId());
            dataBean.setGetInvoiceDate(invoiceBean.getGetInvoiceDate());
            dataBean.setCompany(invoiceBean.getCompany());
            dataBean.setInvoiceWord(invoiceBean.getInvoiceWord());
            dataBean.setInvoiceNum(invoiceBean.getInvoiceNum());
            dataBean.setInvoiceDate(invoiceBean.getInvoiceDate());
            dataBean.setMoney(invoiceBean.getMoney());
            dataBean.setTax(invoiceBean.getTax());
            dataBean.setTotalTax(invoiceBean.getTotalTax());
            dataBean.setMakeSure(invoiceBean.getMakeSure());
            dataBean.setMakeSureTime(invoiceBean.getMakeSureTime());
            dataBean.setEntryNum(invoiceBean.getEntryNum());
            dataBean.setPaymentDetails(invoiceBean.getPaymentDetails());
            dataBean.setRemarkF(invoiceBean.getRemarkF());
            dataBean.setRemarkS(invoiceBean.getRemarkS());
            dataBean.setRemarkT(invoiceBean.getRemarkT());
            dataBean.setEdit(editButton);
            dataBeans.add(dataBean);
        }
        return  dataBeans;
    }

    public void  showTable(List list){
        select.setCellValueFactory(new PropertyValueFactory<>("select"));
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        getInvoiceDate.setCellValueFactory(new PropertyValueFactory<>("getInvoiceDate"));
        company.setCellValueFactory(new PropertyValueFactory<>("company"));
        invoiceWord.setCellValueFactory(new PropertyValueFactory<>("invoiceWord"));
        invoiceNum.setCellValueFactory(new PropertyValueFactory<>("invoiceNum"));
        invoiceDate.setCellValueFactory(new PropertyValueFactory<>("invoiceDate"));
        money.setCellValueFactory(new PropertyValueFactory<>("money"));
        money.setCellValueFactory(new PropertyValueFactory<>("tax"));
        totalTax.setCellValueFactory(new PropertyValueFactory<>("totalTax"));
        makeSure.setCellValueFactory(new PropertyValueFactory<>("makeSure"));
        makeSureTime.setCellValueFactory(new PropertyValueFactory<>("makeSureTime"));
        entryNum.setCellValueFactory(new PropertyValueFactory<>("entryNum"));
        paymentDetails.setCellValueFactory(new PropertyValueFactory<>("paymentDetails"));
        remarkF.setCellValueFactory(new PropertyValueFactory<>("remarkF"));
        remarkS.setCellValueFactory(new PropertyValueFactory<>("remarkS"));
        remarkT.setCellValueFactory(new PropertyValueFactory<>("remarkT"));
        edit.setCellValueFactory(new PropertyValueFactory<>("edit"));
        dataTable.getItems().clear();
        dataTable.getItems().addAll(new ObservableListWrapper<>(list));
    }


}
