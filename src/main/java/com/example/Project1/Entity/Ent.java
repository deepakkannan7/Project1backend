package com.example.Project1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BatDetails")
public class Ent {

		@Id
		@Column(name="BID")
        private int bid;
		@Column(name="BNAME")
		private String bname;
		@Column(name="BPRICE")
		private int bprice;
		@Column(name="BCOUNTRY")
		private String bcountry;
		public Ent(int bid, String bname, int bprice, String bcountry) {
			super();
			this.bid = bid;
			this.bname = bname;
			this.bprice = bprice;
			this.bcountry = bcountry;
		}
		public Ent()
		{
			
		}
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public int getBprice() {
			return bprice;
		}
		public void setBprice(int bprice) {
			this.bprice = bprice;
		}
		public String getBcountry() {
			return bcountry;
		}
		public void setBcountry(String bcountry) {
			this.bcountry = bcountry;
		}
		public String toString()
		{
			return "bid="+bid+"bname="+bname+"bprice="+bprice+"bcountry="+bcountry;
		}
		
}
