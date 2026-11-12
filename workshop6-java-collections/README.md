# Workshop 6 – Java Collections & OOP Concepts

Solutions for the seven exercises in *Workshop 6 – Java Collections – OOP Concepts*.

Every exercise is a self-contained Java class with its own `main` method, so each one can be
run on its own from an IDE or from the command line.

## Project layout

```
workshop6-java-collections/
├── src/workshop6/
│   ├── Exercise1SongList.java          Exercise 1 – songs and artists in two arrays
│   ├── Exercise2SortedSongList.java    Exercise 2 – bubble sort into alphabetical order
│   ├── Exercise3SentenceReverser.java  Exercise 3 – reverse the letters of every word
│   ├── Exercise4MessageDecoder.java    Exercise 4 – decode "G tgsl Qefe."
│   ├── Exercise5PhraseSearch.java      Exercise 5 – search engine with 10 paragraphs
│   ├── IdentifyMyParts.java            Exercise 6 – the class given in the question
│   ├── Exercise6IdentifyMyParts.java   Exercise 6 – driver that prints the output
│   ├── Boxes.java                      Exercise 7 – the Boxes class
│   └── Exercise7BoxesDriver.java       Exercise 7 – driver class
├── outputs/                            console output of every exercise (captured from a real run)
├── run.sh                              compiles everything and runs all seven exercises
└── README.md
```

## How to compile and run

Requirements: JDK 8 or newer (`javac` and `java` on the PATH).

```bash
# compile
javac -d out -sourcepath src src/workshop6/*.java

# run one exercise
java -cp out workshop6.Exercise1SongList
java -cp out workshop6.Exercise2SortedSongList
java -cp out workshop6.Exercise3SentenceReverser
java -cp out workshop6.Exercise4MessageDecoder
java -cp out workshop6.Exercise5PhraseSearch
java -cp out workshop6.Exercise6IdentifyMyParts
java -cp out workshop6.Exercise7BoxesDriver
```

or simply

```bash
./run.sh
```

## Notes on each exercise

**Exercise 1 (Easy)** – `songs[]` and `artists[]` are two parallel arrays: element *i* of
one belongs to element *i* of the other. A `for` loop walks both arrays and prints the pair.

**Exercise 2 (Hard)** – Bubble sort compares neighbouring songs with
`compareToIgnoreCase()`; whenever two songs are swapped, the matching artists are swapped
as well, otherwise the artist would no longer belong to its song. The pass is repeated until
no swap happens.

**Exercise 3 (Medium)** – The sentence is split into a `String[]` of words. Every word is
turned into a `char[]` and reversed with two indexes, one from each end. Characters that are
not letters are skipped, so punctuation keeps its place: `"To be or not to be."` →
`"oT eb ro ton ot eb."`.

**Exercise 4 (Easy)** – The key table is stored as two strings of 26 letters (coded row
and plain row). Each letter of the message is looked up with `indexOf()` and replaced by
the matching plain letter; the case is preserved and spaces/punctuation are copied unchanged.
`"G tgsl Qefe."` → `"I like Java."`. To decode another message only the `codedMessage`
constant has to be changed – a second message is decoded in the same run to prove it.

**Exercise 5 (Medium)** – Ten paragraphs in a `String[]`, searched with `String.contains()`
on lower-cased copies so the search ignores case. All matching indexes and paragraphs are
printed, and a "not found" message is printed when there is no match.

**Exercise 6 (Easy)** – `x` is the class (static) variable, `y` is the instance variable.
Output:

```
a.y = 5
b.y = 6
a.x = 2
b.x = 2
IdentifyMyParts.x = 2
```

`a.y` and `b.y` are separate copies. `x` exists only once: `a.x = 1` and `b.x = 2` both
change that single variable, so the last assignment (2) is the value seen everywhere.

**Exercise 7 (Medium)** – `Boxes` has a constructor, `setSize()`, `toString()` returning
`"10 x 10"` and `draw()`. The drawing uses two nested loops: the first and last row are
made of `'-'`, the first and last column of `'|'`, the inside of spaces, so the box is
`size` rows by `size` columns (2–10). The Unicode version uses `\u2500` and `\u2502`.
