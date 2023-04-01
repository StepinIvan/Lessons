package org.example.lesson_2_1;

public class Human implements Participants{
    private String name;
    private boolean success = true;
    public Human (String name) {
        this.name = name;
    }
    @Override
    public void run(Barriers barriers) {
        if (barriers.getComplexity() < 1000) {
            System.out.println(name + " успешно пробежал " + barriers.getComplexity() + " м");
        } else {
            System.out.println(name + " не пробежал " + barriers.getComplexity() + " м. и сошел с дистанции");
            success = false;
        }
    }

    @Override
    public void jump(Barriers barriers) {
        if (barriers.getComplexity() < 2 ) {
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
