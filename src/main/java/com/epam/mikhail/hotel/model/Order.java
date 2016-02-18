package com.epam.mikhail.hotel.model;

import java.util.Date;
import java.util.UUID;

public class Order extends BaseEntity {

    private String customerFirstName;
    private String customerLastName;
    private String customerPhoneNumber;
    private String customerEmail;
    private int numberOfPersons;
    private RoomType roomType;
    private Date arrivalDate;
    private Date departureDate;
    private int price;
    private String paymentType;
    private User customer;

    public Order() {
    }

    public Order(UUID uuid) {
        super(uuid);
    }

    public String getCustomerName() {
        return customerFirstName;
    }

    public void setCustomerName(String customerName) {
        this.customerFirstName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", numberOfPersons=" + numberOfPersons +
                ", roomType=" + roomType +
                ", arrivalDate=" + arrivalDate +
                ", departureDate=" + departureDate +
                ", price=" + price +
                ", paymentType='" + paymentType + '\'' +
                ", customer=" + customer +
                '}';
    }
}
