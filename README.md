# software-testing-and-qa
Java testing and quality assurance project using JUnit and coverage analysis.

This repository contains work from my CS 320 Software Test Automation and QA course. It includes the Contact service files from Project One and my summary and reflections report from Project Two. These projects helped me practice writing unit tests, checking software requirements and thinking about how software can fail instead of only checking successful cases.

Project Files

The Contact service includes the following files:

1. Contact.java
2. ContactService.java
3. ContactTest.java
4. ContactServiceTest.java

The repository also includes my Project Two summary and reflections report.

How can I make sure that my code, program or software is functional and secure?

I make sure my code works by testing it against the requirements instead of only checking cases that I expect to pass. In this project, I used JUnit to test valid inputs, invalid inputs, boundary values, duplicate IDs, updates and deletions. I also used exception testing to check that invalid actions caused the correct errors. Testing negative cases is important because problems often appear when a user enters unexpected data. For security, I would also validate inputs, protect private information and add security testing when working with applications that store sensitive data.

How do I interpret user needs and incorporate them into a program?

I start by turning the user's requirements into specific rules that the program needs to follow. For the Contact service, the requirements defined limits for the contact ID, first name, last name, phone number and address. I used those rules when writing both the program and the tests. I also tested values at the limits and values that broke the requirements. This helped me check that the program behaved the way the user expected instead of basing the design only on my own assumptions.

How do I approach designing software?

I approach software design by breaking a larger problem into smaller parts with clear responsibilities. For the Contact project, the Contact class stores and validates contact information while the ContactService class handles actions such as adding, deleting and updating contacts. I also think about testing while I design the code instead of waiting until the program is finished. Writing tests alongside the software makes it easier to catch mistakes early and keeps the code connected to the original requirements. This project taught me that testing is part of the development process and shouldn't be treated as something that only happens at the end.
