package com.kaiman21.studyguide.kaiman.studyguide;

/**
 * Created by Kaiman on 12/22/14.
 */
public class Definition {
    Definition(String keyWord, String category, String definition) {
        _keyWord = keyWord;
        _defCategory = category;
        _definition = definition;
    }

    /** Returns the definition. */
    public String getDefinition() {
        return _definition;
    }

    /** Returns my keyword. */
    public String getKeyWord() {
        return _keyWord;
    }

    /** Returns my category. */
    public String getCategory() {
        return _defCategory;
    }

    /** Represents my keyword. */
    private String _keyWord;
    /** Represents the category that I belong to. */
    private String _defCategory;
    /** Represents the string that holds the
     * definition of me. */
    private String _definition;
}
