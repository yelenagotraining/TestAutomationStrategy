
### Baseline Testing Principles 

1. Testing Shows Presence of Defects and Not Their Absence
  * Just because we have found no evidence of aliens, does not mean they don't exist
  * We will never be abile to prove there are not bugs AT ALL

2. Exhaustive Testing is impossible
  * Risk Analysis 
  * Equivalence Partitioning
  * Voundary Value Analysis

3. Early Testing Saves Time and Money
  * Get involved during requirements refinement proccess
  * Do static testing - testing requirements before they become code
  * If a mistake is made during requirements process, it gets coded into the code
  * Be Proactive!

4. Defects Cluster Together
  * Prioratize your work:
   1. New Feature
   2. Area of the software that historically produces the most defects
   3. Test the rest in yhour spare time

5. Beware of Pesticide Paradigm
  Running Same tests over and over again may become ineffective after a while. 
  - Review and change existing tests and test data
  - Create new tests

6. Test is context dependent
  * External Stakeholder Interests
  * Domain
  * Laws and Standards

7. Absence-of-Errors is a fallacy
  * Even if there are no bugs, it does not mean there are not errors
  * If what we built functions, but it's not what user wanted, there are errors

## Test Process Fundamentals

### High-Level Test Activities
* Test Planning
  - Defining the objectives of testing
  - Specifying how you are going to achieve those
    * Test Techniques?
    * Schedule and deadlines?
  - Test plan is not set in stone

* Test monitoring and control
  - On-going comparison of Palnned vs. Actual
    * Are we doing what we planned to do>
    * Are we on track?
    * Should we communication our findings already?
      
* Test Analysis
  - Better understanding leads to better tests
  - Create *Test Basis* upon which you will start building Test Cases
    * Requirements
    * Design Documents
    * Risk Analysis Reports (if available)
    * Code
  - Analysis means identifying all poassible defects:
    * Ambiguities
    * Omissions
    * Inconsistencies
    * Inaccuracies
    * Contradictions
    * Superfluous statements

* Test Design - How to test
  - Designing and prioritizing tests
  - Identifying necessary test data
  - Preparing the test environment
  - Capturing bi-directional tracebility between the test basis, test conditions, and test cases
* Test Implementation
* Test Execution
* Test Completion

**The dynamic of your workflow will be affected by SDLC style your team is implementing**

## What is Test Strategy?

Test strategy is usually represented as a so-called pyarmid. There are many versions of testing pyramids that can be translated into strategies.
If you do a google search, you'll find hundreds of representations, but generally, it looks something like this:
![](https://github.com/yelenagou/AutomationStrategyImages/blob/main/img/TestPyramid.png)

Your pyramid, meaning how much of each type of testing you are going to do, depends on your product, where you in the life-cycle of the product, and who your stake holders are.

In order to string together a testing strategy, we must understand each testing concept. 

#### Therefore, the definition may be
> A strategic declaration of how an organization iwll use the various testing concepts to minimize risk. 

<!-- ## Introducting Testing Concepts
[Introducing Testing Concepts](https://github.com/AAInternal/TestAutomationStrategy/wiki/Testing-Concepts)

### [Pyarmid == Strategy](https://github.com/AAInternal/TestAutomationStrategy/wiki/Pyramid-equals-Strategy)
![](https://github.com/AAInternal/TestAutomationStrategy/blob/master/img/buildingpyramid/OverallStrategy.png)
[Build your pyramid](https://github.com/AAInternal/TestAutomationStrategy/wiki/Pyramid-equals-Strategy) -->

Considering all the mentioned test types. How would you build your pyramid?
Is there a perscriptive answer here?

<!-- [Absolutely not! ](https://github.com/AAInternal/TestAutomationStrategy/wiki/Pyramid-equals-Strategy)



To skip the intro go to
[What is in this repo?](https://github.com/AAInternal/TestAutomationStrategy/blob/master/README.md#whats-in-this-repo)

[Go to programmers' oath](https://github.com/AAInternal/TestAutomationStrategy/wiki#the-programmers-oath---the-future-of-software)

[Go to Wiki](https://github.com/AAInternal/TestAutomationStrategy/wiki/Home/_edit#the-programmers-oath---the-future-of-software) -->

## Intro to unit testing
[Why and When?](https://github.com/AAInternal/TestAutomationStrategy/wiki/Unit-Testing-Introduction)


### Unit Testing in Mainstream:
Russian Doll on Netflix
![Bug in the universe](https://github.com/yelenagou/AutomationStrategyImages/blob/main/img/RussianDoll.png)
> On this show, there is a bug in the universe, and main character has to re-live the same day until the bug was fixed.

### We write unit tests to:
* People expect our software to be tested, the cheapest way to do that is with unit testing. 
* We write unit tests to protect our code
* We write tests to document our code
* We write test to understand existing code
* To follow our old friend SOLID principle
  When you write a unit test first, you will end up with code that does not violate Single Responsibility Principle
  

### We do not write unit tests to:
* Reach a code coverage metric
* Because someone told us it was what a good developer always does
* Testing code that does do anything intersting
`<h1>{{title}}</h1>`

### When do we write unit tests?
- If you're creating a brand new project. Start out on the right foot and add a unit test project to the solution. 
- When you adding new functionlity
- When you fixing a bug. So you never have to fix it again. 

Does this mean the user will not find a bug during testing?
![](https://github.com/yelenagou/AutomationStrategyImages/blob/main/img/BugWasFixed.png) 
**Yes, they will!**
And we will fix it once and for all.


### Who should write the unit test?

Developer should do it. I wanna be able to see code along with a unit test. 
Test passing is one of the criteria of a sucessful pull requests. 

### What is a good unit test? 
## Writing Good Tests
- A good test is:
  - self-contained(tests run in any order)
  - cleans up after itself
  - has a clear name with a clear goal
  - tells its own story - unit test has beginnin, middle, and end.
  - There are some techniques to get you thre:
    - AAA pattern
      - Arrange - setup needed for the test
      - Act - call the code under test
      - Asserts - test the results of the metthod
    - Damp vs Dry
      - DRY - do not repeat yourself
      - DAMP - descriptive and meaningful phrases 
       - Repeat yourself if necessary
       
   ![](https://github.com/AAInternal/TestAutomationStrategy/blob/master/img/BackInMyDayMockByHand.png)   
   
### Mocking
> Dependency injecting is good in general, but essential in unit testing.

<p>Simulates behavior of an object in controlled ways.</p>
    
The trick with a mock is that class realizes the interface.
    Interface is just a contract. So you can make a fake class that does not do anything. 
    
> These days, we have tools that do that for you. 
[Mocking Example](https://github.com/AAInternal/TestAutomationStrategy/wiki/Unit-Testing-Introduction#mocking)

## Next Steps
* Review your Definition of Done and add a Unit Testing commitmnet to it. 
* Review the Developers Oath proposed by Bob Martin. Good unit tests can go a long way to supporting many
* Learn as much as you can about whatever sparks your curiousity. 

* Review AutomationTesting folder with various information about unit testing and test-driven development

## What's in this repo?

# Automation Testing -  The Big Picture
## Learn what automated testing is 
Topics covered include:
 * Potential business value of automated tests 
 * The difference between unit, integration and other types of tests
 * How many of each type of test to write 
 * How they fit in with continuous integration and deployments. 
 * How automated tests can reduce costs, create happier teams and end users and improve long term delivery speeds. 

No prior knowledge of testing automation is required before starting this course. Nor is any platform, language or ecosystem specific knowledge. 

[Automation Testing - The Big Picture](https://github.com/yelenagouralnik/AutomationFrameworkStrategy/tree/master/AutomationTesting/TheBigPicture)
# Java Test Automation From Scratch
## Learn how to build a automation test framework for UI, API, and Unit
[Java Test Automation Framework From Scratch](https://github.com/yelenagotraining/JavaAutomationFrameworkModularized.git)

# TDD The Big Picture

Ccontext needed to understand not only what test-driven development is, but why it provides value in the first place.

# TDD Executive Briefing
### Why TDD is not Unit Testing
#### TDD for executives

What exactly TDD is and what it is not. We'll cover jargon you've likely heard, automated tests, types of unit testing, and code coverage.
[Why TDD is not unit testing](https://github.com/yelenagouralnik/AutomationFrameworkStrategy/tree/master/AutomationTesting/TDDExecutiveBriefing)
## Overall Test Pyramid
[Test Pyramid](https://github.com/yelenagouralnik/AutomationFrameworkStrategy/wiki)
## Acceptance Automation

