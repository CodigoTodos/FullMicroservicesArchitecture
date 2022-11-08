package com.brunoalves.PaymentService.service;

import com.brunoalves.PaymentService.model.PaymentRequest;
import com.brunoalves.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
