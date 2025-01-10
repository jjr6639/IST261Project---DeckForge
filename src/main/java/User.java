/*****
 * IST 261 - M02-A02
 * Jordan Runyon - jjr6639
 * Sept. 15. 2024
 */

import java.util.List;

public class User {
    private String username;
    private String password;
    private UserProfile profile;
    private List<Deck> decks;

    public User(String username, String password, UserProfile profile, List<Deck> decks) {
        this.username = username;
        this.password = password;
        this.profile = profile;
        this.decks = decks;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }

    public List<Deck> getDecks() {
        return decks;
    }

    public void setDecks(List<Deck> decks) {
        this.decks = decks;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", profile=" + profile + ", decks=" + decks + "]";
    }
}
