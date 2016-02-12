package com.epam.mikhail.hotel;


import com.epam.mikhail.hotel.model.User;
import com.epam.mikhail.hotel.model.factory.UserFactory;

public class Runner {


    public static void main(String[] args) {

        User user = UserFactory.createUser();
        System.out.println(user);
    }

}
