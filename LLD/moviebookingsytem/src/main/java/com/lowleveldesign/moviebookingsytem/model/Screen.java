package com.lowleveldesign.moviebookingsytem.model;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private String name;
    private int capacity;
    private List<Show> show;
    private List<Seat> seats;
    
    public List<Show> getCurrentShow(){
        //TODO
        return new ArrayList<>();
    }
}
