Feature:To login facebook application

Scenario:to login valid username and valid password

Given To configure the browser

When To launch application

And To enter valid username on email textbox

And to enter valid password on password textbox

And To click login button

Then To close the browser

#Scenario Outline: Provide bulk datas to the username and password field
#
#Given To configure the application
#
#When To exeute app
#
#And Pass the valid "<Email datas>" on username textbox
#
#And Pass the valid "<Password datas>" on password textbox
#
#And Enter login btn
#
#Then Quit the browser
#
#
#Examples:
#|Email datas       | Password datas   |
#|raja@gmail.com    | 856425           |
#|asdfghj@gmail.com | 874526           |
#|erenjoger         |ahstfdghd         |