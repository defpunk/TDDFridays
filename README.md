# TDDFridays

Starter project for TDD Katas

Dave Farley calls TDD a talent amplifier for sowtware engineers. [See this video for details](https://www.youtube.com/watch?app=desktop&v=ln4WnxX-wrw). I agree but concide that it takes a bit of getting used to. Coding Kata's are a great way to practice and make the TDD technique a habit you take into all coding endeadvours. 

Robert C. Martin (“Uncle Bob”) provides a concise set of rules for practicing TDD

* Write production code only to pass a failing unit test.
* Write no more of a unit test than sufficient to fail (compilation failures are failures).
* Write no more production code than necessary to pass the one failing unit test.

My trick is to always start coding in a test file, I imagine the code I want already exists and type it in, when the IDE underlines errors I create the bear minium that will make the code compile. Empty classes, functions that return null or whatever the IDE will generate for me work well. My aim is to get the test code to compile so that I can get to a test that fails.

I'm trying to get into the red green refactor cycle and take the smallest steps I can on both the test and production code. When I find its been more than a few minutes since I wrote a test I ask myself if the last step I took was too big.

## Exercises

1. [Temprature converter](01_temparature_converter.md)
2. [String calculator](02_string_calculator.md)