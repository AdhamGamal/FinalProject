package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)

public class ExampleInstrumentedTest implements EndpointsAsyncTask.JokeDeliver {

    @Test
    public void testVerifyEchoResponse() {
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(this);
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
    @Override
    public void onJokeDelivered(String joke) {
        Log.d("Test Result : ", joke);
    }
}
