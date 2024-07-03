# Summary
- This is a web application designed to improve the oral production capabilities of French learners.
- Generates sound recordings of French phrases based on the users proficiency level.
- Users record their readings of the generated sentences and are returned an accuracy score based on their fluency, phonetic capabilities, and correctness.

## Design

#### 1. Choose Proficiency Level
- Webpage starts with a screen that allows users to choose their proficiency level (A1,A2,...,C2).
- Level is saved to the computer.
- User presses button to next segment.

#### 2. Generate Written Sentences (With Tatoeba https://tatoeba.org/en)
- 10 Written sentences are generated with Tatoeba based on the users chosen level.
- Difficulty scalar determines number of words generated in each sentence, and quality of words generated.

#### 3. Create Speech Recordings of Generated Sentences (With Google Cloud Text-to-Speech)
- Convert text to speech and create playable recordings for the User.
- Used as a reference point for the user and for the machine to make comparisons.

#### 4. Record the User's Oral Production
- Records the user's rendition of the text-to-speech sentences.
- Assess the user's oral production and returns a score based on pitch and intonation, fluency, pronunciation accuracy, and overall accuracy.

# To Run
### Install Instructions


### Launch Instructions

### Testing Instructions

http://localhost:8080