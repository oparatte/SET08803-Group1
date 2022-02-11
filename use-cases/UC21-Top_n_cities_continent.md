# USE CASE: 21 Produce a report with the top N populated capital cities in a region where N is provided by the user.

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *planner* I can generate a *report with the top N populated capital cities in a region where N is provided by the user*, so that I can *estimate supplies needs*.

### Scope

Organisation.

### Level

User goal.

### Preconditions

We know which region.  We know how many capital cities the user wants.  Database contains population levels of all capital cities in the region.

### Success End Condition

The report shows the top N populated capital cities in the region.

### Failed End Condition

The report is not generated.  The report does not show the top N populated cities.

### Primary Actor

Planner.

### Trigger

The planner is asked to provide an estimate for supply requirements.

## MAIN SUCCESS SCENARIO

1. Planner is asked for estimated supply requirements.
2. Planner captures which region and how many cities required.
3. Planner obtains the information from the database.
4. Report is produced.

## EXTENSIONS

**Information is not on the database**:

    1. Planner checks the details are correct.
    2. Planner informs user that the report failed.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0