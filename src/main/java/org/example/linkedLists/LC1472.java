package org.example.linkedLists;

import java.util.ArrayList;
import java.util.List;

public class LC1472 {

    private List<String> history;
    private int currentIndex;
    private int lastIndex;

    public LC1472(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        currentIndex = 0;
        lastIndex = 0;
    }

    public void visit(String url) {
        currentIndex++;

        if(currentIndex <= lastIndex){
            lastIndex = currentIndex;
        }

        if (currentIndex >= history.size()){
            history.add(url);
        }else{
            history.set(currentIndex, url);
        }
        lastIndex = currentIndex;
    }

    public String back(int steps) {
        currentIndex = Math.max(0, currentIndex - steps);
        return history.get(currentIndex);

    }

    public String forward(int steps) {
        currentIndex = Math.min(lastIndex, currentIndex + steps);
        return history.get(currentIndex);
    }
}
