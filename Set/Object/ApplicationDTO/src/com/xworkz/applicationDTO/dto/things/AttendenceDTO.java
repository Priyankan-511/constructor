package com.xworkz.applicationDTO.dto.things;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class AttendenceDTO implements Serializable {
	private String studentname;
	private int rono;
	private String mailid;
	@Override
	public String toString() {
		return "AttendenceDTO [studentname=" + studentname + ", rono=" + rono + ", mailid=" + mailid + "]";
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRono() {
		return rono;
	}
	public void setRono(int rono) {
		this.rono = rono;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(mailid, rono, studentname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendenceDTO other = (AttendenceDTO) obj;
		return Objects.equals(mailid, other.mailid) && rono == other.rono
				&& Objects.equals(studentname, other.studentname);
	}
	
	
	
	
	

}
