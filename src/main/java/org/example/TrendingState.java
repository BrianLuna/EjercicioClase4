package org.example;

import java.time.LocalDate;

public interface TrendingState {
    void setTrending(Song song);

    String showText(Song song);
}