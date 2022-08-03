package com.chainsys.bakeryshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainsys.bakeryshop.model.Payment;
import com.chainsys.bakeryshop.repository.PaymentRepository;

	@Service
	public class PaymentService {
		@Autowired 
		PaymentRepository PaymentRepository;
		
		public List<Payment> getOrder() {
			List<Payment> Paymentlist = PaymentRepository.findAll();
			return Paymentlist;
		}
		public Payment save(Payment pay) {
			return PaymentRepository.save(pay);
		}

		public Payment findByCategoryId(long id) {
			return PaymentRepository.findById(id);
		}
		public void deleteOrderById(long id) {
			PaymentRepository.deleteById(id);
		}

}
