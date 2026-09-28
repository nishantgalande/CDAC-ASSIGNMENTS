package com.nishant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Transaction {
	private int txId;
	private LocalDate txDate;
	private float txAmount;
	private Boolean txStatus;
	private Boolean txArrears;

	Transaction(int txId, float txAmount, Boolean txStatus, Boolean txArrears) {
		this.txId = txId;
		this.txDate = LocalDate.now();
		this.txAmount = txAmount;
		this.txStatus = txStatus;
		this.txArrears = txArrears;
	}

	@Override
	public String toString() {
		return "Transaction [txId=" + txId + ", txDate=" + txDate + ", txAmount=" + txAmount + ", txStatus=" + txStatus
				+ ", txArrears=" + txArrears + "]";
	}

	public int getTxId() {
		return txId;
	}

	public LocalDate getTxDate() {
		return txDate;
	}

	public float getTxAmount() {
		return txAmount;
	}

	public Boolean getTxStatus() {
		return txStatus;
	}

	public Boolean getTxArrears() {
		return txArrears;
	}

}

public class TransactionInfo {
	public static void main(String[] args) {
		List<Transaction> list = new ArrayList<Transaction>();

		list.add(new Transaction(1, 5749, true, false));
		list.add(new Transaction(2, 477, true, true));
		list.add(new Transaction(3, 623, true, false));
		list.add(new Transaction(4, 351, true, false));
		list.add(new Transaction(5, 34227, true, true));
		list.add(new Transaction(6, 997, true, false));
		list.add(new Transaction(7, 5632, true, true));
		list.add(new Transaction(8, 6782, true, false));
		list.add(new Transaction(9, 5993, false, false));
		list.add(new Transaction(10, 672, false, false));

		System.out.println("**************************************************************");
		for (int i = 0; i < list.size(); i++) {
			boolean status = TransactionInfo.amountGreater(list.get(i).getTxAmount());
			if (status) {
				System.out.println(list.get(i).toString());
			}
		}

		System.out.println("**************************************************************");
		for (int i = 0; i < list.size(); i++) {
			boolean status = TransactionInfo.txFalse(list.get(i).getTxStatus());
			if (status) {
				System.out.println(list.get(i).toString());
			}
		}

		System.out.println("**************************************************************");
		for (int i = 0; i < list.size(); i++) {
			TransactionInfo.txArrearesCalculation(list.get(i));
		}
	}

	public static void txArrearesCalculation(Transaction list) {

		Function<Transaction, Double> c = (list1) -> {
			if (list1.getTxArrears() == true) {
//				System.out.println(list1.getTxAmount());
				double result = list1.getTxAmount() + 500 + (list1.getTxAmount() * 0.18);
				return result;
			} else {
				return (double) list1.getTxAmount();
			}
		};
		System.out.println(list.toString() + " " + c.apply(list));

	}

	public static Boolean amountGreater(Float amount) {

		Predicate<Float> p = (a) -> {
			return (amount > 5000) ? true : false;
		};
		return p.test(amount);

	}

	public static Boolean txFalse(Boolean status) {

		Predicate<Boolean> p = (a) -> {
			return (!status) ? true : false;
		};
		return p.test(status);
	}

}