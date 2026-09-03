## Purpose

Provides consistent palindrome evaluation for words and phrases despite formatting, punctuation, or letter case differences.

## ADDED Requirements

### Requirement: Normalize text for palindrome evaluation
The system SHALL evaluate palindrome input by considering only characters classified as letters and comparing those letters without regard to case.

#### Scenario: Phrase contains spaces and punctuation
- **WHEN** the input is "Socorram-me, subi no onibus em Marrocos"
- **THEN** the system reports that the input is a palindrome

#### Scenario: Letter case differs across matching positions
- **WHEN** the input is "Ana"
- **THEN** the system reports that the input is a palindrome

#### Scenario: Letters do not mirror after normalization
- **WHEN** the input is "Casa"
- **THEN** the system reports that the input is not a palindrome

### Requirement: Handle absent and letterless input
The system SHALL report null input as not a palindrome and SHALL treat an empty input, including one containing no letters, as a palindrome after normalization.

#### Scenario: Input is null
- **WHEN** the input is null
- **THEN** the system reports that the input is not a palindrome

#### Scenario: Input contains only non-letter characters
- **WHEN** the input is "!? 123"
- **THEN** the system reports that the input is a palindrome
