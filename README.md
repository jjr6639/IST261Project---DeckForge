# IST261Project
A simple java application for Magic the Gathering Deck Sharing on a desktop computer

DeckForge – MTG Deck Sharing Application
DeckForge is a Java-based application for creating, managing, organizing, and sharing Magic: The Gathering (MTG) decks.
The project follows an MVC-influenced structure with clear separation between core models, controllers, persistence, and user interface tools.
This application allows users to:
Build MTG decks
Organize decklists through different data structures (HashMap, TreeSet, Sorted Lists)
Save and load decks via a persistence layer
View deck details and interact with a UI layer
Manage user profiles and shared deck collections
📁 Project Structure
Below is an overview of the major components in the project based on the included .java files.
Core Models
File	Description
Card.java	Represents individual MTG cards.
Deck.java	Stores a single deck and its card entries.
DeckEntry.java	Represents a card + quantity inside a deck.
User.java	Represents a user in the system.
UserProfile.java	Stores profile-level user settings, deck history, etc.
Data Structures
The project includes multiple implementations for storing and organizing decklists:
File	Description
DeckHashMap.java	Deck storage backed by a HashMap. Fast lookup of cards.
DeckList.java	List-based structure for decks.
DeckSortedList.java	Automatically sorted deck list implementation.
TreeSetPlainText.java	TreeSet-based text storage (used for ordering and deduplication).
Controllers
File	Description
DeckController.java	Main controller connecting model and UI for deck interactions.
DeckManager.java	Higher-level service for creating, deleting, importing, and exporting decks.
PersistenceController.java	Handles saving/loading decks, users, and app data.
User Interface (UI)
File	Description
DeckUI.java	General deck interaction UI (CLI or abstract UI layer).
DeckDetailUI.java	Displays specific deck details.
DeckListUI.java	Lists decks belonging to a user.
DeckView.java	View-layer representation of a deck.
App.java / Main.java	Entry point launching the UI and application controllers.
Testing / Utilities
File	Description
DeckTest.java	Unit tests focused on deck behavior.
TestHarness.java	Full-system testing or debugging tool.
🚀 Features
✔ Deck Creation and Editing
Add / remove / modify card entries
Automatic sorting through data structure implementations
Deck validation rules (if implemented)
✔ Deck Persistence
Save decks to local storage using PersistenceController
Export/import formats (e.g., plaintext, JSON, or custom format)
✔ User Profiles
Maintain user accounts with preferences
Store each user’s deck collection
✔ Flexible Data Structures
Multiple deck storage options (HashMap, TreeSet, SortedList) allow:
Experimenting with performance
Custom sorting and filtering logic
Pluggable backend for decks
✔ CLI or GUI-Ready UI Layer
The UI classes abstract the user interaction layer, making the system adaptable to:
CLI
Swing/JavaFX
Web front-end (future)
🔧 Requirements
Java 17+ (recommended)
Build tool: Maven or Gradle (depending on your setup)
Optional: JUnit for testing
▶ Running the Application
If your entry point is Main.java:
javac -d out src/main/java/*.java
java -cp out Main
Or if the entry point is App.java:
javac -d out src/main/java/*.java
java -cp out App
(Adjust as needed depending on your directory structure.