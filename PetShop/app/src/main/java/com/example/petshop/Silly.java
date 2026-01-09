package com.example.petshop;

import java.util.Date;

public class Silly extends Mood {



    public Silly() {
        super();
    }

    public Silly(Date moodDate) {
        super(moodDate);
    }

    @Override
    public String mood() {
        return "silly";
    }
}
