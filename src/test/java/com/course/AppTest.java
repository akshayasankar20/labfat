package com.course;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testEligibility() {
        int eligibleCredits = 15;
        int nonEligibleCredits = 14;
        
        assertTrue(eligibleCredits >= 15, "15 credits should be eligible");
        assertFalse(nonEligibleCredits >= 15, "14 credits should not be eligible");
    }
}
