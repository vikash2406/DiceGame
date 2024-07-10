package interfaces;

public interface Fighter {

    int attack();
    int defend();
    void takeDamage(int damage);
    boolean isAlive();
    int getHealth();
}
