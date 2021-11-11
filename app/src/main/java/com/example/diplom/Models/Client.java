package com.example.diplom.Models;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Objects;

public class Client {
    private Trainer trainer;

    public Client(Trainer trainer) {
        this.trainer = trainer;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Client{" +
                "trainer=" + trainer +
                '}';
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(getTrainer(), client.getTrainer());
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(getTrainer());
    }
}
