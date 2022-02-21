# USE CASE: 31 Produce a report with the population of a city, where the city is provided by the user.

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *coordinator* I can get a report with *the population of a city*, where the city is provided by the user, so that I can plan organisation resource allocation

### Scope

Company.

### Level

Primary task.

### Preconditions

We know the cities.  We know which countries the cities are in.  Database contains the cities of all countries in the continent.

### Success End Condition

The report shows the population of cities in the chosen country.

### Failed End Condition

The report is not generated.
The report does not show the population of the cities.

### Primary Actor

Planner.

### Trigger

Planner needs to allocate resources for the cities.

## MAIN SUCCESS SCENARIO

1. Coordinator is asked to allocate resources to the city.
2. Coordinator captures which city is to have resources allocated.
3. Coordinator obtains the information from the database.
4. Report is produced for resource allocation.

## EXTENSIONS

**Information is not on the database**:

    1. Planner checks the details are correct.
    2. Planner contacts IT to ask for integrity check on database.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0