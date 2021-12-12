package me.carefall.coding;

import java.util.ArrayList;
import java.util.List;

public class Coder extends Human {
    
    private List<String> programming = new ArrayList<String>();
    private String level;

    public void teachProgramming(Coder coder) {
        new TeachThread(this, coder);
    }

    public void setProgramming(List<String> knowledge) {
        this.programming = knowledge;
    }

    public List<String> getProgramming() {
        return programming;
    }

    public void setLevel(String newLevel) {
        this.level = newLevel;
    }

    public String getLevel() {
        return level;
    }

    /*
    * code...
    */
}
