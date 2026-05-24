package com.codingshuttle.jainath.module1Introduction.impl;

import com.codingshuttle.jainath.module1Introduction.NotificationService;

public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS sending..." + message);
    }
}
