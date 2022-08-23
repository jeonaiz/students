package kg.megacom.students.services.impl;

import kg.megacom.students.models.Payment;
import kg.megacom.students.repositories.PaymentRepo;
import kg.megacom.students.services.PaymentService;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService {
    public PaymentServiceImpl(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    private final PaymentRepo paymentRepo;

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepo.save(payment);
    }
}

