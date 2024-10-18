package touristfirm; /**
 * Represents a tour with a destination, duration, and price.
 */

import java.util.Objects;
public class Tour {
    private String destination;
    private int duration; // in days
    private double price;

    private Tour(TourBuilder builder) {
        this.destination = builder.destination;
        this.duration = builder.duration;
        this.price = builder.price;
    }

    public String getDestination() {
        return destination;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "destination='" + destination + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tour)) return false;
        Tour tour = (Tour) o;
        return duration == tour.duration &&
                Double.compare(tour.price, price) == 0 &&
                Objects.equals(destination, tour.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, duration, price);
    }

    /**
     * Builder class for Tour.
     */
    public static class TourBuilder {
        private String destination;
        private int duration; // in days
        private double price;

        public TourBuilder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public TourBuilder setDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public TourBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Tour build() {
            return new Tour(this);
        }
    }
}
