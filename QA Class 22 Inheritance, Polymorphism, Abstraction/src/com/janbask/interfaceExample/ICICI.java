package com.janbask.interfaceExample;

public class ICICI implements CentralBank {

	public static void main(String[] args) {
	
ICICI i = new ICICI();
i.credicard();
i.homeloans();
i.insurance();
	}

	@Override
	public void homeloans() {
		System.out.println("home loans icici");
		
	}

	@Override
	public void insurance() {
	System.out.println("insurace icici");
	}

	@Override
	public void credicard() {
		System.out.println("credit card icicic");
		
	}

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		
	}

	

}
