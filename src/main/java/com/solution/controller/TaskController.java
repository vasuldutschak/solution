package com.solution.controller;

import com.solution.model.Movie;
import com.solution.model.Rating;
import com.solution.service.MovieService;
import com.solution.service.RatingService;
import com.solution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class TaskController {

    private static final String VIEW_OF_ALL_USERS = "users";
    private static final String VIEW_OF_ALL_RATINGS = "ratings";
    private static final String VIEW_OF_ALL_MOVIES = "movies";
    private static final String VIEW_OF_TASK3 = "viewOfTask3";
    private static final String VIEW_OF_TASK_4 = "viewOfTask4";
    private static final String VIEW_OF_ONE_RATING = "rating";


    @Autowired
    private UserService userService;
    @Autowired
    private RatingService ratingService;
    @Autowired
    private MovieService movieService;

    @ModelAttribute("movie")
    public Movie createMovie() {
        return new Movie();
    }

    @RequestMapping(value = "/task0users", method = RequestMethod.GET)
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return VIEW_OF_ALL_USERS;
    }

    @RequestMapping(value = "/task0ratings", method = RequestMethod.GET)
    public String getAllRatings(Model model) {
        model.addAttribute("ratings", ratingService.findAll());
        return VIEW_OF_ALL_RATINGS;
    }

    @RequestMapping(value = "/task0movies", method = RequestMethod.GET)
    public String getAllMovies(Model model) {
        model.addAttribute("movies", movieService.findAll());
        return VIEW_OF_ALL_MOVIES;
    }

    @RequestMapping(value = "/task1", method = RequestMethod.GET)
    public String getUpdatedRatings(Model model) {
        ratingService.setCurrentDateForNullRatingDate();
        return "redirect:/task0ratings";
    }

    @RequestMapping(value = "/task0movies", method = RequestMethod.POST)
    public String addMovie(@ModelAttribute("movie") Movie movie) {
        movieService.save(movie);
        return "redirect:/task0movies";
    }

    @RequestMapping(value = "/task3/between/{first}/{last}", method = RequestMethod.GET)
    public String findAllByRatingBetween(Model model, @PathVariable("first") int first, @PathVariable("last") int last) {
        List<Rating> allByRatingBetween = ratingService.findAllByRatingBetween(first, last);
        model.addAttribute("ratings", allByRatingBetween);
        return VIEW_OF_TASK3;
    }

    @RequestMapping(value = "/task4", method = RequestMethod.GET)
    public String getAllMoviesWithoutRating(Model model) {
        model.addAttribute("movies", movieService.findAllWithoutRating());
        return VIEW_OF_TASK_4;
    }

    @RequestMapping(value = "/task0movies/{id}/delete", method = RequestMethod.POST)
    public String removeMovie(@PathVariable("id") Integer id) {
        movieService.delete(id);
        return "redirect:/task0movies";
    }

    @RequestMapping(value = "/task0ratings/{id}", method = RequestMethod.GET)
    public String getOneById(Model model, @PathVariable(name = "id") Integer id) {
        model.addAttribute("rating", ratingService.findOne(id));
        return VIEW_OF_ONE_RATING;
    }


}
