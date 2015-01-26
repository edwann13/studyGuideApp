package com.kaiman21.studyguide.kaiman.studyguide.tests;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * Created by Kaiman on 1/12/15.
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testThis() {
        assertEquals(true, true);
    }
    public void testFalse() {
        assertEquals(false, false);
    }
}
