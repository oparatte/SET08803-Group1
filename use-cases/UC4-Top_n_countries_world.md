# USE CASE: 4 Produce a report with the top N populated countries in a continent, where N is provided by me.

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *planner* I need to generate a *report with the top N populated countries in a continent, where N is provided by me*, so that I can *plan organisation resource allocation*.

### Scope

Company.

### Level

Primary task.

### Preconditions

We know how many countries we want.  We know which continent the countries are in.  Database contains population levels of all countries in the continent.

### Success End Condition

The report shows the top N populated countries in the chosen continent.

### Failed End Condition

The report is not generated.
The report does not show the top N populated countries.

### Primary Actor

Planner.

### Trigger

Planner needs to allocate resources for the continent.

## MAIN SUCCESS SCENARIO

1. Planner has to allocate resources for the continent.
2. Planner understands the continent and number of countries to have resources allocated.
3. Planner obtains the information from the database.
4. Report is produced to allow planning to proceed.

## EXTENSIONS

**Information is not on the database**:

    1. Planner checks the details are correct.
    2. Planner contacts IT to ask for integrity check on database.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0