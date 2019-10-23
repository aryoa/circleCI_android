package com.example.circleciapplication;


import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    // @see
    // https://naokirin.hatenablog.com/entry/2019/01/03/174517

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void changedTextTest() {
        ViewInteraction textView = onView(withId(R.id.hello_text));
        textView.check(matches(withText("こんにちは")));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        ViewInteraction button = onView(withId(R.id.tap_button));
        button.perform(click());

        textView.check(matches(withText("こんばんは")));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

    }
}
