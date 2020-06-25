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
 When I Wait For "Password" with "id-txtPassword" for "10" seconds
 And I Enter "admin123" into "Password" with "id-txtPassword" 
 When I Wait For "Login" with "id-btnLogin" for "10" seconds 
 And I Click On "Login" with "id-btnLogin"
 When I Wait For "Admin" with "id-menu_admin_viewAdminModule" for "10" seconds 
 And I Click On "Admin" with "id-menu_admin_viewAdminModule"
 When I Wait For "Add Button" with "name-btnAdd" for "10" seconds 
 And I Click On "Add Button" with "name-btnAdd"
 When I Wait For "Employee Name" with "id-systemUser_employeeName_empName" for "10" seconds
 And I Enter "Hannah Flores" into "Employee Name" with "id-systemUser_employeeName_empName" 
 When I Wait For "System Username" with "id-systemUser_userName" for "10" seconds
 And I Enter "hybriduser6" into "System Username" with "id-systemUser_userName"
 When I Wait For "System Password" with "name-systemUser[password]" for "10" seconds
 And I Enter "hybriduser123" into "System Username" with "name-systemUser[password]"
 When I Wait For "System Confirm Password" with "name-systemUser[confirmPassword]" for "10" seconds
 And I Enter "hybriduser123" into "System Confirm Password" with "name-systemUser[confirmPassword]"
 When I Wait For "Save Button" with "id-btnSave" for "10" seconds 
 And I Click On "Save Button" with "id-btnSave"
 When CloseBrowser
 
 
@test2
 Scenario Outline: validate user registration2 of OHRMS
 When I Open "chrome"
 When I Open Application
 When I Wait For "Username" with "id-txtUsername" for "<Waittime>" seconds
 And I Enter "<Uname>" into "Username" with "id-txtUsername"
 When I Wait For "Password" with "id-txtPassword" for "<Waittime>" seconds
 And I Enter "<Pwd>" into "Password" with "id-txtPassword" 
 When I Wait For "Login" with "id-btnLogin" for "<Waittime>" seconds 
 And I Click On "Login" with "id-btnLogin"
 When I Wait For "Admin" with "id-menu_admin_viewAdminModule" for "<Waittime>" seconds 
 And I Click On "Admin" with "id-menu_admin_viewAdminModule"
 When I Wait For "Add Button" with "name-btnAdd" for "<Waittime>" seconds 
 And I Click On "Add Button" with "name-btnAdd"
 When I Wait For "Employee Name" with "id-systemUser_employeeName_empName" for "<Waittime>" seconds
 And I Enter "<EmpName>" into "Employee Name" with "id-systemUser_employeeName_empName" 
 When I Wait For "System Username" with "id-systemUser_userName" for "<Waittime>" seconds
 And I Enter "<System Username>" into "System Username" with "id-systemUser_userName"
 When I Wait For "System Password" with "name-systemUser[password]" for "<Waittime>" seconds
 And I Enter "<System Password>" into "System Username" with "name-systemUser[password]"
 When I Wait For "System Confirm Password" with "name-systemUser[confirmPassword]" for "<Waittime>" seconds
 And I Enter "<System Password>" into "System Confirm Password" with "name-systemUser[confirmPassword]"
 When I Wait For "Save Button" with "id-btnSave" for "<Waittime>" seconds 
 And I Click On "Save Button" with "id-btnSave"
 When CloseBrowser
 
 Examples:
 
 |Uname|Pwd|Waittime|EmpName|System Username|System Password|
 |Admin|admin123|10|Hannah Flores|hybriduser7|hybriduser123|
 |Admin|admin123|10|John Smith|hybriduser8|hybriduser1234|
 |Admin|admin123|10|Steven Edwards|hybriduser9|hybriduser1235|
 
 
 
 
 
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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 