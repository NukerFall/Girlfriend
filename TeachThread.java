package me.carefall.coding;

public class TeachThread extends Thread {

    Coder teacher;
    Coder student;

    public TeachThread(Coder teacher, Coder student) {
        this.teacher = teacher;
        this.student = student;
        run();
    }

    @Override
    public void run() {
        for (String s : teacher.getProgramming()) {
            if (!teacher.isDead() && !student.isDead()) {
                teacher.setSleeping(false);
                student.setSleeping(false);
                student.getProgramming().add(s);
                System.out.println("Student " + student.getClass().getSimpleName() + " learned " +  s + "!");
                teacher.punch(student);
                teacher.kiss(student);
                teacher.setSleeping(true);
                student.setSleeping(true);
                try {
					sleep(5000);
				} catch (InterruptedException e) {}
            } else {
                break;
            }
        }
        student.setLevel(teacher.getLevel());
        System.out.println("Student " + student.getClass().getSimpleName() + " learned everything and now has level " +  student.getLevel() + "!");
        this.interrupt();
    }
}
