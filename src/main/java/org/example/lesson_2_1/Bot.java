package org.example.lesson_2_1;

public class Bot implements Participants{
    private String name;
    private boolean success = true;
    public Bot (String name) {
        this.name = name;
    }
    @Override
    public void run(Barriers barriers) {
        if (barriers.getComplexity() < 10000) {
            System.out.println(name + " успешно пробежал " + barriers.getComplexity() + " м");
        } else {
            System.out.println(name + " не пробежал " + barriers.getComplexity() + " м. и сошел с дистанции");
            success = false;
        }
    }

    @Override
    public void jump(Barriers barriers) {
        if (barriers.getComplexity() < 5 ) {
            System.out.println(name + " успешно перепрыгнул стену высотой " + barriers.getComplexity() + " м");
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + barriers.getComplexity() + " м. и сошел с дистанции");
            success = false;
        }
    }

    @Override
    public boolean getSuccess() {
        return success;
    }
}
