package com.example.diplom.Models;

import java.util.Arrays;

public class Trainer extends User {
    private Client[] clients;

    public Trainer(int id, String name, String surname, Client[] clients) {
        super(id, name, surname);
        this.clients = clients;
    }

    public Trainer() {
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "clients=" + Arrays.toString(clients) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trainer)) return false;
        if (!super.equals(o)) return false;
        Trainer trainer = (Trainer) o;
        return Arrays.equals(getClients(), trainer.getClients());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getClients());
    }
}
