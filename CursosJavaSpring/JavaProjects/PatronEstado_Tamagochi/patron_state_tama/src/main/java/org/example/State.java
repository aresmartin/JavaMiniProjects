package org.example;

public interface State {

    void jugar();
    void alimentar();
    void dormir();
    void comoEstas();

    void setTamagotchi(Tamagotchi tamagotchi);

}
