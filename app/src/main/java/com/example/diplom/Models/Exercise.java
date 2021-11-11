package com.example.diplom.Models;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.Serializable;
import java.util.Objects;

public class Exercise implements Serializable {
    private int id;
    private String name;
    private String description;
    private String video;

    public Exercise(int id, String name, String description, String video) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.video = video;
    }

    public Exercise() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exercise)) return false;
        Exercise exercise = (Exercise) o;
        return getId() == exercise.getId() &&
                Objects.equals(getName(), exercise.getName()) &&
                Objects.equals(getDescription(), exercise.getDescription()) &&
                Objects.equals(getVideo(), exercise.getVideo());
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getVideo());
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
