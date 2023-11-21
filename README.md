# Valid-Sentence-Coding-Test

This is designed to determine if a given string is a "valid" sentence. It abides to a set of predefined rules.

## Rules
A "valid" sentence in this context adheres to the following rules:
- Starts with a capital letter.
- Contains an even number of quotation marks.
- Ends with a period (.), question mark (?), or exclamation mark (!).
- Has no period characters other than the last character.
- Numbers below 13 are spelled out ("one", "two", "three", etc.).

## Running the Application
To run the application, navigate to the `SentenceValidator` class and execute the main method. This will run the pre-defined test sentences and output whether they are valid or not.

## Testing
The project includes a JUnit test  for comprehensive testing of each rules and overall sentence validity.
