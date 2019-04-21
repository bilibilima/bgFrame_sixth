package com.neuedu.model;

public class Storage {
	
	private long storageno;
	private String storagename;
	private String storageaddress;
	private long capacity;
	private long cordon;
	private long currentstorage;
	
	
	public Storage() {
		super();
		// TODO 自动生成的构造函数存根
	}


	public Storage(long storageno, String storagename, String storageaddress, long capacity, long cordon,
			long currentstorage) {
		super();
		this.storageno = storageno;
		this.storagename = storagename;
		this.storageaddress = storageaddress;
		this.capacity = capacity;
		this.cordon = cordon;
		this.currentstorage = currentstorage;
	}


	public long getStorageno() {
		return storageno;
	}


	public void setStorageno(long storageno) {
		this.storageno = storageno;
	}


	public String getStoragename() {
		return storagename;
	}


	public void setStoragename(String storagename) {
		this.storagename = storagename;
	}


	public String getStorageaddress() {
		return storageaddress;
	}


	public void setStorageaddress(String storageaddress) {
		this.storageaddress = storageaddress;
	}


	public long getCapacity() {
		return capacity;
	}


	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}


	public long getCordon() {
		return cordon;
	}


	public void setCordon(long cordon) {
		this.cordon = cordon;
	}


	public long getCurrentstorage() {
		return currentstorage;
	}


	public void setCurrentstorage(long currentstorage) {
		this.currentstorage = currentstorage;
	}
	
	
	
}
