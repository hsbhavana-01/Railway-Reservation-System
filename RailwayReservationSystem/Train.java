public class Train {
    int trainId;
    String trainName;
    String source;
    String destination;
    int availableSeats;

    public Train(int trainId, String trainName, String source, String destination, int availableSeats) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }
}