#!/bin/bash
# Compile all Workshop 6 exercises and run each of them.

set -e
cd "$(dirname "$0")"

echo "Compiling ..."
javac -d out -sourcepath src src/workshop6/*.java

for exercise in \
    workshop6.Exercise1SongList \
    workshop6.Exercise2SortedSongList \
    workshop6.Exercise3SentenceReverser \
    workshop6.Exercise4MessageDecoder \
    workshop6.Exercise5PhraseSearch \
    workshop6.Exercise6IdentifyMyParts \
    workshop6.Exercise7BoxesDriver
do
    echo
    echo "=========================================================="
    echo "Running $exercise"
    echo "=========================================================="
    java -cp out "$exercise"
done
