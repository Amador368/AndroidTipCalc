package me.asantiago.android.tipcalc.fragments;

import me.asantiago.android.tipcalc.models.TipRecord;

/**
 * Created by Amador on 05/06/2016.
 */
public interface TipHistoryListFragmentListener {
    //void action(String str);
    void addToList(TipRecord record);
    void clearList();
}
