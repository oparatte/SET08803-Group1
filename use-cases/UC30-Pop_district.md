# USE CASE: 30 Produce a report with the population of a district, where the district is provided by the user.

## CHARACTERISTIC INFORMATION

### Goal in Context

As a *coordinator* I can get a *report with the population of a district, where the district is provided by the user*, so that I can *plan organisation resource allocation*.

### Scope

Organisation.

### Level

User goal.

### Preconditions

We know the district.  Database contains population levels of all districts.

### Success End Condition

The report shows the population of the district.

### Failed End Condition

The report is not generated.

### Primary Actor

Coordinator.

### Trigger

Coordinator is asked to allocate resources to the district.

## MAIN SUCCESS SCENARIO

1. Coordinator is asked to allocate resources to the district.
2. Coordinator captures which district is to have resources allocated.
3. Coordinator obtains the information from the database.
4. Report is produced for resource allocation.

## EXTENSIONS

**Information is not on the database**:

    1. Coordinator checks the details are correct.
    2. Coordinator informs logistics that the report failed.

## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0