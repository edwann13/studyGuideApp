package com.kaiman21.studyguide.kaiman.studyguide;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kaiman on 12/22/14.
 */
public class Dictionary {
    Dictionary() {

        _listOfWords = new ArrayList<String>();
        _dictionary = new HashMap<String, Definition>();


    }
    /** Adds a word to the me (Dictionary). */
    public void addWord(Definition input) {
        String keyword = input.getKeyWord();

        _listOfWords.add(keyword);
        _dictionary.put(keyword, input);

    }

    /** Returns the Definition Object from me. If the
     *  the Definition does not exist return an empty Definition. */
    public Definition getDefinition(String keyword) {
        boolean hasDef = _dictionary.containsKey(keyword);
        if (hasDef) {
            return _dictionary.get(keyword);
        } else {
            return new Definition("Empty", "Empty", "Empty");
        }
    }
    /** Represents the list of words that are in the HashMap
     * _dictionary. */
    private ArrayList<String> _listOfWords;
     /** Main Data Structure to hold the definitions. */
    private HashMap<String, Definition> _dictionary;
}
