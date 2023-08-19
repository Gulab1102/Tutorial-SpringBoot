package com.temp.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.net.ssl.X509ExtendedTrustManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.temp.jpa.entity.Employee;
import com.temp.jpa.repo.Employeerepo;
import com.temp.jpa.repo.Emplyrepo2;

@SpringBootApplication
public class TempexampleApplication {

	public static void main(String[] args) {
		
	ApplicationContext contex=	SpringApplication.run(TempexampleApplication.class, args);
	
	Employeerepo emplyeerepo= contex.getBean(Employeerepo.class);
	
	Emplyrepo2 em=contex.getBean(Emplyrepo2.class);
	
	//Optional<Employee> emp1=new Employee();
//	emp1.setName("Gkp");
//	
//	emp1.setCity("Nke");
//	
//	Employee emp2=new Employee();
//	emp2.setCity("Patna");
//	emp2.setName("Pria Kumari");
//	
//	List<Employee> list= new ArrayList<Employee>();
//	list.add(emp2);
//	
//	list.add(emp1);
	
//Iterable<Employee> itr=	emplyeerepo.saveAll(list);
//
//itr.forEach(em->{
//	System.out.println(em);
//});
	
//emplyeerepo.deleteById(103);

//System.err.println(emp1.get());

//System.out.println(emp1.get());
//	
//Employee em1=emp1.get();
//em1.setName("LKP");
//em1.setCity("Champaran");
//	
//em1=emplyeerepo.save(em1);
//
//System.out.println(em1);
	




	
	}

}
