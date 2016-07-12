package de.inmediasp.view;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.inmediasp.model.AddressBook;
import de.inmediasp.model.AddressBookEntity;

@Path("addressBook")
public class AddressBookView {

	private AddressBook addressBook = new AddressBook();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<AddressBookEntity> getAllAddresses(){
		
		return this.addressBook.getAddressBook();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_JSON)
	public AddressBookEntity addAddress(String x){
		
		System.out.println(x);
		
		AddressBookEntity address = new AddressBookEntity();
		address.setFirstname("John");
		address.setLastname("Doe");
		address.setEmail("john.dow@test.de");
		
		this.addressBook.addAddressBookEntity(address);
		
		return this.addressBook.getAddressBook().get(0);

	}
}
