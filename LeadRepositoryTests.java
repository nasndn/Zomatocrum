package com.zomatocrum;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.zomatocrum.enities.Lead;
import com.zomatocrum.repository.LeadRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback
public class LeadRepositoryTests {
	
	@Autowired
	private LeadRepository leadRepo;
	
	@Test
	public void saveOneLead() {
		Lead l= new Lead("mike","m","mike@gmail.com","9890604608","online");
			leadRepo.save(l);
			
			assertThat(l.getId()).isGreaterThan(0);
	}	
	
	@Test
	public void saveRestLead() {
		Lead l1=new Lead("staline","k","staline@gmail.com","9890604608","radio");
		Lead l2=new Lead("pankaj","p","pankaj1234@gmail.com","9890604689","online");
		leadRepo.save(l1);
		leadRepo.save(l2);
		
		assertThat(l1.getId()).isGreaterThan(0);
		assertThat(l2.getId()).isGreaterThan(0);
	}

}
