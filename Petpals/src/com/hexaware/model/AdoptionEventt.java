package com.hexaware.model;


import java.sql.Date;
import java.util.List;

import com.hexaware.controller.IAdoptable;

public class AdoptionEventt implements IAdoptable {
	
		 private List<IAdoptable> participants;
		 private String evename;
		 private Date evendate;
		 private String eveloc;
		public AdoptionEventt(List<IAdoptable> participants, String evename, Date evendate, String eveloc) {
			super();
			this.participants = participants;
			this.evename = evename;
			this.evendate = evendate;
			this.eveloc = eveloc;
		}
		public List<IAdoptable> getParticipants() {
			return participants;
		}
		public void setParticipants(List<IAdoptable> participants) {
			this.participants = participants;
		}
		public String getEvename() {
			return evename;
		}
		public void setEvename(String evename) {
			this.evename = evename;
		}
		public Date getEvendate() {
			return evendate;
		}
		public void setEvendate(Date evendate) {
			this.evendate = evendate;
		}
		public String getEveloc() {
			return eveloc;
		}
		public void setEveloc(String eveloc) {
			this.eveloc = eveloc;
		}
		@Override
		public String toString() {
			return "AdoptionEvent [participants=" + participants + ", evename=" + evename + ", evendate=" + evendate
					+ ", eveloc=" + eveloc + "]";
		}
		@Override
		public void adopt() {
			// TODO Auto-generated method stub
			
		}
}
		
