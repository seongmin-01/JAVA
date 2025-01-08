package sub2;

public class Movie {

	private String title;
	private String director;
	private double rating;
	private int availableSeats;
	
public Movie(String title, String director, double rating, int avaliableSeats) {
	this.title = title;
	this.director = director;
	this.rating = rating;
	this.availableSeats = avaliableSeats;
 }

public boolean reserveSeat() {
	if(availableSeats > 0) {
		availableSeats--;
		return true;
	}
	else {
		return false;
	}
}
public void cancelReservation()	 {
	availableSeats++;
}

public void showDetails() {
	System.out.println("영화 제목: "+this.title);
	System.out.println("감독명: "+this.director);
	System.out.println("평점: "+this.rating);
	System.out.println("예약 가능 좌석 수: "+this.availableSeats);
}



}


