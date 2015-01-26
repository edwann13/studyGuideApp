package com.kaiman21.studyguide.kaiman.studyguide.tests;

import android.test.InstrumentationTestCase;

import com.kaiman21.studyguide.kaiman.studyguide.Definition;
import com.kaiman21.studyguide.kaiman.studyguide.Dictionary;


/** Test the implementation of the Dictionary class
 * Created by Kaiman on 1/12/15.
 */
public class DictionaryTest extends InstrumentationTestCase {


    public void testAddWord() {
        String expectedWord = "Real Estate";
        dic0.addWord(def0);
        boolean test0 = dic0.containsKey(expectedWord);
        boolean expected0 = true;
        assertEquals(expected0, test0);

        String expectedWord1 = "Tax";
        boolean expected1 = false;
        boolean test1 = dic0.containsKey(expectedWord1);
        assertEquals(expected1, test1);

        dic0.addWord(def1);
        boolean test2 = dic0.containsKey(expectedWord1);
        boolean expected2 = true;
        assertEquals(expected2, test2);

    }
    public void testGetDefinition() {
        Dictionary dic1 = new Dictionary();
        String expectedword0 = "Real Estate";
        boolean test0 = dic1.containsKey(expectedword0);
        boolean expected0 = false;
        assertEquals(expected0, test0);

        dic1.addWord(def0);
        boolean test1 = dic1.containsKey(expectedword0);
        boolean expected1 = true;
        assertEquals(expected1, test1);
    }
    /** Represents the keyword in the Definition Object. */
    String keyWord = "Real Estate";
    /** Represents the category in the Definition Obj. */
    String category = "Fair Housing";
    /** Represents the definition in the Definition Obj. */
    String definition = "property consisting of land or buildings.";
    /** The creation of the test Definition for the test. */
    Definition def0 = new Definition(keyWord, category, definition);

    /** Represents the keyword in the Definition Object. */
    String keyWord1 = "Tax";
    /** Represents the category in the Definition Obj. */
    String category1 = "Tax";
    /** Represents the definition in the Definition Obj. */
    String definition1 = "a strain or heavy demand.";
    /** The creation of the test Definition for the test. */
    Definition def1 = new Definition(keyWord1, category1, definition1);

    /** Represents the dictionary that we are going to test. */
    Dictionary dic0 = new Dictionary();
}
