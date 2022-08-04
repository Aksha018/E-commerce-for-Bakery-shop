package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.model.Payment;
import com.chainsys.bakeryshop.repository.PaymentRepository;

	@Service
	public class PaymentService {
		@Autowired
		PaymentRepository paymentRepository;
		
		public List<Payment> getPayment() {
			List<Payment> Paymentlist = paymentRepository.findAll();
			return Paymentlist;
		}
		public Payment save(Payment pay) {
			return paymentRepository.save(pay);
		}

		public  Payment findByPaymentId(long id) {
			return paymentRepository.findById(id);
		}
		public void deletePaymentById(long id) {
			paymentRepository.deleteById(id);
		}

}
