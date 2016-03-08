#!/bin/sh

mkdir bin

javac -d bin src/javase01/t01/logic/Logic.java src/javase01/t01/main/Main.java
java -cp ./bin javase01.t01.main.Main

