# OSRS Player Data Interface

A Java library for fetching Old School RuneScape player data. This package provides a clean interface for retrieving player statistics, including skills and activities.

## Requirements

- Java 21 or higher
- Gradle 8.0 or higher
- Jackson Databind 2.15.3
- Lombok 1.18.30 (for development)
- JUnit Jupiter 5.10.1 (for testing)

## Installation

### For Development
Clone the repository and include it in your project:

```bash
git clone https://github.com/yourusername/osrs-player-data-interface.git
cd osrs-player-data-interface
./gradlew build
```

### For Usage (Once Published)
After the package is published, add this dependency to your project's build.gradle file:

```groovy
dependencies {
    implementation 'com.osrs:osrs-player-data-interface:1.0-SNAPSHOT'
}
```

## Usage

```java
import com.osrs.OsrsPlayerFetcher;
import com.osrs.models.OsrsPlayer;
import com.osrs.models.Skill;
import com.osrs.models.Activity;

// Create an instance of your OsrsPlayerFetcher implementation
OsrsPlayerFetcher fetcher = new YourImplementation();

try {
    // Fetch player data - all models are immutable
    OsrsPlayer player = fetcher.getPlayerByRsn("playerName");
    
    // Access player skills (returns unmodifiable list)
    player.getSkills().forEach(skill -> {
        System.out.printf("%s: Level %d (XP: %d)%n", 
            skill.getName(), 
            skill.getLevel(), 
            skill.getXp());
    });
    
    // Access player activities (returns unmodifiable list)
    player.getActivities().forEach(activity -> {
        if (activity.getRank() > 0) {  // Check if ranked
            System.out.printf("%s: Rank %d (Score: %d)%n", 
                activity.getName(), 
                activity.getRank(), 
                activity.getScore());
        }
    });
} catch (IOException e) {
    // Handle network errors
} catch (IllegalArgumentException e) {
    // Handle invalid RSN or player not found
}
```

## Building and Testing

### Building
To build the project:

```bash
./gradlew build
```

### Testing
To run tests:

```bash
./gradlew test
```

The test suite includes:

- **Model Tests**: Validates the immutable data models and their JSON serialization/deserialization
  - Verifies correct parsing of player skills (24 skills)
  - Verifies correct parsing of activities (82 activities)
  - Tests both ranked and unranked activities
  - Validates immutability of collections
  - Ensures all numeric fields are properly handled (ranks, levels, XP)

Example test data includes a complete player profile with:
- All skills (Attack through Construction)
- All activities (League Points through Zulrah)
- Various activity states (unranked: -1 rank/score, ranked with scores)
- High-score activities (e.g., Kraken with 7,714 kills)

Test reports can be found in `build/reports/tests/test/index.html` after running the tests.

## Models

All models in this package are immutable and built using Lombok. Collections returned by models are unmodifiable.

### OsrsPlayer
The main model containing player data:
- `rsn`: RuneScape name (immutable String)
- `skills`: Unmodifiable List of Skill objects
- `activities`: Unmodifiable List of Activity objects

### Skill
Represents a player's skill (immutable):
- `id`: Skill ID
- `name`: Skill name
- `rank`: Player's rank in the skill
- `level`: Current level
- `xp`: Total experience

### Activity
Represents a player's activity or boss kills (immutable):
- `id`: Activity ID
- `name`: Activity name
- `rank`: Player's rank in the activity (-1 if unranked)
- `score`: Activity score/kill count (-1 if no score)

## Development

This project uses the following key dependencies:
- Lombok 1.18.30 for reducing boilerplate code
- Jackson Databind 2.15.3 for JSON serialization/deserialization
- JUnit 5.10.1 for testing

To set up your development environment:
1. Ensure your IDE has Lombok support:
   - IntelliJ IDEA: Install "Lombok" plugin
   - Eclipse: Run `lombok.jar` as a Java application to install it
   - VS Code: Install "Lombok Annotations Support" extension
2. Import the project as a Gradle project
3. Ensure Java 21 is configured as the project SDK

## License

This project is licensed under the MIT License. 