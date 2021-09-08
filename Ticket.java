package com.upgrade.flightreservationsystem;
//just for time being to complete checkpoint 1.later will change the code as the project checkpoints moves further.
public class Ticket {
	private String pnr;
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public String getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	public String getArrivalDatetime() {
		return arrivalDatetime;
	}
	public void setArrivalDatetime(String arrivalDatetime) {
		this.arrivalDatetime = arrivalDatetime;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public String getSeatno() {
		return seatno;
	}
	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isCancelled() {
		return cancelled;
	}
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	private String from;
	private String to;
	private Flight flight;
	private String departureDateTime;
	private String arrivalDatetime;
	private Passenger passenger;
	private String seatno;
	private float price;
	private boolean cancelled;



	public Ticket(Passenger passenger) {
		super();
		this.passenger = passenger;
	}
	public Ticket(Flight flight) {
		super();
		this.flight = flight;
	}
	public String checkStatus() {
		return null;
	}
	public int getFlightDuration() {
		return  0;
	}
	public void cancel() {

	}
}
