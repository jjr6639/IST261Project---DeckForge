/***
 * Jordan Runyon - IST 261
 * Junit tests
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

  class UserProfileTest {
    private UserProfile profile;

    @BeforeEach
    void setUp() {
        profile = new UserProfile("Jordan", "Deck builder and MTG player.");
    }

    @Test
    void testGetDisplayName() {
        assertEquals("Jordan", profile.getDisplayName());
    }

    @Test
    void testSetDisplayName() {
        profile.setDisplayName("New Name");
        assertEquals("New Name", profile.getDisplayName());
    }

    @Test
    void testGetBio() {
        assertEquals("Deck builder and MTG player.", profile.getBio());
    }

    @Test
    void testSetBio() {
        profile.setBio("New bio.");
        assertEquals("New bio.", profile.getBio());
    }

    @Test
    void testToString() {
        String expected = "UserProfile [displayName=Jordan, bio=Deck builder and MTG player.]";
        assertEquals(expected, profile.toString());
    }
}
