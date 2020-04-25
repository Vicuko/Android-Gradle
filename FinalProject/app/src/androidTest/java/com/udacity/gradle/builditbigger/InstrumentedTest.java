package com.udacity.gradle.builditbigger;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Vicuko on 25/04/2020.
 */
@RunWith(AndroidJUnit4.class)
public class InstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testAsyncTask() throws InterruptedException, ExecutionException {
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        asyncTask.execute(activityTestRule.getActivity());
        String joke = asyncTask.get();
        assertNotNull(joke);
    }
}
