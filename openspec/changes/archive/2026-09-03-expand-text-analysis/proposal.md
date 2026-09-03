## Why

The existing palindrome verifier only compares characters by position and does not support phrases with punctuation or spaces. The project also lacks a reusable way to obtain basic metrics from text, including empty and variably formatted input.

## What Changes

- Extend palindrome verification to compare only letters, without regard to letter case, so words and phrases can be evaluated consistently.
- Add text analysis that reports the number of words, characters, and vowels in an input string.
- Define behavior for null, empty, whitespace-only, punctuated, and mixed-case input.

## Capabilities

### New Capabilities

- `palindrome-verification`: Evaluate whether a word or phrase is a palindrome after ignoring non-letter characters and letter case.
- `text-analysis`: Calculate word, character, and vowel counts for a supplied text.

### Modified Capabilities

- None.

## Impact

- Affects the Java sources under `src/`, primarily the existing palindrome utility and a new text-analysis utility.
- Adds focused automated tests for the specified behavior.
- Requires no external dependencies or framework changes.
