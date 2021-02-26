class HumanTest {

    public static void main(String[] args) {

        Human human1 = new Human(3, 3, 3, 100);
        Human human2 = new Human(3, 3, 3, 100);
        Ninja n1 = new Ninja();
        human1.attack(human2);
        n1.steal(human1);
        n1.runAway();
    }
}