package com.chainsys.bakeryshop.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person{
//	@Id
//	   @GeneratedValue(strategy = GenerationType.AUTO)
		private int person_id;
		private String person_name;
		private String email;
		private String password;
		private int mobile_no;
		private String person_type;
		
		public int getPerson_id() {
			return person_id;
		}
		public void setPerson_id(int person_id) {
			this.person_id = person_id;
		}
		public String getPerson_name() {
			return person_name;
		}
		public void setPerson_name(String person_name) {
			this.person_name = person_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getMobile_no() {
			return mobile_no;
		}
		public void setMobile_no(int mobile_no) {
			this.mobile_no = mobile_no;
		}
		public String getPerson_type() {
			return person_type;
		}
		public void setPerson_type(String person_type) {
			this.person_type = person_type;
		} 
		
}