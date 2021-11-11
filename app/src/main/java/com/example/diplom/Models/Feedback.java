package com.example.diplom.Models;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.Objects;

public class Feedback {
    private int id;
    private String date;
    private Exercise[] exercises;
    private Estimate estimate;
    private String description;

    public Feedback(int id, String date, Exercise[] exercises, Estimate estimate, String description) {
        this.id = id;
        this.date = date;
        this.exercises = exercises;
        this.estimate = estimate;
        this.description = description;
    }

    public Feedback() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Exercise[] getExercises() {
        return exercises;
    }

    public void setExercises(Exercise[] exercises) {
        this.exercises = exercises;
    }

    public Estimate getEstimate() {
        return estimate;
    }

    public void setEstimate(Estimate estimate) {
        this.estimate = estimate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Feedback)) return false;
        Feedback feedback = (Feedback) o;
        return getId() == feedback.getId() &&
                getDate().equals(feedback.getDate()) &&
                Arrays.equals(getExercises(), feedback.getExercises()) &&
                getEstimate() == feedback.getEstimate() &&
                getDescription().equals(feedback.getDescription());
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        int result = Objects.hash(getId(), getDate(), getEstimate(), getDescription());
        result = 31 * result + Arrays.hashCode(getExercises());
        return result;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", exercises=" + Arrays.toString(exercises) +
                ", estimate=" + estimate +
                ", description='" + description + '\'' +
                '}';
    }
}
enum Estimate{
    VERY_EASY,
    EASY,
    COMMON,
    NORMAL,
    HARD,
    VERY_HARD,
    IMPOSSIBLE
}
