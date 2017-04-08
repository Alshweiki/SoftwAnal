package hes_so.softwanal;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ApplicationTest {

    //on précise que l'on veux tester un MainActivity
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkButtonIfDisplayed() {
        onView(withId(R.id.btnHappy)).check(matches(isDisplayed()));
        onView(withId(R.id.btnAngry)).check(matches(isDisplayed()));
        onView(withId(R.id.btnThinking)).check(matches(isDisplayed()));
        onView(withId(R.id.btnBroken)).check(matches(isDisplayed()));
        onView(withId(R.id.btnStressed)).check(matches(isDisplayed()));
        onView(withId(R.id.btnSleepy)).check(matches(isDisplayed()));
    }

}