package at.refugeescode.nurse.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreatmentTest {
    Treatment treatment = new Treatment();
    @Test
    void getTreatment() {
        String treatet = treatment.getTreatment("cold");
        assertEquals("drinkWater", treatet);
    }
}