package com.zomatocrum.service;

import java.util.List;

import com.zomatocrum.enities.Billing;

public interface BillingService {

	public void createBill(Billing bill);

	public List<Billing> listAllBills();
}
