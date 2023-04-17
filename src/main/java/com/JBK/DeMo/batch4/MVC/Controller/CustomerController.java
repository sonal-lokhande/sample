package com.JBK.DeMo.batch4.MVC.Controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.JBK.DeMo.batch4.MVC.Model.Customer;

@Controller
public class CustomerController {
	@Autowired
	SessionFactory sf;
	@RequestMapping("save")
	String m() {
		return "customer";
	}
	@RequestMapping("/customer")
	String save(@ModelAttribute Customer customer) {	
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		ss.save(customer); // 101 Gopal
		tx.commit();
		return null;
	}
	
	
	
}
