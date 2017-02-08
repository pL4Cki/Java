
public class Flights {
	private String Flightdate;
	private String Flightreturndate;
	private String FlightDestination;
	private String TicketPrice;
	
	public void Flightdate (String Flightdate){
		this.Flightdate = Flightdate;
	}
	
	public String getFlightdate(){
		return this.Flightdate;
	}
	
	public void Flightreturndate(String Flightreturndate){
		this.Flightreturndate = Flightreturndate;
	}
	
	public String getFlightreturndate(){
		return this.Flightreturndate;
	}
	
	public void FlighDestination(String FlighDestination){
		this.FlightDestination = FlightDestination;
	}

}
