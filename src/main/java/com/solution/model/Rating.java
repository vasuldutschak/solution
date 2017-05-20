package com.solution.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Rating")
public class Rating extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;

    private int rating;

    @Column(name = "rating_date")
    @Temporal(value = TemporalType.DATE)
    private Date ratingDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rating)) return false;
        if (!super.equals(o)) return false;

        Rating rating1 = (Rating) o;

        if (rating != rating1.rating) return false;
        if (user != null ? !user.equals(rating1.user) : rating1.user != null) return false;
        if (movie != null ? !movie.equals(rating1.movie) : rating1.movie != null) return false;
        return ratingDate != null ? ratingDate.equals(rating1.ratingDate) : rating1.ratingDate == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (movie != null ? movie.hashCode() : 0);
        result = 31 * result + rating;
        result = 31 * result + (ratingDate != null ? ratingDate.hashCode() : 0);
        return result;
    }
}
