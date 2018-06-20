Feature: C85097 - Account Setup

  @accountsetup
  Scenario: Invite a patients teacher
    Given new caregiver is signed up sucessfully via API
    Given new patient is signed up sucessfully via API
    Given invite teacher URL is successfully created via API

    Given Invite teacher URL is successfully loaded
    Then Accept the invitation
    When validate Akili signup page is loaded
    Then enter new teacher credentials
    Then click signup button
    And enter first and last name
    And check I agree with terms of service and privacy policy
    And click Complete Signup
    And logout
    Then cleanup footprint using api

