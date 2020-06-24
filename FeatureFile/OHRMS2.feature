Feature: validating the all the functionalites in OHRMS

#Scenario: validate user registration of OHRMS1
# When I Open "CHROME" Browser
# When I Open Ohrms Application
#
#Scenario: validate user registration of OHRMS2
# When I Open "FF" Browser
# When I Open Ohrms Application
# 
# Scenario: validate user registration of OHRMS3
# When I Open "IE" Browser
# When I Open Ohrms Application

#Scenario Outline: validate user registration of OHRMS1
# When I Open "<Browser>"
# When I Open Ohrms Application
# 
# Examples:
# 
# |Browser|
# |CHROME|
# |IE|
# |FF|
 
 

#Scenario: validate user registration of OHRMS2
# When I Open  Browser
# When I Open Ohrms Application
# 
# Scenario: validate user registration of OHRMS3
# When I Open Browser
# When I Open Ohrms Application


#Inline parameter
#Outline parameter are called as datatables

Scenario: validate user registration of OHRMS
 When I Open "chrome"
 When I Open Application
 When I Wait For "Username" with "id-txtUsername" for "10" seconds
 And I Enter "Admin" into "Username" with "id-txtUsername"
 
# And I Enter Username
# When I Wait For Password
# And I Enter Password
# When I Wait For Login
# And I Click On Login
# When I Wait For Admin
# And I Click On Admin
# When I Wait For Add Button
# And I Click On Add Button
# When I Wait For Employee Name
# And I Enter Employee Name
# When Wait For Username
# And Enter Username
# When Wait For Password
# And Enter Password
# When Wait For Confirm Password
# And Enter Confirm Password
# When Wait For Save
# And Click On Save
# When CloseBrowser

# Scenario: validate user employee registration of OHRMS
# When I Open Browser
# When I Open Application
# When I Wait For Username
# And I Enter Username
# When I Wait For Password
# And I Enter Password
# When I Wait For Login
# And I Click On Login
# When I Wait For PIM
# And I Click On PIM
# When I Wait For Add Employee
# And I Click On Add Employee
# When I Wait For First Name
# And I Enter First Name
# When I Wait For Last Name
# And I Enter Last Name
# When Wait For Save
# And Click On Save
# When CloseBrowser
# 
# @test 
# Scenario: validate assign leave functionality of OHRMS
# When I Open Browser
# When I Open Application
# When I Wait For Username
# And I Enter Username
# When I Wait For Password
# And I Enter Password
# When I Wait For Login
# And I Click On Login
# When I Wait For Leave
# And I Click On Leave
# When I Wait For Assign Leave
# And I Click On Assign Leave
# When I Wait For into Employee Name
# And I Enter into Employee Name
# When I Hit Enter
# When I Wait For Leave Type
# And I Select Leave Type
# When I Wait For From Date
# And I Select From Date
# When I Wait For To Date
# And I Select To Date
# When I Hit Enter
## When I Wait For Partial Days
## And I Select Partial Days
# When I Wait For Comment
# And I Enter Comment
# When I Wait For Assign
# And I Click On Assign
# When CloseBrowser
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 