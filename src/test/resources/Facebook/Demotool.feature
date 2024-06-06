Feature: Login Registration form

Scenario: Fill the details on the  textbox

Given browser config

When browser launch

And pass the values in the firstname textbox

And pass the values in the lasttname textbox

And pass the values in the email textbox

And pass the values in the mobilenumber textbox

And pass the values in the country textbox

And pass the values in the city textbox

And pass the values in the messgae textbox

Then Quit browser

Scenario Outline: Demotool Registration form login

Given config browser

When launch browser

And fill the value in the"<First Name>" fname textbox

And fill the value in the"<Last Name>" lname textbox

Then browser qiut


Examples:
|First Name   |  Last Name    |
|Eren         |  Joger        |
|Ragnar       |  Lothbrok     |
|Naruto       |  Uzumaki      |