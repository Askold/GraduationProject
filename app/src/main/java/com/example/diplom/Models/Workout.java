package com.example.diplom.Models;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Workout  implements Serializable {
    private int id;
    private Exercise[] exercises;
    private int[] weights;
    private int[] rounds;
    private int[] repetitions;

    public Workout(int id, Exercise[] exercises, int[] weights, int[] rounds, int[] repetitions) {
        this.id = id;
        this.exercises = exercises;
        this.weights = weights;
        this.rounds = rounds;
        this.repetitions = repetitions;
    }

    public Workout() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Exercise[] getExercises() {
        return exercises;
    }

    public void setExercises(Exercise[] exercises) {
        this.exercises = exercises;
    }

    public int[] getWeights() {
        return weights;
    }

    public void setWeights(int[] weights) {
        this.weights = weights;
    }

    public int[] getRounds() {
        return rounds;
    }

    public void setRounds(int[] rounds) {
        this.rounds = rounds;
    }

    public int[] getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int[] repetitions) {
        this.repetitions = repetitions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Workout)) return false;
        Workout workout = (Workout) o;
        return getId() == workout.getId() &&
                Arrays.equals(getExercises(), workout.getExercises()) &&
                Arrays.equals(getWeights(), workout.getWeights()) &&
                Arrays.equals(getRounds(), workout.getRounds()) &&
                Arrays.equals(getRepetitions(), workout.getRepetitions());
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        int result = Objects.hash(getId());
        result = 31 * result + Arrays.hashCode(getExercises());
        result = 31 * result + Arrays.hashCode(getWeights());
        result = 31 * result + Arrays.hashCode(getRounds());
        result = 31 * result + Arrays.hashCode(getRepetitions());
        return result;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + id +
                ", exercises=" + Arrays.toString(exercises) +
                ", weights=" + Arrays.toString(weights) +
                ", rounds=" + Arrays.toString(rounds) +
                ", repetitions=" + Arrays.toString(repetitions) +
                '}';
    }

}
