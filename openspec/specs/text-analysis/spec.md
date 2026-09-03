# text-analysis Specification

## Purpose

Provides basic, predictable text metrics for ordinary, formatted, empty, and absent input values.

## Requirements

### Requirement: Report text metrics
The system SHALL provide the number of words, characters, and vowels in a text input. Character count SHALL include every character in the original input, including whitespace, punctuation, and digits. Vowel count SHALL be case-insensitive and include the letters a, e, i, o, and u.

#### Scenario: Text contains words, spaces, and punctuation
- **WHEN** the input is "Ola, mundo!"
- **THEN** the system reports 2 words, 11 characters, and 4 vowels

#### Scenario: Text mixes letter case
- **WHEN** the input is "AeIoU"
- **THEN** the system reports 1 word, 5 characters, and 5 vowels

### Requirement: Identify words across input formatting
The system SHALL count a word as each non-empty sequence of non-whitespace characters, with one or more whitespace characters separating words.

#### Scenario: Text contains repeated and mixed whitespace
- **WHEN** the input is "  um\tdois\n tres  "
- **THEN** the system reports 3 words

#### Scenario: Text contains only punctuation without whitespace
- **WHEN** the input is "..."
- **THEN** the system reports 1 word

### Requirement: Handle absent and empty input
The system SHALL report zero words, zero characters, and zero vowels for null or empty input. For whitespace-only input, it SHALL report zero words and zero vowels while counting each input character.

#### Scenario: Input is empty
- **WHEN** the input is an empty string
- **THEN** the system reports zero for all metrics

#### Scenario: Input contains only whitespace
- **WHEN** the input contains only spaces, tabs, and line breaks
- **THEN** the system reports zero words and zero vowels while retaining the number of input characters

#### Scenario: Input is null
- **WHEN** the input is null
- **THEN** the system reports zero for all metrics
