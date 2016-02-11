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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        if (!super.equals(o)) return false;

        Order order = (Order) o;

        if (numberOfPersons != order.numberOfPersons) return false;
        if (price != order.price) return false;
        if (customerFirstName != null ? !customerFirstName.equals(order.customerFirstName) : order.customerFirstName != null) return false;
        if (customerLastName != null ? !customerLastName.equals(order.customerLastName) : order.customerLastName != null)
            return false;
        if (customerPhoneNumber != null ? !customerPhoneNumber.equals(order.customerPhoneNumber) : order.customerPhoneNumber != null)
            return false;
        if (customerEmail != null ? !customerEmail.equals(order.customerEmail) : order.customerEmail != null)
            return false;
        if (roomType != null ? !roomType.equals(order.roomType) : order.roomType != null) return false;
        if (arrivalDate != null ? !arrivalDate.equals(order.arrivalDate) : order.arrivalDate != null) return false;
        if (departureDate != null ? !departureDate.equals(order.departureDate) : order.departureDate != null)
            return false;
        if (paymentType != null ? !paymentType.equals(order.paymentType) : order.paymentType != null) return false;
        return customer != null ? customer.equals(order.customer) : order.customer == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (customerFirstName != null ? customerFirstName.hashCode() : 0);
        result = 31 * result + (customerLastName != null ? customerLastName.hashCode() : 0);
        result = 31 * result + (customerPhoneNumber != null ? customerPhoneNumber.hashCode() : 0);
        result = 31 * result + (customerEmail != null ? customerEmail.hashCode() : 0);
        result = 31 * result + numberOfPersons;
        result = 31 * result + (roomType != null ? roomType.hashCode() : 0);
        result = 31 * result + (arrivalDate != null ? arrivalDate.hashCode() : 0);
        result = 31 * result + (departureDate != null ? departureDate.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        return result;
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
