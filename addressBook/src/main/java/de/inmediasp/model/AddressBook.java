package de.inmediasp.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AddressBook {

	private List<AddressBookEntity> addressBook;
	
	public AddressBook(){
		this.addressBook = new ArrayList<>();
	}
	
	public List<AddressBookEntity> getAddressBook(){
		return this.addressBook;
	}
	
	public void addAddressBookEntity(AddressBookEntity entity){
		this.addressBook.add(entity);
	}
}
