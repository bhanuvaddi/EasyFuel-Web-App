@SmartCityUsers
Feature: SmartCityUsers
  As a SmartCity customer
  I want to create different kind of Users
  So that users can access role based features in SmartCity

@Regression
Scenario Outline: navigate and verifying all SmartCity User pages are available
  Given I logged in to SmartCity account
   When I select "<User Page>"
   Then I am on the "<User Page>"
  Examples:
  |User Page              |
  |View Users             |
  |New Administration User|
  |New Power User         |
  |New Client Power User  |
  |New Help Desk User     |

@Regression
Scenario Outline: search for a user before/after creating one
  Given I logged in to SmartCity account
    And I am on the view users page
   When I search for a user "<Before or After>" creating
   Then I see "<Result>" results
  Examples:
  |Before or After|Result|
  |Before         |No    |
  |After          |Yes   |

@Smoke
Scenario Outline: create and verify different users
  Given I logged in to SmartCity account
   When I create a "<User Type>" user
   Then I can see "<User Type>" user is created
  Examples:
  |User Type        |User Type        |
  |Admin User       |Admin User       |
  |Power User       |Power User       |
  |Client Power User|Client Power User|
  |Help Desk User   |Help Desk User   |

@Regression
Scenario Outline: create different types of new users leaving mandatory fields blank
  Given I logged in to SmartCity account
    And I am on new "<user type>" user page
   When I leave "<mandatory fields>" blank
    And I try to create user
   Then I see "<result>"
  Examples:
  |mandatory fields|result                      |
  |All             |all fields required         |
  |Username        |username required           |
  |Password        |Password required           |
  |Confirm Password|Confirm Password required   |
  |Recovery Email  |Recovery Email required     |

@Regression
Scenario Outline: create different types of user with different culture
  Given I am on new "<user type>" user page
   When I supply all mandatory fields
    And I select "<culture name>" culture
   Then I can see "<user type>" user created with "<culture name>"
  Examples:
  |user type        |culture name|culture name|
  |Admin User       |English     |English     |
  |Power User       |Dutch       |Dutch       |
  |Client Power User|French      |French      |
  |Help Desk User   |German      |German      |

@Regression
Scenario Outline: create different types of user with different time zone
  Given I am on new "<user type>" user page
   When I supply all mandatory fields
    And I select time zone as "<time zone>"
   Then I can see "<user type>" user time zone as "<time zone>"
  Examples:
  |user type        |time zone|time zone  |
  |Admin User       |GMT      |GMT        |
  |Admin User       |GMT +1   |GMT +1     |
  |Admin User       |GMT -1   |GMT -1     |
  |Power User       |GMT      |GMT        |
  |Power User       |GMT +1   |GMT +1     |
  |Power User       |GMT -1   |GMT -1     |
  |Client Power User|GMT      |GMT        |
  |Client Power User|GMT +1   |GMT +1     |
  |Client Power User|GMT -1   |GMT -1     |
  |Help Desk User   |GMT      |GMT        |
  |Help Desk User   |GMT +1   |GMT +1     |
  |Help Desk User   |GMT -1   |GMT -1     |

@Extended
Scenario Outline: create admin user with different permissions
  Given I am on new administration user page
   When I supply all mandatory fields
    And I select permissions as "<permissions type>"
   Then I can see admin user with all permissions under "<permissions type>"
  Examples:
  |permissions type |permissions type |
  |Customers Cards  |Customers Cards  |
  |Contracts        |Contracts        |
  |Devices SAMs     |Devices SAMs     |
  |Users            |Users            |
  |System Monitoring|System Monitoring|

Scenario Outline: amend admin user permissions
  Given I have created "<user type>" user
    And I search for the newly created "<user type>" user
   When I select to modify the newly created "<user type>" user
    And I amend the permissions for the newly created "<user type>" user
   Then I can see "<user type>" user with amended permissions
  Examples:
    |user type        |user type        |user type        |user type        |user type        |
    |Admin User       |Admin User       |Admin User       |Admin User       |Admin User       |
    |Power User       |Power User       |Power User       |Power User       |Power User       |
    |Client Power User|Client Power User|Client Power User|Client Power User|Client Power User|
    |Help Desk User   |Help Desk User   |Help Desk User   |Help Desk User   |Help Desk User   |






