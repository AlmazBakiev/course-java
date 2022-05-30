package ru.gb.javaLvl2.almazbakiev;


public abstract class Obstacles {
    private String name;

    public String getName() {
        return name;
    }

//    public void runAndJump(Object team, Object o) {
//        if (o.getClass().getName().equals("Wall")) {
//            if (team.getClass().) {
//                break;
//            }
//        } else {
//            if (athleticSkills.run(o.getLengthOrHeightObstacle())) {
//                break;
//            }
//        }
//    }

    public abstract int getLengthOrHeightObstacle();
}
