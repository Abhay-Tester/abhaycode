Feature: Todos Management website test

  Scenario: Add todo task
    Given User navigation to the todo management website
    When Enter name on todo field
    And User should be click on enter button
    And Verify generated todo name
    And Verify Count of todo

    
  Scenario: Add multiple todos
    Given User navigate to the todo management website
    When User should create multiple todos 
    When Verify Counts of todos
   
  Scenario: Mark a Todo as completed
    Given User navigatev to the todo  website
         When User should create 4 todos 
     When User should mark completed Todo
     

     Scenario: Delete Todo with assert verify
     Given User Navigate to the todo websiteA
     When User add todo
     When User delete todo
     
     
     Scenario: Count the number of completed Todos
     Given User Navigatev to the todo websiteB
     When User add todoB
     When Verify completed todo count


     Scenario: Count of all the Todos present
          Given User Navigatev to the todo websiteC
          When User add todoC
          When Verify the all tab todo count



     Scenario: Count of pending Todos
          Given User Navigatev to the todo websiteD
          When User add todoD
           When User should be completed some todo
           When Verify Pending todo count
     

