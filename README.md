# Deck Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Complete-success?style=for-the-badge)
![Course](https://img.shields.io/badge/Course-IST%20261-blue?style=for-the-badge)

A comprehensive flashcard deck management application built with Java, designed to help users organize, study, and manage their learning materials through a mobile-friendly interface.

**IST 261 Course Project** - Complex Software Engineering | Penn State University

---

## 📋 Table of Contents

- [Project Overview](#project-overview)
- [How It Works](#how-it-works)
- [Key Features](#key-features)
- [Architecture](#architecture)
- [Technical Highlights](#technical-highlights)
- [Project Structure](#project-structure)

---

## 🎯 Project Overview

This project was developed as part of the **IST 261 Complex Software Engineering** course. It demonstrates advanced software design principles, object-oriented programming, data persistence, and user interface implementation in Java.

The application provides a complete solution for managing flashcard decks, enabling users to create, organize, study, and track their learning progress through an intuitive mobile interface.

---

## ⚙️ How It Works

### Core Architecture

The application is built using a modular architecture with clear separation of concerns:

- **Model Layer**: `Card.java`, `Deck.java`, `User.java`, `UserProfile.java` - Handle data structures and business logic
- **View Layer**: `DeckUI.java`, `DeckView.java`, `DeckDetailUI.java`, `DeckListUI.java` - Manage user interface components
- **Controller Layer**: `DeckController.java`, `PersistenceController.java` - Coordinate between models and views
- **Entry Point**: `App.java`, `Main.java` - Application initialization and launch

### Workflow

1. **Launch**: Application starts through `Main.java`, initializing the UI and loading saved data
2. **Browse**: Users navigate their deck collection through the list view
3. **Select**: Clicking on a deck shows detailed information and study options
4. **Study**: Users review cards, mark their confidence, and track progress
5. **Manage**: Create new decks, add/edit cards, and organize collections
6. **Persist**: All changes are automatically saved for future sessions

### Data Flow

```
User Interaction → UI Components → Controller Layer → Model Layer → Data Persistence
                                         ↓
                                   Business Logic
                                         ↓
                                   Data Structures
```

The controller layer mediates all interactions, ensuring data integrity and proper state management throughout the application lifecycle.

---

## ✨ Key Features

### 1. **Deck Organization**
The system allows users to create and organize multiple decks of flashcards. Each deck can contain any number of cards and is managed through the `DeckManager.java` class, which handles:
- Creating new decks
- Organizing existing decks
- Searching and filtering decks
- Managing deck metadata

### 2. **Card Management**
Individual flashcards are represented by the `Card.java` class and contain:
- Question/prompt content
- Answer/response content
- Metadata (creation date, study history)
- Custom attributes for enhanced learning

### 3. **Data Structures**
The application implements multiple data structures for efficient operations:
- **DeckHashMap.java**: Provides O(1) average-case lookup for quick deck retrieval
- **DeckList.java**: Maintains ordered collections of decks
- **DeckSortedList.java**: Keeps decks organized by custom criteria (e.g., name, date modified, study progress)
- **TreeSetPlainText**: Manages hierarchical organization of content

### 4. **User System**
User management is handled through:
- **User.java**: Core user data and authentication
- **UserProfile.java**: Extended user information, preferences, and study statistics
- Individual user profiles track progress, study streaks, and performance metrics

### 5. **Data Persistence**
The `PersistenceController.java` ensures all user data, decks, and study progress are saved and can be restored between sessions. The system serializes data to maintain:
- Deck collections
- User progress
- Study history
- Application preferences

### 6. **Study Interface**
The UI components work together to provide an intuitive study experience:
- Browse all available decks (`DeckListUI.java`)
- View detailed information about specific decks (`DeckDetailUI.java`)
- Study cards with a clean, focused interface (`DeckView.java`)
- Track progress and statistics

### 7. **Testing Framework**
The application includes comprehensive testing:
- **DeckTest.java**: Unit tests for deck operations
- **TestHarness.java**: Integration testing suite
- Automated validation of core functionality

---

## 🏗️ Architecture

### Design Patterns

- **MVC (Model-View-Controller)**: Clean separation of data, presentation, and logic
- **Singleton**: Ensures single instances of critical components
- **Factory**: Streamlines object creation for cards and decks

### Component Interaction

```
┌─────────────┐
│   UI Layer  │  (DeckUI, DeckView, DeckListUI, DeckDetailUI)
└──────┬──────┘
       │
┌──────▼──────┐
│ Controllers │  (DeckController, PersistenceController)
└──────┬──────┘
       │
┌──────▼──────┐
│   Models    │  (Card, Deck, User, UserProfile)
└──────┬──────┘
       │
┌──────▼──────┐
│ Data Layer  │  (DeckHashMap, DeckList, DeckSortedList)
└─────────────┘
```

---

## 💡 Technical Highlights

- **Object-Oriented Design**: Extensive use of inheritance, polymorphism, and encapsulation
- **Design Patterns**: Implementation of MVC, Singleton, and Factory patterns
- **Data Structures**: Custom implementations of hash maps, sorted lists, and tree structures
- **Mobile-First UI**: Clean, intuitive interface optimized for mobile devices
- **Persistence**: Robust data saving and loading mechanisms
- **Testing**: Comprehensive test coverage ensuring reliability
- **Modular Architecture**: Highly maintainable and extensible codebase

---

## 📁 Project Structure

```
src/main/
├── App.java                    # Application entry point
├── Card.java                   # Flashcard model
├── Deck.java                   # Deck model
├── DeckController.java         # Deck operations controller
├── DeckDetailUI.java           # Deck detail view
├── DeckEntry.java              # Deck entry helper
├── DeckHashMap.java            # HashMap implementation
├── DeckList.java               # List implementation
├── DeckListUI.java             # Deck list view
├── DeckManager.java            # Deck management system
├── DeckSortedList.java         # Sorted list implementation
├── DeckTest.java               # Unit tests
├── DeckUI.java                 # Base UI components
├── DeckView.java               # Study view
├── Main.java                   # Main launcher
├── PersistenceController.java  # Data persistence
├── TestHarness.java            # Test suite
├── TreeSetPlainText.java       # Tree structure
├── User.java                   # User model
└── UserProfile.java            # User profile model
```

---

## 🎓 Course Context

This project demonstrates proficiency in:

- Complex software system design and implementation
- Advanced Java programming techniques
- Data structure design and optimization
- User interface development
- Software testing and quality assurance
- Version control and project management
- Documentation and technical writing

**Course**: IST 261 - Complex Software Engineering  
**Institution**: Penn State University

---

## 📄 License

This project was created for educational purposes as part of the IST 261 course curriculum.

---

## 👤 Author

Developed as part of the IST 261 coursework at Penn State University.