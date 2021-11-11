package com.example.diplom.Models;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Program implements Serializable {
    private int id;
    private Workout[] workouts;
    private int durationInWeeks;
    private int workoutsPerWeek;
    private String description;
    private ProgramType type;

    public Program(int id, Workout[] workouts, int durationInWeeks, int workoutsPerWeek,
                   String description, ProgramType type) {
        this.id = id;
        this.workouts = workouts;
        this.durationInWeeks = durationInWeeks;
        this.workoutsPerWeek = workoutsPerWeek;
        this.description = description;
        this.type = type;
    }

    public Program() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Workout[] getWorkouts() {
        return workouts;
    }

    public void setWorkouts(Workout[] workouts) {
        this.workouts = workouts;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    public int getWorkoutsPerWeek() {
        return workoutsPerWeek;
    }

    public void setWorkoutsPerWeek(int workoutsPerWeek) {
        this.workoutsPerWeek = workoutsPerWeek;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProgramType getType() {
        return type;
    }

    public void setType(ProgramType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Program)) return false;
        Program program = (Program) o;
        return getId() == program.getId() &&
                getDurationInWeeks() == program.getDurationInWeeks() &&
                getWorkoutsPerWeek() == program.getWorkoutsPerWeek() &&
                Arrays.equals(getWorkouts(), program.getWorkouts()) &&
                getDescription().equals(program.getDescription()) &&
                getType() == program.getType();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        int result = Objects.hash(getId(), getDurationInWeeks(), getWorkoutsPerWeek(), getDescription(), getType());
        result = 31 * result + Arrays.hashCode(getWorkouts());
        return result;
    }

    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", workouts=" + Arrays.toString(workouts) +
                ", durationInWeeks=" + durationInWeeks +
                ", workoutsPerWeek=" + workoutsPerWeek +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}
enum ProgramType{
    AEROBIC,
    STRENGTH,
    FLEXIBILITY,
    BALANCE
}
