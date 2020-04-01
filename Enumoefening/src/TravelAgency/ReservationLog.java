package TravelAgency;
import java.util.Arrays;;

public class ReservationLog {
	
	private VoyageReservation[] successfulBookings;
	private VoyageReservation[] failedBookings;
	
	ReservationLog() {
		VoyageReservation[] successfulBookings= new VoyageReservation[1];
		VoyageReservation[] failedBookings= new VoyageReservation[1];
		
	}
	public void addReservationToList(VoyageReservation booking) {
	if(booking.getVoyage().getTotalNumberOfDays()>0&& booking.getVoyage().getTotalPersons()>0)
		addSuccessfulReservation(booking);
	else
		addFailedReservation(booking);
		
	}
	public void addSuccessfulReservation(VoyageReservation booking) {
		this.successfulBookings= Arrays.copyOf(this.successfulBookings,this.successfulBookings.length+1);
		for (int i = 0; i < this.successfulBookings.length; i++) {
            if (this.successfulBookings[i] == null) {
                this.successfulBookings[i] = booking;
                break;
            }
		}
	}
	
	public void addFailedReservation(VoyageReservation booking) {
		this.failedBookings= Arrays.copyOf(this.failedBookings,this.failedBookings.length+1);
		for (int i = 0; i < this.failedBookings.length; i++) {
            if (this.failedBookings[i] == null) {
                this.failedBookings[i] = booking;
                break;
            }
		}
		
	}
	public void printSuccessfulReservation() {
		for (int i = 0; i < this.successfulBookings.length; i++) {
			System.out.println(successfulBookings);
		}
		
	}
	public void printFailedReservation() {
		for (int i = 0; i < this.failedBookings.length; i++) {
			System.out.println(failedBookings);
		}
	}

}
